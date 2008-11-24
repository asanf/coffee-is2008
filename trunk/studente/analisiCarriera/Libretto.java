package studente.analisiCarriera;

import docente.gestionePropriAppelli.RisultatoEsame;
import javax.swing.table.AbstractTableModel;
import java.util.Vector;
import java.util.Iterator;
import java.sql.*;
import operatore.gestioneAppelli.Appello;
import operatore.gestioneEsami.Esame;
import operatore.gestioneUtenti.Docente;
/**
 * Classe che modella il libretto di uno studente.
 * E' una vista dell'entità libretto presente nel database.
 * @author
 */
public class Libretto extends AbstractTableModel {

    Vector<RisultatoEsame> listaEsami;

    public Libretto(String matricola) {
        
        listaEsami = new Vector<RisultatoEsame>();
        byte a = 2;
        byte b = 6;

        Appello appello = new Appello(new Esame("ASD",a,b,false,"happy","Dijkstra"),"2 nov",new Docente("Alf","Des","boh","boh","boh","boh","boh",Docente.Tipo.ASSOCIATO),"2",a,"boh",Appello.Tipologia.ORALE);
        listaEsami.add(new RisultatoEsame(appello,b,true));
    }
    
    private void loadDataFromDataBase(String matricola) throws SQLException{
      /*  Connection con;
        Statement query;
        ResultSet result;
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
        con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","","");
        query = con.createStatement();
        //TODO esplicitare la query che recupera nome esame, crediti esami, data appello, voto, lode
        result = query.executeQuery("SELECT nome, voto, lode, crediti, data From ...");
        
        while(result.next()){
            //TODO qui va riempito il vector con i dati della result
        }
       */
    }
    
    
    public int getNumEsami(){
        return listaEsami.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public int getRowCount() {
        return listaEsami.size();
    }

    @Override
    public Class<?> getColumnClass(int column) {
        return getValueAt(0,column).getClass();
    }

    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "Esame";
            case 1: return "Voto";
            case 2: return "Lode";
            case 3: return "Data";
            default: return "";
        }
    }
    
    public Iterator<RisultatoEsame> iterator(){
        return listaEsami.iterator();
    }
    
    public Object getValueAt(int row, int columns) {
        
        RisultatoEsame tmp = listaEsami.get(row);
        
        switch(columns){
            case 0: return tmp.getAppello().getEsame().getNome();
            case 1: return tmp.getVoto();
            case 2: return tmp.isLode();
            case 3: return tmp.getAppello().getData();
            default: return "";
        }
    }

    @Override
    public boolean isCellEditable(int arg0, int arg1) {
        return false;
    }
    
    
    
    
    
}
