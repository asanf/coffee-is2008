package operatore.gestioneUtenti;

/**
 * Classe che modella l'entità Docente
 * @author Antonio Sanfelice
 */
public class Docente extends UtenteRegistrato {

     
    private String tipo;

    public Docente(String nome, String cognome, String dataNascita, String indirizzo, String matricola, String login, String password, String tipo) {
        super(nome, cognome, dataNascita, indirizzo, matricola, login, password);
        this.tipo = tipo;
    }

    public Docente() {
        super();
        this.tipo = "";
    }
    

    /**
     * Restituisce il tipo di contratto del docente
     * @return, il tipo di contratto del docente
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Imposta il tipo di contratto del docente
     * @param tipo, il tipo di contratto del docente
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

}
