
package operatore.gestioneAppelli;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
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
                    Appello tmp = new Appello();
                    tmp.setEsame(result.getString("esame"));
                    tmp.setData(result.getString("data"));
                    tmp.setDocente(result.getString("docente"));
                    tmp.setTipologia(result.getString("tipologia"));
                    tmp.setOraInizio(result.getString("ora_inizio"));
                    tmp.setDurata(result.getInt("durata"));
                    tmp.setVincoli(result.getString("vincoli"));
                    tmp.setAula(result.getString("aula"));
                    tmp.setCodice(result.getInt("codice"));
                    appelli.add(tmp);
            }
        con.close();   
    }
    
    public int getColumnCount() {
        return 8;
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
            case 7: return tmp.getCodice();
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
            case 7: return "Codice Appello";
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
    
    public void caricaRichieste(){
        String fileName = "richieste_aggiunta_appello.dat";
        ObjectInputStream in = null;
        try{
            in = new ObjectInputStream(new FileInputStream(fileName));
            Appello tmp = (Appello)in.readObject();
            while(tmp!=null){
                appelli.add(tmp);
                tmp = (Appello)in.readObject();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Errore apertura file "+ e);
        }
        fireTableDataChanged();
    }
    
}
