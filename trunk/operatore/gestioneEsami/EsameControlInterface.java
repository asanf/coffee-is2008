package operatore.gestioneEsami;

import java.util.Vector;
import java.rmi.*;
import java.rmi.server.*;

/**
 *
 * @author 
 */
public interface EsameControlInterface extends Remote{

    void creaEsame(Esame esame) throws RemoteException;

    void eliminaEsame(Esame esame) throws RemoteException;

    void modificaEsame(Esame old, Esame modified) throws RemoteException;

    Vector<Esame> ricercaEsame(String nomeEsame) throws RemoteException;

}
