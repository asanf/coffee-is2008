/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package operatore.gestioneUtenti;

/**
 * Classe che modella l'entità studente
 * @author 
 */
public class Studente extends UtenteRegistrato{
    
    private int annoImmatricolazione;

    public Studente(String nome, String cognome, String dataNascita, String indirizzo, String matricola, String login, String password, int annoImmatricolazione) {
        super(nome, cognome, dataNascita, indirizzo, matricola, login, password);
        this.annoImmatricolazione = annoImmatricolazione;
    }
    public Studente(){
        super();
        this.annoImmatricolazione=0;
    }
    
    public int getAnnoImmatricolazione(){ return annoImmatricolazione; }
    
    public void setAnnoImmatricolazione(int annoImmatricolazione)
    { this.annoImmatricolazione = annoImmatricolazione; }

}
