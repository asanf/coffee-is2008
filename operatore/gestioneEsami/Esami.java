package operatore.gestioneEsami;

import java.util.Vector;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 
 */
public class Esami extends AbstractTableModel{
    
    private Vector<Esame> esami;
    
    public Esami(){
        esami = new Vector<Esame>();
         try{
            loadDataFromDataBase();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Errore connessione jdbc\n"+e);
        }
    }

    public void setData(Vector<Esame> esami){ 
        this.esami = esami;
        fireTableDataChanged();
    }
    
    public void loadDataFromDataBase() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Errore nel caricare il driver jdbc\n"+e);
        }
       
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
            Statement query = con.createStatement();
            ResultSet result = query.executeQuery("SELECT * FROM esame");
        
            while(result.next()){
                Esame tmp = new Esame();
                tmp.setNome(result.getString("nome"));
                tmp.setCrediti(result.getInt("crediti"));
                tmp.setOreFrontali(result.getInt("ore_frontali"));
                tmp.setOreLaboratoro(result.getInt("ore_laboratorio"));
                tmp.setSemestre(result.getInt("semestre"));
                tmp.setProgramma(result.getString("programma"));
                esami.add(tmp);
            }
        
    }

    public int getColumnCount() {
        return 6;
    }

    public int getRowCount() {
        return esami.size();
    }

    public Object getValueAt(int row, int column) {
        Esame tmp = esami.get(row);
        switch(column){
            case 0: return tmp.getNome();
            case 1: return tmp.getCrediti();
            case 2: return tmp.getSemestre();
            case 3: return tmp.getOreFrontali();
            case 4: return tmp.getOreLaboratoro();
            case 5: return tmp.getProgramma();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Nome";
            case 1: return "Crediti";
            case 2: return "Semestre";
            case 3: return "Ore Frontali";
            case 4: return "Ore Laboratorio";
            case 5: return "Programma";
            default: return null;
        }
    }

    @Override
    public boolean isCellEditable(int arg0, int arg1) {
        return false;
    }    
    
    public Esame get(int row){
        return esami.get(row);
    }
}
