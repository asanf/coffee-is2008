package operatore.gestioneAppelli;

import java.io.Serializable;

/**
 *Classe che modella l'entità Appello
 * @author Antonio Sanfelice
 */
public class Appello implements Serializable {
   
    private int codice;
    private String esame;
    private String data;
    private int crediti;
    private String docente;
    private String tipologia;
    private String oraInizio;
    private int durata;
    private String vincoli;
    private String aula;

    public Appello() {
        this(0,null,null,null,null,null,0,null,null,0);
    }


    public Appello(int codice, String esame, String data, String docente, String tipologia, String oraInizio, int durata, String vincoli, String aula, int crediti) {
        this.codice = codice;
        this.esame = esame;
        this.data = data;
        this.docente = docente;
        this.tipologia = tipologia;
        this.oraInizio = oraInizio;
        this.durata = durata;
        this.vincoli = vincoli;
        this.aula = aula;
        this.crediti = crediti;
    }

    /**
     * Restituisce il codice dell'appello
     * @return, il codice dell'appello
     */
    public int getCodice() {
        return codice;
    }
    
    /**
     * Imposta il codice dell'appello
     * @param codice, il codice dell'appello
     */
    public void setCodice(int codice) {
        this.codice = codice;
    }

    
    /**
     * Restituisce l'aula dell'appello
     * @return, l'aula dell'appello
     */
    public String getAula() {
        return aula;
    }

    /**
     * Imposta l'aula dell'appello 
     * @parama aula, l'aula dell'appello
     */
    public void setAula(String aula) {
        this.aula = aula;
    }

    
    /**
     * Restituisce la data dell'appello
     * @return, la data dell'appello
     */
    public String getData() {
        return data;
    }

    /**
     * Imposta la data dell'appello
     * @param data, la data dell'appello
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Restituisce il docente dell'esame associato all'appello
     * @return, il docente dell'esame
     */
    public String getDocente() {
        return docente;
    }

    /**
     * Imposta il docente dell'esame associato all'appello
     * @param docente, il docente dell'esame
     */
    public void setDocente(String docente) {
        this.docente = docente;
    }

    /**
     * Restituisce la durata dell'esame associato all'appello
     * @return, la dutara dell'esame
     */
    public int getDurata() {
        return durata;
    }

    /**
     * Imposta la durata dell'esame associato all'appello
     * @param durata, la durata dell'esame
     */
    public void setDurata(int durata) {
        this.durata = durata;
    }

    /**
     * Restituisce l'esame associato all'appello
     * @return, l'esame associato all'appello
     */
    public String getEsame() {
        return esame;
    }

    /**
     * Imposta l'esame associato all'appello
     * @param esame, l'esame da associare all'appello
     */
    public void setEsame(String esame) {
        this.esame = esame;
    }

    /**
     * Restituisce l'ora di inizio  dell'appello
     * @return, l'ora di inizio dell'appello
     */
    public String getOraInizio() {
        return oraInizio;
    }

    /**
     * Imposta l'ora di inizio dell'appello
     * @param oraInizio, l'ora di inizio dell'appello
     */
    public void setOraInizio(String oraInizio) {
        this.oraInizio = oraInizio;
    }
    
    /**
     * Imposta la tipologia dell'esame associato all'appello
     * @param tipologia, la tipologia dell'esame
     */
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    /**
     * Restituisce i vincoli dell'appello
     * @return, i vincoli dell'appello
     */
    public String getVincoli() {
        return vincoli;
    }

    /**
     * Imposta i vincoli dell'appello
     * @param vincoli, i vincoli dell'appello
     */
    public void setVincoli(String vincoli) {
        this.vincoli = vincoli;
    }
    
    /**
     * Restituisce la tipologia dell'esame associato all'appello
     * @return, la tipologia dell'esame
     */
    public String getTipologia(){
        return tipologia;
    }

    /**
     * Restituisce i crediti dell'esame associato all'appello
     * @return, i crediti dell'esame
     */
    public int getCrediti(){
        return crediti;
    }
    
    /**
     * Imposta i crediti dell'esame associato all'appello
     * @param crediti, i crediti dell'esame
     */
    public void setCrediti(int crediti){
        this.crediti = crediti;
    }
}
