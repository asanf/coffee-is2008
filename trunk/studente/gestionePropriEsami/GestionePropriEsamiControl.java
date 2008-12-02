package studente.gestionePropriEsami;

import javax.swing.JOptionPane;
import java.sql.*;
import operatore.gestioneAppelli.Appello;
import operatore.gestioneUtenti.Studente;
import java.rmi.*;
import java.rmi.server.*;


/**
 * Classe che modella l'oggetto control che si occupa di interagire con gli appello degli esami
 * di un dato studente 
 * @author Demia Massaro
 */
public class GestionePropriEsamiControl extends UnicastRemoteObject implements GestionePropriEsamiControlInterface{
    
    public GestionePropriEsamiControl() throws RemoteException{
        super();
    }
    
    /**
     * Visualizza tutti gli appelli disponibili
     * @param studente, lo studente che eventualmente si prenota ad un appello
     */
    public void visualizzaAppelliDisponibili(Studente studente){
        VisualizzaAppelliDisponibiliList appDisp = new VisualizzaAppelliDisponibiliList(studente);
        appDisp.setVisible(true);
    }
    
    /**
     * Prentoa un appello ad un dato studente
     * @param appello, l'appello a cui prenotarsi
     * @param studente, lo studente che si prenota all'appello
     */
    public void prenotaEsame(Appello appello,Studente studente){
         try{
           Class.forName("com.mysql.jdbc.Driver");
          }catch(ClassNotFoundException e){
              JOptionPane.showMessageDialog(null, "Errore nel caricamento driver jdbc:\n"+e);
          }
       
       try{
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
           Statement query=con.createStatement();
           String matricola=studente.getMatricola();
           int cod_appello=appello.getCodice();
           boolean result=query.execute("INSERT INTO prenotati(cod_appello,matr_studente,data_registrazione)" +
                                               " values("+cod_appello+",'"+matricola+"','28-11-2008')");
       }
       catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Errore durante la connessione al database"+e);
          }
       
    }

}
