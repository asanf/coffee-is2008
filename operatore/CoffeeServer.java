import docente.gestionePropriAppelli.GestionePropriAppelliControl;
import operatore.gestioneAppelli.AppelloControl;
import operatore.gestioneEsami.EsameControl;
import operatore.gestioneUtenti.GestioneUtentiControl;
import studente.analisiCarriera.LibrettoControl;
import studente.gestionePropriEsami.GestionePropriEsamiControl;
import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner;
import system.LoginControl;

public class CoffeeServer {
    
    /**
    * Classe che effetta il binding per gli oggetti remoti presenti nel sistema
    * @author 
     */
    public static void main(String[] args){
        try{
            GestionePropriAppelliControl gestPropAppCont = new GestionePropriAppelliControl();
            AppelloControl appCont = new AppelloControl();
            EsameControl esameCont = new EsameControl();
            GestioneUtentiControl gestUtentiCont = new GestioneUtentiControl();
            LibrettoControl libCont = new LibrettoControl();
            GestionePropriEsamiControl gestPropEsamiCont = new GestionePropriEsamiControl();
            LoginControl logCont = new LoginControl();
            
            System.out.println("Avvio Login");
            Naming.rebind("Login", logCont);
            
            System.out.println("Avvio GestionePropriAppelli");
            Naming.rebind("GestionePropriAppelli", gestPropAppCont);
            
            System.out.println("Avvio GestioneAppelli");
            Naming.rebind("GestioneAppelli", appCont);
            
            System.out.println("Avvio GestioneEsami");
            Naming.rebind("GestioneEsami", esameCont);
            
            System.out.println("Avvio GestioneUtenti");
            Naming.rebind("GestioneUtenti", gestUtentiCont);
            
            System.out.println("Avvio AnalisiCarriera");
            Naming.rebind("AnalisiCarriera", libCont);
            
            System.out.println("Avvio GestionePropriEsami");
            Naming.rebind("GestionePropriEsami", gestPropEsamiCont);
            
            
        }catch(Exception e){
            System.out.println("Errore nell'avvio del server: "+e.getMessage());
        }
        
        System.out.println("Digita \"quit\" per spegnere il server:");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        if(command.equals("quit"))
            System.exit(0);
        
    }

}
