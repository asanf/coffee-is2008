package docente.gestionePropriAppelli;

import java.io.FileNotFoundException;
import java.util.Vector;
import operatore.gestioneAppelli.Appello;
import java.rmi.*;
import java.rmi.server.*;
/**
 * Contiene le interfacce dei metodi di GestionePropriAppelliControl
 * @author Antonio Sanfelice
 */
public interface GestionePropriAppelliControlInterface extends Remote{

    /**
     * Crea un file per la richiesta di aggiunta appello
     * @param appello, l'appello per cui viene effettuata la richiesta.
     * @throws java.io.FileNotFoundException, lanciata se c'è un errore con il file
     */

    Vector<Prenotato> ricercaPrenotati(Appello appello) throws RemoteException;
    
    void RegistraVoto(Appello appello, Prenotato prenotato, int voto, boolean lode, String data) throws RemoteException;
    
    void RegistraAssenza(Appello appello, Prenotato prenotato) throws RemoteException;

}
