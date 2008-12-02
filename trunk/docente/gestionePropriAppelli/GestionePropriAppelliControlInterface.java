package docente.gestionePropriAppelli;

import java.io.FileNotFoundException;
import java.util.Vector;
import operatore.gestioneAppelli.Appello;
import java.rmi.*;
import java.rmi.server.*;
/**
 *
 * @author 
 */
public interface GestionePropriAppelliControlInterface extends Remote{

    /**
     * Crea un file per la richiesta di aggiunta appello
     * @param appello
     * @throws java.io.FileNotFoundException
     */

    Vector<Prenotato> ricercaPrenotati(Appello appello) throws RemoteException;
    
    void RegistraVoto(Appello appello, Prenotato prenotato, int voto, boolean lode, String data) throws RemoteException;
    
    void RegistraAssenza(Appello appello, Prenotato prenotato) throws RemoteException;

}
