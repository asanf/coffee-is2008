package operatore.gestioneUtenti;

/**
 *
 * @author 
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
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

}
