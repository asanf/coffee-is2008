package studente.analisiCarriera;
import java.sql.*;
import java.util.Iterator;
import operatore.gestioneUtenti.Studente;

/**
 * Oggetto control che si occupa di recuperare dati dall'entity Libretto
 * @author e-vampire
 */
public class LibrettoControl {

     /**
      * Metodo che calcola la media aritmetica per un dato libretto
      * @param libretto Il libretto per cui si vuol calcolare la media
      * @return La media aritmetica
      */
    public float getMediaAritmetica(String matricola){
        
        int sumVoti = 0;
              
        Libretto lib = new Libretto(matricola);
        Iterator<RisultatoEsame> esami = lib.iterator();
        while(esami.hasNext()){
            sumVoti += esami.next().getVoto();
        }
        return sumVoti/lib.getNumEsami();
    }
    
    /**
     * Metodo che fa un calcolo del voto di laurea atteso con la media attuale
     * @param libretto Il libretto contenente gli esami sostenuto
     * @return Il voto di laurea in centodecimi
     */
    public int getVotoDiLaureaStimato(String matricola){
        return (int)(getMediaAritmetica(matricola)*110)/30;
    }
    
    public void visualizzaLibretto(Studente studente){
        VisualizzaLibrettoForm lib = new VisualizzaLibrettoForm(studente);
        lib.setVisible(true);
    }
}
