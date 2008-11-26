/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package docente.gestionePropriAppelli;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import operatore.gestioneAppelli.Appello;

/**
 *
 * @author e-vampire
 */
public class Prenotati extends AbstractTableModel{

    private Vector<Prenotato> prenotati;
    
    public Prenotati(Appello appello){
        prenotati = new Vector<Prenotato>();
        try{
            loadDataFromFile();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
    public void loadDataFromFile() throws IOException, ClassNotFoundException{
    
        // un file per ogni appello?
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("prenotati.dat"));
        Prenotato tmp;
        while((tmp = (Prenotato)in.readObject())!=null)
            prenotati.add(tmp);
        in.close();
    }

    public int getColumnCount() {
        return 4;
    }

    public int getRowCount() {
        return prenotati.size();
    }

    public Object getValueAt(int arg0, int arg1) {
        //TODO
        return null;
    }
    
    
    
    
}
