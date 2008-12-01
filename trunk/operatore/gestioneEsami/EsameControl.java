
package operatore.gestioneEsami;

import java.util.Vector;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 * Classe che modella l'oggetto control che interagisce con l'entity esame
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
            con.close();
            if(esito==1){
                JOptionPane.showMessageDialog(null, "Esame inserito correttamente");
            } else {
                JOptionPane.showMessageDialog(null, "Errore inserimento esame");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    protected void modificaEsame(Esame old,Esame modified){
          try{
              Class.forName("com.mysql.jdbc.Driver");
          }catch(ClassNotFoundException e){
              JOptionPane.showMessageDialog(null, "Errore nel caricamento driver jdbc:\n"+e);
          }
          try{
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
              Statement query = con.createStatement();
              int result = query.executeUpdate("UPDATE esame SET " +
                                               "nome='"+modified.getNome()+"' " +
                                               ",ore_laboratorio="+modified.getOreLaboratoro()+" " +
                                               ",ore_frontali="+modified.getOreFrontali()+" " +
                                               ",crediti ="+modified.getCrediti()+" " +
                                               ",semestre="+modified.getSemestre()+" " +
                                               ",programma='"+modified.getProgramma()+"' " +
                                               "WHERE nome='"+old.getNome()+"'");
              if(result==query.EXECUTE_FAILED){
                  JOptionPane.showMessageDialog(null, "Errore durante l'aggiornamento dell'esame");
              }else {
                  JOptionPane.showMessageDialog(null, "Esame modificato correttamente");
              }
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Errore durante la connessione al database\n"+e);
          }
        
        
    }
    
    protected void eliminaEsame(Esame esame){
          try{
              Class.forName("com.mysql.jdbc.Driver");
          }catch(ClassNotFoundException e){
              JOptionPane.showMessageDialog(null, "Errore nel caricamento driver jdbc:\n"+e);
          }
          try{
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
              Statement query = con.createStatement();
              int result = query.executeUpdate("DELETE FROM esame WHERE nome='"+esame.getNome()+"'");
              if(result==query.EXECUTE_FAILED){
                  JOptionPane.showMessageDialog(null, "Errore durante l'eliminazione dell'esame");
              }else {
                  JOptionPane.showMessageDialog(null, "Esame eliminato correttamente");
              }
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Errore durante la connessione al database"+e);
          }
    }
    
    public Vector<Esame> ricercaEsame(String nomeEsame){
        Connection con;
        Statement query;
        ResultSet result;
        Vector<Esame> esami = new Vector<Esame>();
        try{
              Class.forName("com.mysql.jdbc.Driver");
          }catch(ClassNotFoundException e){
              JOptionPane.showMessageDialog(null, "Errore nel caricamento driver jdbc:\n"+e);
          }
        try{
              con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
              query = con.createStatement();
              result = query.executeQuery("SELECT * FROM esame WHERE nome LIKE '%"+nomeEsame+"%'");
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
        }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Errore durante la connessione al database" + e);
        }
        return esami; 
    }
}
