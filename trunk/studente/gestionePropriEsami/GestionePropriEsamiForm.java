package studente.gestionePropriEsami;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;
import operatore.gestioneUtenti.Studente;

/**
 * Classe che gestisce il form di Gestione propri esami
 * @author  Demia Massaro
 */
public class GestionePropriEsamiForm extends javax.swing.JFrame {
    
    
    public GestionePropriEsamiForm(Studente studente) {
        this.studente=studente;
        initComponents();
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        this.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
    }
    
    /** Questo metodo è chiamato all'interno del costruttore per inizializzare
     * il form
     * Generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        visualizzaAppelliDisponibiliButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C o f f e e - Gestione Propri Esami");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        jLabel1.setText("Gestione Propri Esami");

        visualizzaAppelliDisponibiliButton.setText("Visualizza Appelli Disponibili");
        visualizzaAppelliDisponibiliButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizzaAppelliDisponibiliButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(visualizzaAppelliDisponibiliButton))
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visualizzaAppelliDisponibiliButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visualizzaAppelliDisponibiliButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizzaAppelliDisponibiliButtonMouseClicked
        try{    
            GestionePropriEsamiControlInterface gpec = (GestionePropriEsamiControlInterface)Naming.lookup("rmi://localhost/GestionePropriEsami");
            gpec.visualizzaAppelliDisponibili(studente);
        }catch(RemoteException e){
            JOptionPane.showMessageDialog(null, "Errore remoto:\n"+e.getMessage());
        }catch(MalformedURLException e){
            JOptionPane.showMessageDialog(null, "URL errato:\n"+e.getMessage());
        }catch(NotBoundException e){
            JOptionPane.showMessageDialog(null, "Nessun Bound per GestioneAppelli:\n"+e.getMessage());
        }
    }//GEN-LAST:event_visualizzaAppelliDisponibiliButtonMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton visualizzaAppelliDisponibiliButton;
    // End of variables declaration//GEN-END:variables
    private Studente studente;
 
}
