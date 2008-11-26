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
        }
        
    }

    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object getValueAt(int arg0, int arg1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
