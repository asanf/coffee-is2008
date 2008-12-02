package operatore.gestioneEsami;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *Classe che modella il form per la gestione degli esami, contenente i boundary
 * per le operazioni di creazione, modifica, 
 * @author  Vincenzo Alessandro Cavaso
 */

public class GestioneEsamiForm extends javax.swing.JFrame {
    
    /** Creates new form GestioneEsamiForm */
    public GestioneEsamiForm() {
        initComponents();
        this.setTitle("Gestione Esami");
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
    }
    
    /** Metodo richiamato all'interno del costruttore per inizializzare il form
     * Generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        creaEsameButton = new javax.swing.JButton();
        ricercaEsameButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        creaEsameButton.setText("Crea Esame");
        creaEsameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creaEsameButtonMouseClicked(evt);
            }
        });

        ricercaEsameButton.setText("Ricerca Esame");
        ricercaEsameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ricercaEsameButtonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 24));
        jLabel1.setText("Gestione Esami");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(creaEsameButton)
                        .addGap(18, 18, 18)
                        .addComponent(ricercaEsameButton))
                    .addComponent(jLabel1))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creaEsameButton)
                    .addComponent(ricercaEsameButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void creaEsameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creaEsameButtonMouseClicked
        CreaEsameForm esameForm = new CreaEsameForm();
        esameForm.setVisible(true);
    }//GEN-LAST:event_creaEsameButtonMouseClicked

    private void ricercaEsameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ricercaEsameButtonMouseClicked
        RicercaEsameForm ricercaEsame = new RicercaEsameForm();
        ricercaEsame.setVisible(true);
    }//GEN-LAST:event_ricercaEsameButtonMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creaEsameButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton ricercaEsameButton;
    // End of variables declaration//GEN-END:variables
    
}
