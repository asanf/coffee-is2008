/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package docente.gestionePropriAppelli;

import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import operatore.gestioneAppelli.Appello;
import java.io.*;

/**
 *Classe che modella GerstioneAppelliControl
 * @author 
 */
public class GestionePropriAppelliControl {
 
    
    protected void creaPrenotato(Prenotato prenotato){
       try{
           Class.forName("com.mysql.jdbc.Driver");
          }catch(ClassNotFoundException e){
              JOptionPane.showMessageDialog(null, "Errore nel caricamento driver jdbc:\n"+e);
          }
       
       try{
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
           Statement query=con.createStatement();
          // int result=query.executeUpdate();
       }
       catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Errore durante la connessione al database"+e);
          }
       
       }
    
    /**
     *Crea un file per la richiesta di aggiunta appello 
     * @param appello
     * @throws java.io.FileNotFoundException
     */
    protected void creaAppello(Appello appello) throws FileNotFoundException{
        PrintStream f=new PrintStream(new FileOutputStream(new File("appelli")));
        f.println(appello.toString());
    }
    
    protected Vector<Prenotato> ricercaPrenotati(Appello appello){
          try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Errore nel caricare il driver jdbc\n" + e);
        }
        Vector<Prenotato> prenotati=new Vector<Prenotato>();
          
          try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/coffee", "", "");
        Statement query = con.createStatement();
        ResultSet result = query.executeQuery("SELECT utente_registrato.cognome, utente_registrato.nome,utente_registrato.matricola" +
                "FROM utente_registrato" +
                "WHERE utente_registrato.matricola= any (" +
                "SELECT prenotati.matr_studente FROM prenotati" +
                "WHERE cod_appello= any (SELECT codice" +
                "FROM appello" +
                "WHERE esame='" + appello.getEsame() + "'" +
                ")");

        while (result.next()) {
            Prenotato tmp = new Prenotato();
            tmp.setMatrStudente(result.getString("matricola"));
            tmp.setCognome(result.getString("cognome"));
            tmp.setNome(result.getString("nome"));
            prenotati.add(tmp);
        }
             }catch(SQLException e){
                 JOptionPane.showMessageDialog(null, "Errore durante la connessione al database" + e);
     
             }
        return prenotati;
     }

    
    

}
