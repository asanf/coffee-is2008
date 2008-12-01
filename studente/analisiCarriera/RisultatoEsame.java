package studente.analisiCarriera;

import java.util.Date;
import operatore.gestioneAppelli.Appello;


/**
 * Classe che modella l'esito di un appello per un dato studente
 * @author 
 */
public class RisultatoEsame {

    private String esame;
    private int crediti;
    private int voto;
    private boolean lode;
    private String data;

    public RisultatoEsame(String esame,int crediti, int voto, boolean lode, String data) {
        this.esame = esame;
        this.crediti=crediti;
        this.voto = voto;
        this.lode = lode;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEsame() {
        return esame;
    }

    public void setEsame(String esame) {
        this.esame = esame;
    }

    public boolean isLode() {
        return lode;
    }

    public void setLode(boolean lode) {
        this.lode = lode;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }
    
    public int getCrediti(){
        return crediti;
    }
    public void setCrediti(int crediti){
        this.crediti=crediti;
    }
    
    
}
