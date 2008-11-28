
package operatore.gestioneAppelli;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Classe che modella una lista di appelli, visualizzabile tramite una JTable
 * @author
 */
public class Appelli extends AbstractTableModel{

    private Vector<Appello> appelli;
    
    public Appelli()
    {
        appelli = new Vector<Appello>();
        try{
             loadDataFromDataBase();
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Errore nella connessione al database\n"+e);
        }
    }

    /**
     * Metodo che carica i dati di un appello dal database
     * @throws java.sql.SQLException, lanciata quando fallisce la connessione col
     * database
     */
    public void loadDataFromDataBase() throws SQLException{
        Connection con;
        Statement query;
        ResultSet result;
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
        con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
        query = con.createStatement();
        
        result = query.executeQuery("SELECT * FROM appello,utente_registrato " +
                                    "WHERE docente = matricola");
        while(result.next())
            {
                    Appello tmp = new Appello(
                    result.getString("codice"),
                    result.getString("esame"),
                    result.getString("data"),
                    result.getString("cognome"),
                    result.getString("tipologia"),
                    result.getString("ora_inizio"),
                    result.getInt("durata"),
                    result.getString("vincoli"),
                    result.getString("aula"));
                    
                    appelli.add(tmp);
            }
        con.close();   
    }
    
    public int getColumnCount() {
        return 7;
    }

    public int getRowCount() {
        return appelli.size();
    }

    public Object getValueAt(int row, int column) {
        Appello tmp = appelli.get(row);
        switch(column){
            case 0: return tmp.getEsame();
            case 1: return tmp.getData();
            case 2: return tmp.getOraInizio();
            case 3: return tmp.getTipologia();
            case 4: return tmp.getDocente();
            case 5: return tmp.getVincoli();
            case 6: return tmp.getAula();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Esame";
            case 1: return "Data";
            case 2: return "Ore";
            case 3: return "Tipo";
            case 4: return "Docente";
            case 5: return "Vincoli";
            case 6: return "Aula";
            default: return null;
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    
    public Appello get(int row){
        return appelli.get(row);
    }
    
    public void setData(Vector<Appello> appelli)
    {
        this.appelli = appelli;
        fireTableDataChanged();
    }
    
}
