/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package docente.gestionePropriAppelli;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import java.sql.*;

/**
 *
 * @author 
 */
public class Prenotati extends AbstractTableModel {

    private Vector<Prenotato> prenotati;

    /**
     * Inizializza una lista vuota degli studenti prenotati all'appello passato
     * come parametro. 
     * @param appello, l'appello passato come parametro
     */
    public Prenotati() {
        prenotati = new Vector<Prenotato>();
        try {
            loadDataFromDataBase(); 
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     public void setData(Vector<Prenotato> prenotati){ 
        this.prenotati = prenotati;
        fireTableDataChanged();
    }   
    

    /**
     * 
     *  
     * 
     */
    public void loadDataFromDataBase() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Errore nel caricare il driver jdbc\n" + e);
        }

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/coffee", "", "");
        Statement query = con.createStatement();
        ResultSet result = query.executeQuery("SELECT matr_studente from prenotati");

        while (result.next()) {
            Prenotato tmp = new Prenotato();
            tmp.setMatrStudente(result.getString("matr_studente"));
            //tmp.setCognome(result.getString("cognome"));
            //tmp.setNome(result.getString("nome"));
            prenotati.add(tmp);
        }
        con.close();
    }

    public int getColumnCount() {
        return 3;
    }

    public int getRowCount() {
        return prenotati.size();
    }

    public Object getValueAt(int row, int column) {
        Prenotato tmp = prenotati.get(row);
        switch(column){
            case 0: return tmp.getMatrStudente();
            case 1: return tmp.getCognome();
            case 2: return tmp.getNome();
            default: return null;
        }
    }
     
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Matricola";
            case 1: return "Cognome";
            case 2: return "Nome";
            default: return null;
        }
    }
    
    @Override
    public boolean isCellEditable(int arg0, int arg1) {
        return false;
    }    
    
    public Prenotato get(int row){
        return prenotati.get(row);
    }

 }
