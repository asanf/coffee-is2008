package studente.analisiCarriera;

import docente.gestionePropriAppelli.RisultatoEsame;
import struttureDati.sequence.NodeSequence;
import struttureDati.sequence.Sequence;
import struttureDati.iterator.Iterator;
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
    
    public Iterator<RisultatoEsame> iterator(){ 
        return listaEsami.iterator();
    }
    
    public int getNumEsami(){
        return listaEsami.size();
    }
    
    
    
}
