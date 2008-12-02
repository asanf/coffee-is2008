package studente.gestionePropriEsami;

import operatore.gestioneAppelli.Appello;
import operatore.gestioneUtenti.Studente;
import java.rmi.*;
import java.rmi.server.*;
/**
 * Classe che gestisce l'interfaccia remota di GestioneProprioEsamiControl
 * @author Demia Massaro
 */
public interface GestionePropriEsamiControlInterface extends Remote{

    void prenotaEsame(Appello appello, Studente studente) throws RemoteException;

    void visualizzaAppelliDisponibili(Studente studente) throws RemoteException;

}
