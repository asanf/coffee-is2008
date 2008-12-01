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
 *Classe che modella l'oggetto Control che interagisce con l'entity appello
 * @author 
 */
public class GestionePropriAppelliControl {
 
        
    /**
     *Crea un file per la richiesta di aggiunta appello 
     * @param appello
     * @throws java.io.FileNotFoundException
     */
    protected void creaAppello(Appello appello) throws FileNotFoundException{
        ObjectOutputStream f = null;
        try {
            f = new ObjectOutputStream(new FileOutputStream(new File("appelli")));
            f.writeObject(appello);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Errore scrittura file");
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Errore chiusura File");
            }
        }
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
        int cod=appello.getCodice();
        ResultSet result = query.executeQuery("SELECT utente_registrato.cognome, utente_registrato.nome,utente_registrato.matricola" +
                " FROM utente_registrato, prenotati" +
                " WHERE utente_registrato.matricola=prenotati.matr_studente and prenotati.cod_appello="+cod);

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
