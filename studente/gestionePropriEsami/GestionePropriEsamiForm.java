/*
 * GestionePropriEsamiForm.java
 *
 * Created on 24 novembre 2008, 11.59
 */

package studente.gestionePropriEsami;

import javax.swing.JOptionPane;

/**
 *
 * @author  e-vampire
 */
public class GestionePropriEsamiForm extends javax.swing.JFrame {
    
    /** Creates new form GestionePropriEsamiForm */
    public GestionePropriEsamiForm() {
        initComponents();
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        this.setResizable(false);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        visualizzaAppelliDisponibiliButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        jLabel1.setText("Gestione Propri Esami");

        visualizzaAppelliDisponibiliButton.setText("Visualizza Appelli Disponibili");
        visualizzaAppelliDisponibiliButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizzaAppelliDisponibiliButtonMouseClicked(evt);
            }
        });

        jButton2.setText("Visualizza Disclaimer");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(visualizzaAppelliDisponibiliButton)
                        .addGap(12, 12, 12)
                        .addComponent(jButton2)))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visualizzaAppelliDisponibiliButton)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        JOptionPane.showMessageDialog(null, "No, non siamo pazzi. \nC'è un solo pulsante perchè le altre funzioni devono essere ancora implementate. \nDio benedica i requisiti a bassa priorità");
    }//GEN-LAST:event_jButton2MouseClicked

    private void visualizzaAppelliDisponibiliButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizzaAppelliDisponibiliButtonMouseClicked
        GestionePropriEsamiControl gpec = new GestionePropriEsamiControl();
        gpec.visualizzaAppelliDisponibili();
    }//GEN-LAST:event_visualizzaAppelliDisponibiliButtonMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton visualizzaAppelliDisponibiliButton;
    // End of variables declaration//GEN-END:variables
    
}
