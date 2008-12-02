package operatore.gestioneAppelli;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import operatore.gestioneUtenti.Docente;
import java.rmi.*;
import java.rmi.server.*;
/**
 *Classe che modella l'oggetta control che interagisce con l'entity Appello
 * @author Antonio Sanfelice
 */
public class AppelloControl extends UnicastRemoteObject implements AppelloControlInterface {

    public AppelloControl() throws RemoteException{
        super();
    }
    
    /**
     * Inserisce un appello nel database
     * @param appello, l'appello da inserire nel database
     * @throws java.rmi.RemoteException, lanciata quando si verifica una errore nella connessione remota
     */
    public void aggiungiAppello(Appello appello) throws RemoteException{
        
    }
    
    /**
     * Modifica un appello già esistente
     * @param old, l'appello esitente
     * @param modified, l'appello modificato
     * @throws java.rmi.RemoteException
     */
    public void modificaAppello(Appello old, Appello modified) throws RemoteException{
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
    
    /**
     * Ricerca gli appelli esitenti nel database
     * @param attributo, l'attributo su cui viene effettuata la ricerca
     * @param valore, il valore dell'attributo su cui viene effettuata la ricerca
     * @return, un vettore con gli appelli trovati
     * @throws java.rmi.RemoteException, lanciata quando si verifica un errore nella connessione remota
     */
    public Vector<Appello> ricercaAppello(String attributo, String valore) throws RemoteException{
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
    /**
     * Ricerca gli appelli di un dato docente
     * @param docente, il docente di cui si vogliono ricercare gli appello
     * @return un vettore con gli appelli del docente passato
     * @throws java.rmi.RemoteException, lanciata quando si verifica un errore di connessione remota
     */
    public Vector<Appello> ricercaPropriAppelli(Docente docente) throws RemoteException {
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
             appello.setEsame(result.getString("esame"));
             appello.setData(result.getString("data"));
             appello.setOraInizio(result.getString("ora_inizio"));
             appello.setTipologia(result.getString("tipologia"));
             appello.setDocente(result.getString("docente"));
             appello.setVincoli(result.getString("vincoli"));
             appello.setAula(result.getString("aula"));
             appello.setCodice(result.getInt("codice"));
             appelli.add(appello);             
         }
              con.close();
         }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Errore durante la connessione al database" + e);
        }
       return appelli;
    }
    
    /**
     * Apre il file in append e aggiunge l'appello da inserire nel database 
     * @param appello, 
     * @throws java.io.FileNotFoundException
     * @throws java.rmi.RemoteException
     */
    public void riceviRichiestaAggiuntaAppello(Appello appello) throws FileNotFoundException,RemoteException{
        ObjectOutputStream out=null;
        String fileName = "richieste_aggiunta_appello.dat";
        try{
            out = new ObjectOutputStream(new FileOutputStream(fileName,true));
            out.writeObject(appello);
            out.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Errore durante il salvataggio della richiesta!\nRiprovare.");
        }
    }
}