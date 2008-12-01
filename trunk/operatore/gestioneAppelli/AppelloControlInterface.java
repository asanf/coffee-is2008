package operatore.gestioneAppelli;

import java.io.FileNotFoundException;
import java.util.Vector;
import operatore.gestioneUtenti.Docente;
import java.rmi.*;
import java.rmi.*;

/**
 *
 * @author 
 */
public interface AppelloControlInterface extends Remote{

    void aggiungiAppello(Appello appello)  throws RemoteException;

    void modificaAppello(Appello old, Appello modified) throws RemoteException;

    Vector<Appello> ricercaAppello(String attributo, String valore) throws RemoteException;

    Vector<Appello> ricercaPropriAppelli(Docente docente) throws RemoteException;

    void riceviRichiestaAggiuntaAppello(Appello appello) throws FileNotFoundException,RemoteException;

}
