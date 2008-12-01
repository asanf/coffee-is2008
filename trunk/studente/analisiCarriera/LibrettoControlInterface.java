package studente.analisiCarriera;

import operatore.gestioneUtenti.Studente;
import java.rmi.*;
import java.rmi.server.*;
/**
 *
 * @author 
 */
public interface LibrettoControlInterface extends Remote{

    /**
     * Metodo che calcola la media aritmetica per un dato libretto
     * @param libretto Il libretto per cui si vuol calcolare la media
     * @return La media aritmetica
     */
    float getMediaAritmetica(String matricola) throws RemoteException;

    /**
     * Metodo che fa un calcolo del voto di laurea atteso con la media attuale
     * @param libretto Il libretto contenente gli esami sostenuto
     * @return Il voto di laurea in centodecimi
     */
    int getVotoDiLaureaStimato(String matricola) throws RemoteException;

    void visualizzaLibretto(Studente studente) throws RemoteException;

    void visualizzaStatistiche(String matricola) throws RemoteException;
    
    float getMediaPonderata(String matricola) throws RemoteException;

}
