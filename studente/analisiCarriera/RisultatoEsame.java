package studente.analisiCarriera;


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

    /**
     * Restituisce la data dell'esame
     * @return, la data dell'esame
     */
    public String getData() {
        return data;
    }
    /**
     * Imposta la data dell'esame
     * @param data, la data dell'esame
     */
    public void setData(String data) {
        this.data = data;
    }
    /**
     * Resituisce l'esame 
     * @return, l'esame
     */
    public String getEsame() {
        return esame;
    }
    /**
     * Imposta l'esame 
     * @param esame, l'esame
     */
    public void setEsame(String esame) {
        this.esame = esame;
    }
    /**
     * Restituisce se c'è la lode
     * @return, se c'è la lode, false altrimenti
     */
    public boolean isLode() {
        return lode;
    }
    /**
     * 
     * @param lode
     */
    public void setLode(boolean lode) {
        this.lode = lode;
    }
    /**
     * 
     * @return
     */
    public int getVoto() {
        return voto;
    }
    /**
     * 
     * @param voto
     */
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
