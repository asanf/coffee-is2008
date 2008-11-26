package operatore.gestioneUtenti;

/**
 * Classe che modella l'entità Operatore
 * @author
 */
public class Operatore extends UtenteRegistrato{
    
    private int annoRegistrazione;

    public Operatore(String nome, String cognome, String dataNascita, String indirizzo, String matricola, String login, String password) {
        super(nome, cognome, dataNascita, indirizzo, matricola, login, password);
    }

    public Operatore() {
        super();
        this.annoRegistrazione=0;
    }

    public int getAnnoRegistrazione() {
        return annoRegistrazione;
    }

    public void setAnnoRegistrazione(int annoRegistrazione) {
        this.annoRegistrazione = annoRegistrazione;
    }
    
    
    
}
