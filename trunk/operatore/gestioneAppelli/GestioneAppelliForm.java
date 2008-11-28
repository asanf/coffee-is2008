
package operatore.gestioneAppelli;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * Classe che modella il form per la gestione degli appelli
 * @author  
 */
public class GestioneAppelliForm extends javax.swing.JFrame {
    
    /** Creates new form GestioneAppelliForm */
    public GestioneAppelliForm() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
    }
    
    /** Questo metodo è chiamato all'interno del costruttore per inizializzare il
     * form
     * Generato da NetBeans
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ricercaAppelliButton = new javax.swing.JButton();

        setTitle("Coffee - Gestione Appelli");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        jLabel1.setText("Gestione Appelli");

        jButton1.setText("Visualizza Richieste Aggiunta Appello");

        ricercaAppelliButton.setText("Ricerca Appelli");
        ricercaAppelliButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ricercaAppelliButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ricercaAppelliButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ricercaAppelliButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ricercaAppelliButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ricercaAppelliButtonMouseClicked
        RicercaAppelliForm ricercaAppelli = new RicercaAppelliForm();
        ricercaAppelli.setVisible(true);
}//GEN-LAST:event_ricercaAppelliButtonMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton ricercaAppelliButton;
    // End of variables declaration//GEN-END:variables
    
}
