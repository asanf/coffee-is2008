package operatore.gestioneEsami;

/**
 * Classe che modella l'entità Esame
 * @author
 */
public class Esame {

    private String nome;
    private byte semestre;
    private byte crediti;
    private boolean laboratorio;
    private String contenuti;
    private String obiettivi;

    public Esame(String nome, byte semestre, byte crediti, boolean laboratorio, String contenuti, String obiettivi) {
        this.nome = nome;
        this.semestre = semestre;
        this.crediti = crediti;
        this.laboratorio = laboratorio;
        this.contenuti = contenuti;
        this.obiettivi = obiettivi;
    }
    
    
    
    public String getContenuti() {
        return contenuti;
    }

    public void setContenuti(String contenuti) {
        this.contenuti = contenuti;
    }

    public byte getCrediti() {
        return crediti;
    }

    public void setCrediti(byte crediti) {
        this.crediti = crediti;
    }

    public boolean isLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(boolean laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObiettivi() {
        return obiettivi;
    }

    public void setObiettivi(String obiettivi) {
        this.obiettivi = obiettivi;
    }

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }
    
    
    
}
