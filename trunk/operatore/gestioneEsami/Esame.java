package operatore.gestioneEsami;

/**
 * Classe che modella l'entità Esame
 * @author Vincenzo Alessandro Cavaso
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

    /**
     * Restituisce il numero di crediti dell'esame
     * @return, il numero di crediti dell'esame
     */
    public int getCrediti() {
        return crediti;
    }

    /**
     * Imposta il numero di crediti dell'esame
     * @param crediti, il numero di crediti dell'esame
     */
    public void setCrediti(int crediti) {
        this.crediti = crediti;
    }
    /**
     * Restituisce il nome dell'esame
     * @return, il nome dell'esame
     */
    public String getNome() {
        return nome;
    }
    /**
     * Imposta il nome dell'esame
     * @param nome, il nome dell'esame
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Restituisce il numero delle ore frontali dell'esame
     * @return, il numero di ore frontali dell'esame
     */
    public int getOreFrontali() {
        return oreFrontali;
    }

    /**
     * Imposta il numero di ore frontali dell'esame
     * @param oreFrontali, le ore frontali dell'esame
     */
    public void setOreFrontali(int oreFrontali) {
        this.oreFrontali = oreFrontali;
    }
    
    /**
     * Restituisce il numero di ore di laborario dell'esame
     * @return, il numero di ore di laborario dell'esame
     */
    public int getOreLaboratoro() {
        return oreLaboratoro;
    }

    /**
     * Imposta il numero di ore di laborario dell'esame
     * @param oreLaboratoro, il numero di ore di laborario dell'esame
     */
    public void setOreLaboratoro(int oreLaboratoro) {
        this.oreLaboratoro = oreLaboratoro;
    }
    
    /**
     * Restituisc il programma dell'esame
     * @return, il programma dell'esame
     */
    public String getProgramma() {
        return programma;
    }
    
    /**
     * Imposta il programma dell'esame
     * @param programma, il programma dell'esame
     */
    public void setProgramma(String programma) {
        this.programma = programma;
    }
    
    /**
     * Restituisce il semestre dell'esame
     * @return, il semestre dell'esame
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * Imposta il semestre dell'esame
     * @param semestre, il semestre dell'esame
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    

    
}
