package system;
import java.rmi.*;
import java.rmi.server.*;
import operatore.gestioneUtenti.UtenteRegistrato;


public interface LoginControlInterface extends Remote{

    UtenteRegistrato checkLogin(String username, String password) throws RemoteException;

    void richiediAggiuntaAccount() throws RemoteException;

}
