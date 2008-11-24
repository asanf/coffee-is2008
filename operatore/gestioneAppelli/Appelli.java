/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package operatore.gestioneAppelli;

import java.util.Date;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import operatore.gestioneEsami.Esame;
import operatore.gestioneUtenti.Docente;

/**
 * Classe che modella una lista di appelli, visualizzabile tramite una JTable
 * @author
 */
public class Appelli extends AbstractTableModel{

    private Vector<Appello> appelli;
    
    public Appelli()
    {
        appelli = new Vector<Appello>();
        byte a,b;
        a = 2;
        b = 6;
        Date data = new Date();
        data.setDate(11);
        data.setMonth(7);
        data.setYear(2008);
        Appello appello = new Appello(new Esame("ASD",a,b,false,"happy","Dijkstra"),data,new Docente("Alf","Des","boh","boh","boh","boh","boh",Docente.Tipo.ASSOCIATO),"2",a,"boh",Appello.Tipologia.ORALE);
        appelli.add(appello);
    }

    public int getColumnCount() {
        return 5;
    }

    public int getRowCount() {
        return appelli.size();
    }

    public Object getValueAt(int row, int column) {
        Appello tmp = appelli.get(row);
        switch(column){
            case 0: return tmp.getEsame().getNome();
            case 1: return tmp.getData();
            case 2: return tmp.getOraInizio();
            case 3: return tmp.getTipologia();
            case 4: return tmp.getDocente().getCognome() + " " + tmp.getDocente().getNome().charAt(0) + ".";
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Esame";
            case 1: return "Data";
            case 2: return "Ore";
            case 3: return "Tipo";
            case 4: return "Docente";
            default: return null;
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    
    public Appello get(int row){
        return appelli.get(row);
    }
    
}
