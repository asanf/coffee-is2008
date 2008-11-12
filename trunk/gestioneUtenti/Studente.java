/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gestioneUtenti;

import analisiCarriera.Libretto;

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
        this.esamiSostenuti = new Libretto();
    }
    
    public float getMediaVoti(){
        return 0.0f;
    }
    
    public int getAnnoImmatricolazione(){ return annoImmatricolazione; };
    
    public void addEsame(){};
    
    
    
    
}
