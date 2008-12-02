package docente.gestionePropriAppelli;

import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import operatore.gestioneAppelli.Appello;
import java.io.*;
import java.rmi.*;
import java.rmi.server.*;

/**
 *Classe che modella l'oggetto Control che interagisce con l'entity appello
 * @author Antonio Sanfelice
 */
public class GestionePropriAppelliControl extends UnicastRemoteObject implements GestionePropriAppelliControlInterface {
    
    public GestionePropriAppelliControl() throws RemoteException{
        super();
    }
 
    
    /**
     * Ricerca gli studenti prenotati ad un dato appello
     * @param appello, l'appello si cui ricercare gli studenti prenotati
     * @return un vettore con tutti gli studenti prenotati all'appello passato come paramentro
     * @throws java.rmi.RemoteException, lanciata quando c'è un errore nella connessione remota
     */
    public Vector<Prenotato> ricercaPrenotati(Appello appello) throws RemoteException{
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
     
    /**
     * Metodo che permette di registrare l'assenza di uno studente ad un dato appello in cui
     * si è registrato
     * @param appello, l'appello a cui lo studente si è prenotato
     * @param prenotato, lo studente a cui viene registrata l'eventuale assenza
     * @throws java.rmi.RemoteException, lanciata quando c'è un errore nella connessione remota
     */
    public void RegistraAssenza(Appello appello, Prenotato prenotato) throws RemoteException {
        String nomeFile = "assenze_"+appello.getEsame()+"_"+appello.getData()+".dat";
        ObjectOutputStream assenze = null;
        try{
            assenze= new ObjectOutputStream(new FileOutputStream(nomeFile,true));
            assenze.writeObject(prenotato);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Errore file "+nomeFile+":\n"+e);
        }
    }
    
    /**
     * Metodo che permette di registrare il voto di uno studente ad un appello a cui
     * si è prenotato
     * @param appello, l'appello a cui lo studente si è prenotato
     * @param prenotato, lo studente a cui viene registrato il voto
     * @param voto, il voto che viene registrato allo studente
     * @param lode, l'evenutale lode che viene registrata allo studente
     * @param data, la data in cui si è svolto l'appello
     * @throws java.rmi.RemoteException, lanciata quando c'è un errore nella connessione remota
     */
    public void RegistraVoto(Appello appello, Prenotato prenotato, int voto, boolean lode, String data) throws RemoteException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Errore caricamento driver jdbc:\n"+e);
        }
        try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
        Statement query = con.createStatement();
        int isLode = lode?1:0;
        int result;
        result = query.executeUpdate("INSERT INTO libretto(matricola,esame,voto,lode,data)" +
                                     " VALUES('"+prenotato.getMatrStudente()+"','" 
                                     + appello.getEsame() + "'," + voto + 
                                     "," + isLode + ",'" +data +"')");
        if(result == query.EXECUTE_FAILED)
            JOptionPane.showMessageDialog(null, "Errore durante la registrazione del voto");
        else
            JOptionPane.showMessageDialog(null,"Voto registrato correttamente");
        con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Errore durante la registrazione del voto");
        }
    }

    
    
    

}
