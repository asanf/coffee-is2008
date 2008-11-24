/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package operatore.gestioneUtenti;

import studente.analisiCarriera.Libretto;

/**
 * Classe che modella l'entità studente
 * @author 
 */
public class Studente extends UtenteRegistrato{
    
    private int annoImmatricolazione;
    private Libretto esamiSostenuti;
    private float mediaVoti;

    public Studente(String nome, String cognome, String dataNascita, String indirizzo, String matricola, String login, String password, int annoImmatricolazione) {
        super(nome, cognome, dataNascita, indirizzo, matricola, login, password);
        this.annoImmatricolazione = annoImmatricolazione;
        this.esamiSostenuti = new Libretto(matricola);
    }
    public Studente(String nome, String cognome, String matricola){
        this(nome,cognome,null,null,matricola,null,null,0);
    }
    
    public int getAnnoImmatricolazione(){ return annoImmatricolazione; };
    
    
    
    
    
}
