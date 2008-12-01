/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package docente.gestionePropriAppelli;



/**
 * Classe che modella l'entità prenotato
 * @author 
 */
public class Prenotato  {
    
    private String nome;
    private String cognome;
    private String matrStudente;
    
   
    public Prenotato(String matricola,String cognome,String nome){
        this.matrStudente=matricola;
        this.cognome=cognome;
        this.nome=nome;
    }
    
    public Prenotato(){this(null,null,null);}
    
    public String getMatrStudente(){
        return this.matrStudente;
    }
    
    public String getCognome(){
        return this.cognome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setMatrStudente(String matr){
        this.matrStudente=matr;
    }
    
    public void setCognome(String cognome){
        this.cognome=cognome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    

}
