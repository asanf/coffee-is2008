package studente;

import operatore.gestioneUtenti.Studente;
import studente.analisiCarriera.AnalisiCarrieraForm;
import studente.gestionePropriEsami.GestionePropriEsamiForm;
import system.HomeForm;

/**
 *
 * @author  
 */
public class HomeStudenteForm extends HomeForm {
    
    /** Creates new form HomeStudenteForm */
    public HomeStudenteForm(Studente studente) {
        super(studente);
        this.studente = studente;
        initComponents();
    }
    
    /** Questo metodo viene richiamato all'interno del costruttore quando viene
     * inizializzato il form
     * Generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        analisiCarrieraButton = new javax.swing.JButton();
        gestionePropriEsamiButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        analisiCarrieraButton.setText("Analisi Carriera");
        analisiCarrieraButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                analisiCarrieraButtonMouseClicked(evt);
            }
        });

        gestionePropriEsamiButton.setText("Gestione Propri Esami");
        gestionePropriEsamiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionePropriEsamiButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(analisiCarrieraButton)
                    .addComponent(gestionePropriEsamiButton))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(analisiCarrieraButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gestionePropriEsamiButton)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analisiCarrieraButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analisiCarrieraButtonMouseClicked
        AnalisiCarrieraForm form = new AnalisiCarrieraForm(studente);
        form.setVisible(true);
}//GEN-LAST:event_analisiCarrieraButtonMouseClicked

    private void gestionePropriEsamiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionePropriEsamiButtonMouseClicked
        GestionePropriEsamiForm exForm = new GestionePropriEsamiForm();
        exForm.setVisible(true);
}//GEN-LAST:event_gestionePropriEsamiButtonMouseClicked
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analisiCarrieraButton;
    private javax.swing.JButton gestionePropriEsamiButton;
    // End of variables declaration//GEN-END:variables
    private Studente studente;
}
