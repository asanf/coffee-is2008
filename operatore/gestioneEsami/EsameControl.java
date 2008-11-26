
package operatore.gestioneEsami;

import java.util.Vector;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 * Classe che modella il control dell'esame
 * @author 
 */
public class EsameControl {

    
    protected void creaEsame(Esame esame){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
            Statement query = con.createStatement();
            int esito;
            esito = query.executeUpdate("INSERT INTO esame(nome,ore_laboratorio,ore_frontali,crediti,programma,semestre)"+
                                        " VALUES ('" +
                                        esame.getNome() + "'," +
                                        esame.getOreLaboratoro() + "," +
                                        esame.getOreFrontali() + "," + 
                                        esame.getCrediti() + ",'" + 
                                        esame.getProgramma() + "'," +
                                        esame.getSemestre() +")");
                       
            if(esito==1){
                JOptionPane.showMessageDialog(null, "Esame inserito correttamente");
            } else {
                JOptionPane.showMessageDialog(null, "Errore inserimento esame");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Errore nella creazione dell'esame "+e);
        }
    }
    
    protected void modificaEsame(){
    }
    
    protected void eliminaEsame(){
        
    }
    
    public Vector<Esame> ricercaEsame(){
        return null;
    }
}
