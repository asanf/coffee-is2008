package gestioneUtenti;

/**
 *
 * @author 
 */
public class Docente extends UtenteRegistrato {

    public enum Tipo {ORDINARIO,ASSOCIATO}
    
    private Tipo tipo;

    public Docente(String nome, String cognome, String dataNascita, String indirizzo, String matricola, String login, String password, Tipo tipo) {
        super(nome, cognome, dataNascita, indirizzo, matricola, login, password);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    

}
