package operatore;
import operatore.gestioneAppelli.GestioneAppelliForm;
import operatore.gestioneEsami.GestioneEsamiForm;
import operatore.gestioneUtenti.GestioneUtentiForm;
import operatore.gestioneUtenti.Operatore;
import system.HomeForm;
/**
 *
 * @author  e-vampire
 */
public class HomeOperatoreForm extends HomeForm {
    
    /** Creates new form HomeOperatoreForm */
    public HomeOperatoreForm(Operatore operatore) {
        super(operatore);
        initComponents();
    }
    
    /**Questo metodo è chiamato all'interno del costruttore per inizializzare il
     * form
     * Generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gestioneUtentiButton = new javax.swing.JButton();
        gestioneEsamiButton = new javax.swing.JButton();
        gestioneAppelliButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gestioneUtentiButton.setText("Gestione Utenti");
        gestioneUtentiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestioneUtentiButtonMouseClicked(evt);
            }
        });

        gestioneEsamiButton.setText("Gestione Esami");
        gestioneEsamiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestioneEsamiButtonMouseClicked(evt);
            }
        });

        gestioneAppelliButton.setText("Gestione Appelli");
        gestioneAppelliButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestioneAppelliButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gestioneAppelliButton)
                    .addComponent(gestioneEsamiButton)
                    .addComponent(gestioneUtentiButton))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(gestioneUtentiButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gestioneEsamiButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gestioneAppelliButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestioneUtentiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestioneUtentiButtonMouseClicked
        GestioneUtentiForm utentiForm = new GestioneUtentiForm();
        utentiForm.setVisible(true);
    }//GEN-LAST:event_gestioneUtentiButtonMouseClicked

    private void gestioneEsamiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestioneEsamiButtonMouseClicked
        GestioneEsamiForm esamiForm = new GestioneEsamiForm();
        esamiForm.setVisible(true);
    }//GEN-LAST:event_gestioneEsamiButtonMouseClicked

    private void gestioneAppelliButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestioneAppelliButtonMouseClicked
        GestioneAppelliForm appelliForm = new GestioneAppelliForm();
        appelliForm.setVisible(true);
    }//GEN-LAST:event_gestioneAppelliButtonMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gestioneAppelliButton;
    private javax.swing.JButton gestioneEsamiButton;
    private javax.swing.JButton gestioneUtentiButton;
    // End of variables declaration//GEN-END:variables
    
}
