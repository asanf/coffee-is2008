package docente;

import docente.gestionePropriAppelli.GestionePropriAppelliForm;
import operatore.gestioneUtenti.Docente;
import system.HomeForm;

/**
 * Classe che gestisce la home di Docente
 * @author  
 */
public class HomeDocenteForm extends HomeForm {
    
    /** Crea il nuovo form HomeDocenteForm */
    public HomeDocenteForm(Docente docente) {
        super(docente);
        this.docente=docente;
        initComponents();
    }
    
    /**
     * HO CANCELLATO LA TRADUZIONE
     * Codice generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gestionePropriAppelliButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gestionePropriAppelliButton.setText("Gestione Propri Appelli");
        gestionePropriAppelliButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionePropriAppelliButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gestionePropriAppelliButton)
                .addContainerGap(268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(gestionePropriAppelliButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestionePropriAppelliButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionePropriAppelliButtonMouseClicked
       GestionePropriAppelliForm appForm=new GestionePropriAppelliForm(docente);
       appForm.setVisible(true);
    }//GEN-LAST:event_gestionePropriAppelliButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gestionePropriAppelliButton;
    // End of variables declaration//GEN-END:variables
    private Docente docente;
}
