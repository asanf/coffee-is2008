
package operatore.gestioneEsami;

/**
 * Classe che modella il form per la crazione di un esame
 * @author  
 */
public class CreaEsameForm extends javax.swing.JFrame {
    
    /** Creates new form CreaEsameForm */
    public CreaEsameForm() {
        initComponents();
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
    }
    
    /**Questo metodo è chiamato all'interno del costruttore per inizializzare il
     * form
     * Generato da NetBeans.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        oreFrontaliField = new javax.swing.JTextField();
        oreLaboratorioField = new javax.swing.JTextField();
        creditiField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        programmaTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        azzeraCampiButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dati per il nuovo esame");

        jLabel2.setText("Nome:");

        jLabel3.setText("Ore frontali:");

        jLabel4.setText("Ore laboratorio:");

        jLabel5.setText("Crediti:");

        jLabel6.setText("Programma");

        oreFrontaliField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oreFrontaliFieldActionPerformed(evt);
            }
        });

        oreLaboratorioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oreLaboratorioFieldActionPerformed(evt);
            }
        });

        creditiField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditiFieldActionPerformed(evt);
            }
        });

        programmaTextArea.setColumns(20);
        programmaTextArea.setRows(5);
        jScrollPane1.setViewportView(programmaTextArea);

        jButton1.setText("Invia");

        azzeraCampiButton.setText("Azzera Campi");
        azzeraCampiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                azzeraCampiButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                    .addComponent(creditiField, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                    .addComponent(oreLaboratorioField, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                    .addComponent(oreFrontaliField, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                    .addComponent(nomeField, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(azzeraCampiButton)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(oreFrontaliField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(oreLaboratorioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(creditiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(azzeraCampiButton)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oreFrontaliFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oreFrontaliFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_oreFrontaliFieldActionPerformed

    private void oreLaboratorioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oreLaboratorioFieldActionPerformed

}//GEN-LAST:event_oreLaboratorioFieldActionPerformed

    private void creditiFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditiFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_creditiFieldActionPerformed

    private void azzeraCampiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_azzeraCampiButtonMouseClicked
        nomeField.setText("");
        oreFrontaliField.setText("");
        oreLaboratorioField.setText("");
        creditiField.setText("");
        programmaTextArea.setText("");
}//GEN-LAST:event_azzeraCampiButtonMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton azzeraCampiButton;
    private javax.swing.JTextField creditiField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeField;
    private javax.swing.JTextField oreFrontaliField;
    private javax.swing.JTextField oreLaboratorioField;
    private javax.swing.JTextArea programmaTextArea;
    // End of variables declaration//GEN-END:variables
    
}
