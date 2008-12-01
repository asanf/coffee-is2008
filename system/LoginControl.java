package system;

import java.sql.*;
import javax.swing.JOptionPane;
import operatore.gestioneUtenti.UtenteRegistrato;
import operatore.gestioneUtenti.UtentiRegistrati;
import java.rmi.*;
import java.rmi.server.*;
/**
 *
 * @author 
 */
public class LoginControl extends UnicastRemoteObject implements LoginControlInterface {
    
    public LoginControl() throws RemoteException {
        super();
    }
    
    public UtenteRegistrato checkLogin(String username,String password){
        if(username.equals("g.cristo") && password.equals("m4r14"))
        {
            JOptionPane.showMessageDialog(null, "Senti, non mi interessa di chi sei figlio, \nper entrare qui devi avere un account.\nChiedilo e ne riparliamo.");
            return null;
        }else if(username.equals("manny.calavera") && password.equals("ddm")){
            JOptionPane.showMessageDialog(null, "Se il ddm sta usando questo software\nse la deve passare proprio male...");
            return null;
        }else if(username.equals("g.threepwood") && password.equals("monkey")){
            JOptionPane.showMessageDialog(null, "Anche se può sembrarlo,\nquesto NON è un punta e clicca.");
        }
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
