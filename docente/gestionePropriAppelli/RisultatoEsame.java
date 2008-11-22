package docente.gestionePropriAppelli;

import operatore.gestioneAppelli.Appello;


/**
 * Classe che modella l'esito di un appello per un dato studente
 * @author 
 */
public class RisultatoEsame {

    private Appello appello;
    private byte voto;
    private boolean lode;

    public RisultatoEsame(Appello appello, byte voto, boolean lode) {
        this.appello = appello;
        this.voto = voto;
        this.lode = lode;
    }

    public Appello getAppello() {
        return appello;
    }

    public void setAppello(Appello appello) {
        this.appello = appello;
    }

    public boolean isLode() {
        return lode;
    }

    public void setLode(boolean lode) {
        this.lode = lode;
    }

    public byte getVoto() {
        return voto;
    }

    public void setVoto(byte voto) {
        this.voto = voto;
    }
    
}
