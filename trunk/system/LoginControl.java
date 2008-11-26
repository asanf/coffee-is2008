package system;

import java.sql.*;
import javax.swing.JOptionPane;
import operatore.gestioneUtenti.UtenteRegistrato;
import operatore.gestioneUtenti.UtentiRegistrati;
/**
 *
 * @author 
 */
public class LoginControl {
    
    public UtenteRegistrato checkLogin(String username,String password){
        UtentiRegistrati utenti = new UtentiRegistrati();
        UtenteRegistrato utente = null;
        try{
          utente = utenti.getUtente(username, password);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Errore connessione al database\n"+e);
        }
        return utente;
    }
    
    public void richiediAggiuntaAccount(){
        
    }

}
