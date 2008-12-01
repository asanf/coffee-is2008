package operatore.gestioneUtenti;

import java.rmi.RemoteException;
import java.util.Vector;
import java.rmi.*;

/**
 *
 * @author 
 */
public interface GestioneUtentiControlInterface extends Remote{

    boolean checkUsernameUtente(String login) throws RemoteException;

    /**
     * Regista un nuovo utente all'interno del database
     * @param newUtente
     * @param indice
     * @param campoAggiuntivo
     */
    void creaUtenteRegistrato(UtenteRegistrato newUtente, int indice, String campoAggiuntivo) throws RemoteException;

    void eliminaUtenteRegistrato(UtenteRegistrato utente) throws RemoteException;

    void modificaUtenteRegistrato(UtenteRegistrato old, UtenteRegistrato utente) throws RemoteException;

    Vector<UtenteRegistrato> ricercaUtente(String matricola, String surname, String name) throws RemoteException;

    Vector<UtenteRegistrato> ricercaUtenteRegistrato(String matricola, String surname, String name) throws RemoteException;

    void riceviRichiestaAggiuntaAccount(UtenteRegistrato nuovoUtente) throws RemoteException;

    void visualizzaCodaRichieste() throws RemoteException;

}
