package operatore.gestioneAppelli;

import operatore.gestioneEsami.Esame;
import operatore.gestioneUtenti.Docente;

/**
 *
 * @author 
 */
public class Appello {
    public enum Tipologia {SCRITTO,ORALE,PRATICO};
    
    private Esame esame;
    private String data;
    private Docente docente;
    private Tipologia tipologia;
    private String oraInizio;
    private byte durata;
    private String vincoli;

    public Appello(Esame esame, String data, Docente docente, String oraInizio, byte durata, String vincoli, Tipologia tipo) {
        this.esame = esame;
        this.data = data;
        this.docente = docente;
        this.oraInizio = oraInizio;
        this.durata = durata;
        this.vincoli = vincoli;
        tipologia = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public byte getDurata() {
        return durata;
    }

    public void setDurata(byte durata) {
        this.durata = durata;
    }

    public Esame getEsame() {
        return esame;
    }

    public void setEsame(Esame esame) {
        this.esame = esame;
    }

    public String getOraInizio() {
        return oraInizio;
    }

    public void setOraInizio(String oraInizio) {
        this.oraInizio = oraInizio;
    }

    public String getVincoli() {
        return vincoli;
    }

    public void setVincoli(String vincoli) {
        this.vincoli = vincoli;
    }
    
    public String getTipologia(){
        String toReturn="";
        switch(tipologia){
            case SCRITTO: toReturn = "Scritto";
            case ORALE: toReturn = "Orale";
            case PRATICO: toReturn = "Pratico";
        }
        
        return toReturn;
    }
    

}
