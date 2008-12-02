package operatore.gestioneUtenti;

/**
 * Classe che modella l'entità Operatore
 * @author Vincenzo Alessandro Cavaso
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

    /**
     * Restituisce l'anno di registrazione dell'operatore
     * @return,l'anno di registrazione dell'operatore
     */
    public int getAnnoRegistrazione() {
        return annoRegistrazione;
    }

    /**
     * Imposta l'anno di registrazione dell'operatore
     * @param annoRegistrazione, l'anno di registrazione dell'operatore
     */
    public void setAnnoRegistrazione(int annoRegistrazione) {
        this.annoRegistrazione = annoRegistrazione;
    }
    
    
    
}
