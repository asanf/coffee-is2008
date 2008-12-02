/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package operatore.gestioneUtenti;

/**
 * Classe che modella l'entità studente
 * @author Demia Massaro
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
    
    /**
     * Restituisce l'anno di immatricolazione dello studente
     * @return, l'anno di immatricolazione dello studente
     */
    public int getAnnoImmatricolazione(){ return annoImmatricolazione; }
    
    /**
     * Imposta l'anno di immatricolazione dello studente
     * @param annoImmatricolazione, l'anno di immatricolazione dello studente
     */
    public void setAnnoImmatricolazione(int annoImmatricolazione)
    { this.annoImmatricolazione = annoImmatricolazione; }

}
