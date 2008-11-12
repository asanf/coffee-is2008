package analisiCarriera;

import gestionePropriAppelli.RisultatoEsame;
import struttureDati.sequence.NodeSequence;
import struttureDati.sequence.Sequence;
import struttureDati.iterator.*;
/**
 * Classe che modella il libretto di uno studente.
 * E' una vista dell'entità libretto presente nel database.
 * @author
 */
public class Libretto {

    Sequence<RisultatoEsame> listaEsami;

    public Libretto() {
        listaEsami = new NodeSequence<RisultatoEsame>();
    }
    
    public float getMediaAritmetica(){
        int sumVoti;
        sumVoti = 0;
        RisultatoEsame tmp;
        for(Iterator<RisultatoEsame> it = listaEsami.iterator(); it.hasNext();){
            tmp = it.next();
            sumVoti+=tmp.getVoto();
        }
        return (float)sumVoti/listaEsami.size();
    }
    
    
    
}
