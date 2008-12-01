
package operatore.gestioneUtenti;

import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 * Classe che rappresenta la lista di tutti gli utenti registrati al sistema
 * @author
 */
public class UtentiRegistrati extends AbstractTableModel{
    
    private Vector<UtenteRegistrato> utenti;
    
    public UtentiRegistrati(){
        utenti = new Vector<UtenteRegistrato>();
    }
    
    public void setData(Vector<UtenteRegistrato> esami){ 
        this.utenti = esami;
        fireTableDataChanged();
    }
    
    public void loadDataFromDataBase() throws SQLException{
        Connection con;
        Statement query;
        ResultSet result;
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
        con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
        query = con.createStatement();
        
        result = query.executeQuery("SELECT * FROM utente_registrato");
        while(result.next()){
                UtenteRegistrato tmp = new UtenteRegistrato(
                                                result.getString("nome"),
                                                result.getString("cognome"),
                                                result.getString("data_nascita"),
                                                result.getString("indirizzo"),
                                                result.getString("matricola"),
                                                result.getString("username"),
                                                result.getString("password"));
                utenti.add(tmp);
        }
        con.close();
    }

    public UtenteRegistrato getUtente(String username, String password) throws SQLException{
        Connection con;
        Statement query;
        ResultSet result;
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Errore nel caricamenteo del Driver JDBC:\n" + e);
            return null;
        }
        con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
        query = con.createStatement();
        
        result = query.executeQuery("SELECT * FROM studente as S, utente_registrato as U WHERE S.matricola=U.matricola AND username='"+username+"' AND password='"+password+"'");
        if(result.next()){
            Studente studente = new Studente();
            studente.setCognome(result.getString("cognome"));
            studente.setNome(result.getString("nome"));
            studente.setMatricola(result.getString("matricola"));
            studente.setIndirizzo(result.getString("indirizzo"));
            studente.setLogin(username);
            studente.setPassword(password);
            studente.setDataNascita(result.getString("data_nascita"));
            studente.setAnnoImmatricolazione(result.getInt("anno_iscrizione"));
            return studente;
        }else{
            result = query.executeQuery("SELECT * FROM docente as D, utente_registrato as U WHERE D.matricola=U.matricola AND username='"+username+"' AND password='"+password+"'");
            if(result.next()){
                Docente docente = new Docente();
                docente.setCognome(result.getString("cognome"));
                docente.setNome(result.getString("nome"));
                docente.setMatricola(result.getString("matricola"));
                docente.setIndirizzo(result.getString("indirizzo"));
                docente.setLogin(username);
                docente.setPassword(password);
                docente.setDataNascita(result.getString("data_nascita"));
                docente.setTipo(result.getString("tipo_contratto"));
                return docente;
            }else{
                result = query.executeQuery("SELECT * FROM operatore as O, utente_registrato as U WHERE O.matricola=U.matricola AND username='"+username+"' AND password='"+password+"'");
                if(result.next()){
                    Operatore operatore = new Operatore();
                    operatore.setCognome(result.getString("cognome"));
                    operatore.setNome(result.getString("nome"));
                    operatore.setMatricola(result.getString("matricola"));
                    operatore.setIndirizzo(result.getString("indirizzo"));
                    operatore.setLogin(username);
                    operatore.setPassword(password);
                    operatore.setDataNascita(result.getString("data_nascita"));
                    operatore.setAnnoRegistrazione(result.getInt("data_registrazione"));
                    return operatore;
                }
            }
        }
        return null;
    }
    
    public int getColumnCount() {
        return 6;
    }

    public int getRowCount() {
        return utenti.size();
    }

    public Object getValueAt(int row, int column) {
        UtenteRegistrato tmp = utenti.get(row);
        switch(column){
            case 0: return tmp.getMatricola();
            case 1: return tmp.getCognome();
            case 2: return tmp.getNome();
            case 3: return tmp.getDataNascita();
            case 4: return tmp.getIndirizzo();
            case 5: return tmp.getLogin();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Matricola";
            case 1: return "Cognome";
            case 2: return "Nome";
            case 3: return "Data Nascita";
            case 4: return "Indirizzo";
            case 5: return "Username";
            default: return null;
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    public UtenteRegistrato get(int row){
        return utenti.get(row);
    }
}
