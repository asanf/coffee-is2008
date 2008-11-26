

package operatore.gestioneUtenti;

import java.io.Serializable;

/**
 * Classe che modella l'utente generico per il sistema
 * @author 
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
    
    
    
    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    

}
