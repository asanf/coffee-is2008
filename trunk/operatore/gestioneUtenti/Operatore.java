/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package operatore.gestioneUtenti;

/**
 *
 * @author e-vampire
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
