
package operatore.gestioneEsami;

import java.util.Vector;
import java.sql.*;
import javax.swing.JOptionPane;
import java.rmi.*;
import java.rmi.server.*;
/**
 * Classe che modella l'oggetto control che interagisce con l'entity esame
 * @author Vincenzo Alessandro Cavaso
 */
public class EsameControl extends UnicastRemoteObject implements EsameControlInterface{

    
    public EsameControl() throws RemoteException{
        super();
    }
    
    /**
     * Inserisce un esame nel database
     * @param esame, l'esame da inserire nel database
     * @throws java.rmi.RemoteException, lanciata qunado si verifica un errore di connessione remota
     */
    public void creaEsame(Esame esame) throws RemoteException{
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
    
    /**
     * Modifica un esame nel database
     * @param old, l'esame presente nel database che verrà sostituito
     * @param modified, l'esame con i dati modificati
     * @throws java.rmi.RemoteException, lanciata quando si verifica un errore di connessione remota
     */
    public void modificaEsame(Esame old,Esame modified) throws RemoteException{
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
    /**
     * Elimina un esame dal database
     * @param esame, l'esame da rimuovere
     * @throws java.rmi.RemoteException
     */
    public void eliminaEsame(Esame esame) throws RemoteException{
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
    /**
     * Ricerca un esame nel database
     * @param nomeEsame, il nome dell'esame da ricercare
     * @return, un vettore con il risultato della ricerca
     * @throws java.rmi.RemoteException, lanciata quando si verifica un errore nella connessione
     */
    public Vector<Esame> ricercaEsame(String nomeEsame) throws RemoteException{
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
