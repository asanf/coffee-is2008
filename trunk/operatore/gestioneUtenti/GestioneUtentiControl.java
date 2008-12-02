package operatore.gestioneUtenti;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import java.rmi.*;
import java.rmi.server.*;

/**
 * Classe che modella il control per la gestione degli utenti.
 * @author Vincenzo Alessandro Cavaso
 */
public class GestioneUtentiControl extends UnicastRemoteObject implements GestioneUtentiControlInterface{

    public GestioneUtentiControl() throws RemoteException {
        super();
    }
    
    /**
     * 
     * @param nuovoUtente
     * @throws java.rmi.RemoteException
     */
    public void riceviRichiestaAggiuntaAccount(UtenteRegistrato nuovoUtente) throws RemoteException{
        ObjectOutputStream out;
        try{
            out= new ObjectOutputStream(new FileOutputStream("richiesteAccount.dat",true));
            out.writeObject(nuovoUtente);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void visualizzaCodaRichieste() throws RemoteException{
        
    }
    
    /**
     * Ricerca un utente registrato nel database
     * @param matricola, la matricola dell'utente ricercato
     * @param surname, il cognome dell'utente ricercato
     * @param name, il nome dell'utente ricercatp
     * @return, un vettore con i risultati della ricerca
     */
    public Vector <UtenteRegistrato> ricercaUtenteRegistrato(String matricola, String surname,String name){
        Connection con;
        Statement query;
        ResultSet result;
        Vector<UtenteRegistrato> utenti = new Vector<UtenteRegistrato>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Errore nel caricamento driver jdbc:\n"+e);
        }
        try{
              con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
              query = con.createStatement();
              result = query.executeQuery("SELECT * FROM utente_registrato WHERE matricola LIKE '%"+ matricola +"%' OR cognome LIKE '%" + surname+"%' OR nome LIKE '%" + name+"%'");
              while(result.next()){
                  UtenteRegistrato tmp = new UtenteRegistrato();
                  tmp.setCognome(result.getString("cognome"));
                  tmp.setDataNascita(result.getString("data_nascita"));
                  tmp.setIndirizzo(result.getString("indirizzo"));
                  tmp.setLogin(result.getString("username"));
                  tmp.setMatricola(result.getString("matricola"));
                  tmp.setNome(result.getString("nome"));
                  tmp.setPassword(result.getString("password"));
                  utenti.add(tmp);
              }
        }
        catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Errore durante la connessione al database" + e);
        }
        return utenti;
    } 
    
    public boolean checkUsernameUtente(String login) throws RemoteException{
        boolean esito=false;
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
           Statement query = con.createStatement();
           ResultSet result;
           result= query.executeQuery("SELECT * FROM utente_registrato WHERE username = '"+login+"'");  
           while (result.next()){
           String risultato= (result.getString("username"));
           esito = risultato.equals(login);
           }       
          
        }
       catch(Exception e){
           e.printStackTrace();
       }
        return esito;
    }
    
    /**
     * Regista un nuovo utente all'interno del database
     * @param newUtente, l'utente registrato all'interno del database
     * @param indice, l'indice che rappresenta il tipo di utente
     * @param campoAggiuntivo, il valore dell'attributo specifico del tipo dell'utente
     */
    public void creaUtenteRegistrato(UtenteRegistrato newUtente, int indice, String campoAggiuntivo) throws RemoteException{
      try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
           Statement query = con.createStatement();
           int esito;
           esito = query.executeUpdate("INSERT INTO utente_registrato(username,password,cognome,nome,data_nascita,indirizzo,matricola)" +
                   " VALUES ('" +
                   newUtente.getLogin() +"','" +
                   newUtente.getPassword() + "','" + 
                   newUtente.getCognome() + "','" +
                   newUtente.getNome() + "','" +
                   newUtente.getDataNascita() + "','" +
                   newUtente.getIndirizzo() + "','" +
                   newUtente.getMatricola() +"')");
      
            if (indice == 0) {
                esito = query.executeUpdate("INSERT INTO studente(matricola,anno_iscrizione)"+
                        " VALUES ('"+
                        newUtente.getMatricola() + "','"+
                        campoAggiuntivo + "')");
            }
            if (indice == 1) {
                esito = query.executeUpdate("INSERT INTO docente(matricola,tipo_contratto)"+
                        " VALUES ('"+
                        newUtente.getMatricola() + "','"+
                        campoAggiuntivo + "')");
            }
            if (indice == 2) {
                esito = query.executeUpdate("INSERT INTO operatore(matricola,data_registrazione)"+
                        " VALUES ('"+
                        newUtente.getMatricola() + "','"+
                        campoAggiuntivo + "')");
            }
                   
           con.close();
            if(esito==1){
                JOptionPane.showMessageDialog(null, "Utente Registrato inserito correttamente");
            } else {
                JOptionPane.showMessageDialog(null, "Utente Registrato inserimento esame");
            }
      }
           catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
    }
  
    /**
     * Elimina un utente registrato dal database
     * @param utente, l'utente da eliminare
     * @throws java.rmi.RemoteException, lanciata quando si verifica un errore nella connessione remota
     */
    public void eliminaUtenteRegistrato (UtenteRegistrato utente) throws RemoteException{
         try{
              Class.forName("com.mysql.jdbc.Driver");
          }catch(ClassNotFoundException e){
              JOptionPane.showMessageDialog(null, "Errore nel caricamento driver jdbc:\n"+e);
          }
          try{
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
              Statement query = con.createStatement();
              int result = query.executeUpdate("DELETE FROM utente_registrato WHERE matricola ='"+utente.getMatricola()+"'");
              if(result==query.EXECUTE_FAILED){
                  JOptionPane.showMessageDialog(null, "Errore durante l'eliminazione dell'utente");
              }else {
                  JOptionPane.showMessageDialog(null, "Utente eliminato correttamente");
              }
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Errore durante la connessione al database"+e);
          }
    }
    
    /**
     * Modifica un utente nel database
     * @param old,l'utente presente nel database che deve essere modificato
     * @param utente, l'utente modificato da inserire nel database
     * @throws java.rmi.RemoteException, lanciata quando si verifica un errore di connessione remota
     */
    public void modificaUtenteRegistrato (UtenteRegistrato old, UtenteRegistrato utente) throws RemoteException{
        try{
              Class.forName("com.mysql.jdbc.Driver");
          }catch(ClassNotFoundException e){
              JOptionPane.showMessageDialog(null, "Errore nel caricamento driver jdbc:\n"+e);
          }
          try{
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
              Statement query = con.createStatement();
              int result = query.executeUpdate("UPDATE utente_registrato SET " +
                      "nome='" + utente.getNome() + "'" +
                      ",cognome='" + utente.getCognome() +"'" +
                      ",data_nascita='" + utente.getDataNascita()+ "'" +
                       ",indirizzo='" + utente.getIndirizzo() + "'"+
                       ",username='" + utente.getLogin() + "'" +
                       ",matricola='" + utente.getMatricola() + "'" +
                       ",password='" + utente.getPassword()+"'"+
                       "WHERE nome='" + old.getNome()+"'");
              if(result==query.EXECUTE_FAILED){
                  JOptionPane.showMessageDialog(null, "Errore durante l'aggiornamento dell'utente");
              }else {
                  JOptionPane.showMessageDialog(null, "Utente modificato correttamente");
              }
          }
           catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Errore durante la connessione al database"+e);
          }
    }

    public Vector<UtenteRegistrato> ricercaUtente(String matricola, String surname, String name) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
