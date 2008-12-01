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
    void creaAppello(Appello appello) throws FileNotFoundException,RemoteException;

    Vector<Prenotato> ricercaPrenotati(Appello appello) throws RemoteException;

}
