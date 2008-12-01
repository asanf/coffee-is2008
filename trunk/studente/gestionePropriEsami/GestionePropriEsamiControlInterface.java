package studente.gestionePropriEsami;

import operatore.gestioneAppelli.Appello;
import operatore.gestioneUtenti.Studente;
import java.rmi.*;
import java.rmi.server.*;
/**
 *
 * @author 
 */
public interface GestionePropriEsamiControlInterface extends Remote{

    void prenotaEsame(Appello appello, Studente studente) throws RemoteException;

    void richiediPrenotazioneAppello() throws RemoteException;

    void visualizzaAppelliDisponibili(Studente studente) throws RemoteException;

}
