package operatore.gestioneAppelli;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import operatore.gestioneAppelli.Appello;
import operatore.gestioneUtenti.Docente;
/**
 *
 * @author 
 */
public class AppelloControl {

    public void aggiungiAppello(Appello appello){
        
    }
    
    public void modificaAppello(Appello old, Appello modified){
        try{
              Class.forName("com.mysql.jdbc.Driver");
          }catch(ClassNotFoundException e){
              JOptionPane.showMessageDialog(null, "Errore nel caricamento driver jdbc:\n"+e);
          }
          try{
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
              Statement query = con.createStatement();
                       
              
              int result = query.executeUpdate("UPDATE appello SET " +
                                               "tipologia='"+modified.getTipologia()+"' " +
                                               ",data='"+modified.getData()+"' " +
                                               ",durata ="+modified.getDurata()+" " +
                                               ",vincoli ='"+modified.getVincoli()+"' " +
                                               ",ora_inizio='"+modified.getOraInizio()+"' " +
                                               ",aula='"+modified.getAula()+"' " +
                                               ",esame='"+modified.getEsame()+"' " +
                                               "WHERE codice='"+old.getCodice()+"'");
              if(result==query.EXECUTE_FAILED){
                  JOptionPane.showMessageDialog(null, "Errore durante l'aggiornamento dell'appello");
              }else {
                  JOptionPane.showMessageDialog(null, "Appello modificato correttamente");
              }
              con.close();
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Errore durante la connessione al database\n"+e);
          }
    }
    
    public Vector<Appello> ricercaAppello(String attributo, String valore){
        Connection con;
        Statement query;
        ResultSet result;
        Vector<Appello> appelli = new Vector<Appello>();
        try{
              Class.forName("com.mysql.jdbc.Driver");
          }catch(ClassNotFoundException e){
              JOptionPane.showMessageDialog(null, "Errore nel caricamento driver jdbc:\n"+e);
          }
        try{
              con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
              query = con.createStatement();
              if(attributo.equals("docente")) attributo = "cognome";
              result = query.executeQuery("SELECT * FROM appello,utente_registrato " +
                      "WHERE docente = matricola AND "+attributo+" LIKE '%"+valore+"%'");
              while(result.next()){
                  Appello appello = new Appello();
                  appello.setEsame(result.getString("esame"));
                  appello.setAula(result.getString("aula"));
                  appello.setData(result.getString("data"));
                  appello.setDurata(result.getInt("durata"));
                  appello.setOraInizio(result.getString("ora_inizio"));
                  appello.setTipologia(result.getString("tipologia"));
                  appello.setDocente(result.getString("cognome"));
                  appello.setVincoli(result.getString("vincoli"));
                  appelli.add(appello);
              }
              con.close();
        }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Errore durante la connessione al database" + e);
        }
        return appelli; 
    }
    
    public Vector<Appello> ricercaPropriAppelli(Docente docente) {
        Connection con;
        Statement query;
        ResultSet result;
        Vector<Appello> appelli=new Vector<Appello>();
         try{
              Class.forName("com.mysql.jdbc.Driver");
          }catch(ClassNotFoundException e){
              JOptionPane.showMessageDialog(null, "Errore nel caricamento driver jdbc:\n"+e);
          }
         try{
              con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
              query = con.createStatement();
              result = query.executeQuery("select *" +
                                          "from appello " +
                                          "where docente='"+docente.getMatricola()+"'");
              
         while(result.next()){
             Appello appello= new Appello();
             appello.setEsame("esame");
             appello.setData("data");
             appello.setOraInizio("oraInizio");
             appello.setTipologia("tipologia");
             appello.setDocente("docente");
             appello.setVincoli("vincoli");
             appello.setAula("aula");
             appelli.add(appello);             
         }
              con.close();
         }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Errore durante la connessione al database" + e);
        }
       return appelli;
    }
}