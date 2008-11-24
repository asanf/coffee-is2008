/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package operatore.gestioneAppelli;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 * Classe che modella una lista di appelli, visualizzabile tramite una JTable
 * @author
 */
public class Appelli extends AbstractTableModel{

    private Vector<Appello> appelli;
    
    public Appelli()
    {
        appelli = new Vector<Appello>();
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
    
    
}
