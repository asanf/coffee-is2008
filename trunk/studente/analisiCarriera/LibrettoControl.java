package studente.analisiCarriera;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;
import java.util.Iterator;
import javax.swing.JOptionPane;
import operatore.gestioneUtenti.Studente;

/**
 * Oggetto control che si occupa di recuperare dati dall'entity Libretto
 * @author e-vampire
 */
public class LibrettoControl extends UnicastRemoteObject implements LibrettoControlInterface{

    public LibrettoControl() throws RemoteException{
        super();
    }
    
    
     /**
      * Metodo che calcola la media aritmetica per un dato libretto
      * @param libretto Il libretto per cui si vuol calcolare la media
      * @return La media aritmetica
      */
    public float getMediaAritmetica(String matricola) throws RemoteException{
        
        int sumVoti = 0;
              
        Libretto lib = new Libretto(matricola);
        Iterator<RisultatoEsame> esami = lib.iterator();
        if (!esami.hasNext()){
            JOptionPane.showMessageDialog(null,"L'utente non ha esami sul libretto", "Impossibile calcolare le statistiche", JOptionPane.INFORMATION_MESSAGE);
            return -1;
        }
        while(esami.hasNext()){
            
            sumVoti += esami.next().getVoto();
        }
        return sumVoti/lib.getNumEsami();
    }
    
    public float getMediaPonderata(String matricola) throws RemoteException{
        int sumVotiPerCredito=0;
        int sumCrediti=0;
        Libretto lib = new Libretto(matricola);
        Iterator<RisultatoEsame> esami = lib.iterator();
        
        while(esami.hasNext()){
            RisultatoEsame esame = esami.next();
            sumVotiPerCredito += esame.getVoto()*esame.getCrediti();
            sumCrediti += esame.getCrediti();
        }
        return sumVotiPerCredito/sumCrediti;
    }
    /**
     * Metodo che fa un calcolo del voto di laurea atteso con la media attuale
     * @param libretto Il libretto contenente gli esami sostenuto
     * @return Il voto di laurea in centodecimi
     */
    public int getVotoDiLaureaStimato(String matricola) throws RemoteException{
        return (int)(getMediaAritmetica(matricola)*110)/30;
    }
    
    public void visualizzaLibretto(Studente studente) throws RemoteException{
        VisualizzaLibrettoForm lib = new VisualizzaLibrettoForm(studente);
        lib.setVisible(true);
    }
    
    public void visualizzaStatistiche(String matricola) throws RemoteException{
        if (getMediaAritmetica(matricola)<0){
        return;    
        }
        String mediaString = "" + getMediaAritmetica(matricola);
        String mediaPonderata = ""+ getMediaPonderata(matricola);
        String laureaString = "" + getVotoDiLaureaStimato(matricola);
        VisualizzaStatisticheForm statForm = new VisualizzaStatisticheForm(mediaString,mediaPonderata,laureaString);
        statForm.setVisible(true);
    }
}
