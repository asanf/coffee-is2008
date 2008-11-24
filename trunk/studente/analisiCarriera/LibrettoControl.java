package studente.analisiCarriera;
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
    public float getMediaAritmetica(Libretto libretto){
        int sumVoti;
        sumVoti = 0;
        RisultatoEsame tmp;
        for(Iterator<RisultatoEsame> it = libretto.iterator(); it.hasNext();){
            tmp = it.next();
            sumVoti+=tmp.getVoto();
        }
        return (float)sumVoti/libretto.getNumEsami();
    }
    
    /**
     * Metodo che calcola la media pesata per un dato libretto
     * @param libretto Il libretto per cui si vuol calcolare la media
     * @return La media ponderata
     */
    public float getMediaPonderata(Libretto libretto){
        int sumVotiPesati, sumCrediti;
        sumVotiPesati = 0;
        sumCrediti = 1;
        RisultatoEsame tmp;
        for(Iterator<RisultatoEsame> it = libretto.iterator(); it.hasNext();)
        {
            tmp = it.next();
            int crediti = tmp.getAppello().getEsame().getCrediti();
            int votoPesato = tmp.getVoto() * crediti;
            sumVotiPesati += votoPesato;
            sumCrediti *= crediti;
        }
        return (float)sumVotiPesati/sumCrediti;
    }
    
    /**
     * Metodo che fa un calcolo del voto di laurea atteso con la media attuale
     * @param libretto Il libretto contenente gli esami sostenuto
     * @return Il voto di laurea in centodecimi
     */
    public byte getVotoDiLaureaStimato(Libretto libretto){
        return (byte)((getMediaAritmetica(libretto) * 110) / 30);
    }
    
    public void visualizzaLibretto(Studente studente){
        VisualizzaLibrettoForm lib = new VisualizzaLibrettoForm(studente);
        lib.setVisible(true);
    }
}
