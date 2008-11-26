package operatore.gestioneEsami;

/**
 * Classe che modella l'entità Esame
 * @author
 */
public class Esame {

    private String nome;
    private int semestre;
    private int crediti;
    private int oreLaboratoro;
    private int oreFrontali;
    private String programma;

    public Esame(String nome, int semestre, int crediti, int oreLaboratoro, int oreFrontali, String programma) {
        this.nome = nome;
        this.semestre = semestre;
        this.crediti = crediti;
        this.oreLaboratoro = oreLaboratoro;
        this.oreFrontali = oreFrontali;
        this.programma = programma;
    }

    public Esame() { this("",0,0,0,0,""); }

    public int getCrediti() {
        return crediti;
    }

    public void setCrediti(int crediti) {
        this.crediti = crediti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getOreFrontali() {
        return oreFrontali;
    }

    public void setOreFrontali(int oreFrontali) {
        this.oreFrontali = oreFrontali;
    }

    public int getOreLaboratoro() {
        return oreLaboratoro;
    }

    public void setOreLaboratoro(int oreLaboratoro) {
        this.oreLaboratoro = oreLaboratoro;
    }

    public String getProgramma() {
        return programma;
    }

    public void setProgramma(String programma) {
        this.programma = programma;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    

    
}
