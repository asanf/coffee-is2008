package operatore.gestioneAppelli;

/**
 *Classe che modella l'entità Appello
 * @author 
 */
public class Appello {
   
    private String esame;
    private String data;
    private String docente;
    private String tipologia;
    private String oraInizio;
    private int durata;
    private String vincoli;
    private String aula;

    public Appello() {
        this(null,null,null,null,null,0,null,null);
    }


    public Appello(String esame, String data, String docente, String tipologia, String oraInizio, int durata, String vincoli, String aula) {
        this.esame = esame;
        this.data = data;
        this.docente = docente;
        this.tipologia = tipologia;
        this.oraInizio = oraInizio;
        this.durata = durata;
        this.vincoli = vincoli;
        this.aula = aula;
    }
    
    @Override
    public String toString(){
        return(getEsame()+","+getData()+","+getDocente()+","+getTipologia()+","+getOraInizio()+","+getDurata()+","+getVincoli()+","+getAula());
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getEsame() {
        return esame;
    }

    public void setEsame(String esame) {
        this.esame = esame;
    }

    public String getOraInizio() {
        return oraInizio;
    }

    public void setOraInizio(String oraInizio) {
        this.oraInizio = oraInizio;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getVincoli() {
        return vincoli;
    }

    public void setVincoli(String vincoli) {
        this.vincoli = vincoli;
    }
    
    public String getTipologia(){
        return tipologia;
    }

  
    
}
