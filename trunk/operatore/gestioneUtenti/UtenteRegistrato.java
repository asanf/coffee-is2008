

package operatore.gestioneUtenti;

import java.io.Serializable;

/**
 * Classe che modella l'utente generico del sistema
 * @author Vincenzo Alessandro Cavaso
 */
public class UtenteRegistrato implements Serializable{
    
    private String nome;
    private String cognome;
    private String dataNascita;
    private String indirizzo;
    private String matricola;
    private String login;
    private String password;

    public UtenteRegistrato(String nome, String cognome, String dataNascita, String indirizzo, String matricola, String login, String password) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.indirizzo = indirizzo;
        this.matricola = matricola;
        this.login = login;
        this.password = password;
    }

    public UtenteRegistrato() {
        this("","","","","","","");
    }
    
    
    
    /**
     * Restituisce la data di nascita dell'utente registrato
     * @return, la data di nascita dello studente
     */
    public String getDataNascita() {
        return dataNascita;
    }

    /**
     * Impost ala data di nascita dell'utente registrato
     * @param dataNascita, la data di nascita
     */
    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    /**
     * Restituisce l'indirizzo dell'utente registrato
     * @return, l'indirizzo
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * Imposta l'indirizzo dell'utente registrato
     * @param indirizzo, l'inidirizzo
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    /**
     * Restituisce la login dell'utente registrato
     * @return, la login dell'utente registrato
     */
    public String getLogin() {
        return login;
    }
    /**
     * Imposta la login dell'utente registrato
     * @param login, la login dell'utente registrato
     */
    public void setLogin(String login) {
        this.login = login;
    }
    
    /**
     * Restituisce la matricola dell'utente registrato
     * @return, la matricola
     */
    public String getMatricola() {
        return matricola;
    }

    /**
     * Imposta la matricola dell'utente registrato
     * @param matricola, la matricola dell'utente registrato
     */
    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    /**
     * Restituisce la password dell'utente registrato
     * @return, la password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Imposta la password dell'utente registrato
     * @param password, la password dell'utente registrato
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Restituisce il cognome dell'utente registrato
     * @return, il cognome dell'utente registrato
     */
    public String getCognome() {
        return cognome;
    }
    
    /**
     * Imposta il cognome dell'utente registrato
     * @param cognome, il cognome dell'utente registrato
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Restituisce il nome dell'utente registrato
     * @return, il nome dell'utente registrato
     */
    public String getNome() {
        return nome;
    }
    /**
     * Imposta il nome dell'utente registrato
     * @param nome, il nome dell'utente registrato
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    

}
