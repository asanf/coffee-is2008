/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package docente.gestionePropriAppelli;

import java.io.Serializable;



/**
 * Classe che modella l'entità prenotato
 * @author Antonio Sanfelice
 */
public class Prenotato implements Serializable {
    
    private String nome;
    private String cognome;
    private String matrStudente;
    
   
    public Prenotato(String matricola,String cognome,String nome){
        this.matrStudente=matricola;
        this.cognome=cognome;
        this.nome=nome;
    }
    
    public Prenotato(){this(null,null,null);}
    
    /**
     * Resituisce la matricola dello studente prenotato all'appello
     * @return, la matricola dello studente prenotato
     */
    public String getMatrStudente(){
        return this.matrStudente;
    }
    /**
     * Restituisce il cognome dello studente prenotato all'appello
     * @return, il cognome dello studente prenotato
     */
    public String getCognome(){
        return this.cognome;
    }
    
    /**
     * Resituisce il nome dello studente prenotato all'appello
     * @return, il nome dello studente prenotato all'appello
     */
    public String getNome(){
        return this.nome;
    }
    /**
     * Imposta la matricola dello studente prenotato all'appello
     * @param matr, la matriocola dello studente prenotato all'appello
     */
    public void setMatrStudente(String matr){
        this.matrStudente=matr;
    }
    
    /**
     * Imposta il cognome dello studente prenotato all'appello
     * @param cognome, il cognome dello studente prenotato all'appello
     */
    public void setCognome(String cognome){
        this.cognome=cognome;
    }
    
    /**
     * Imposta il nome dello studente prenotato all'appello
     * @param nome, il nome dello studente prenotato all'appello
     */
    public void setNome(String nome){
        this.nome=nome;
    }
    
    

}
