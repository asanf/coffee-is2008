/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package operatore.gestioneUtenti;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author 
 */
public class GestioneUtentiControl {

    public void riceviRichiestaAggiuntaAccount(UtenteRegistrato nuovoUtente){
        ObjectOutputStream out;
        try{
            out= new ObjectOutputStream(new FileOutputStream("richiesteAccount.dat",true));
            out.writeObject(nuovoUtente);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void visualizzaCodaRichieste(){
        
    }
}
