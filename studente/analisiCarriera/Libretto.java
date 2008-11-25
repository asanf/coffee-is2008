package studente.analisiCarriera;
import java.util.Vector;
import java.util.Iterator;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import operatore.gestioneUtenti.Studente;

/**
 * Classe che modella il libretto di uno studente.
 * E' una vista dell'entità libretto presente nel database.
 * @author
 */
public class Libretto extends AbstractTableModel {

    private Vector<RisultatoEsame> listaEsami;

    public Libretto(String matricola) {
        ResultSet result = null;
        listaEsami = new Vector<RisultatoEsame>();
        try{
            result = loadDataFromDataBase(matricola);
            while(result.next()){
                RisultatoEsame tmp = new RisultatoEsame(
                        result.getString("esame"),
                        result.getInt("voto"),
                        result.getBoolean("lode"),
                        result.getString("data"));
                listaEsami.add(tmp);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }
    
    public ResultSet loadDataFromDataBase(String matricola) throws SQLException{
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
        
        result = query.executeQuery("SELECT * FROM libretto");
        
        return result;
    }
    
    public void saveDataOnDataBase() throws SQLException{
        //TODO implementare update
    }
    
    
    public int getNumEsami(){
        return listaEsami.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public int getRowCount() {
        return listaEsami.size();
    }

    @Override
    public Class<?> getColumnClass(int column) {
        return getValueAt(0,column).getClass();
    }

    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "Esame";
            case 1: return "Voto";
            case 2: return "Lode";
            case 3: return "Data";
            default: return "";
        }
    }
    
    public Iterator<RisultatoEsame> iterator(){
        return listaEsami.iterator();
    }
    
    public Object getValueAt(int row, int columns) {
        
        RisultatoEsame tmp = listaEsami.get(row);
        
        switch(columns){
            case 0: return tmp.getEsame();
            case 1: return tmp.getVoto();
            case 2: return tmp.isLode();
            case 3: return tmp.getData();
            default: return "";
        }
    }

    @Override
    public boolean isCellEditable(int arg0, int arg1) {
        return false;
    }
    
    
    
}
