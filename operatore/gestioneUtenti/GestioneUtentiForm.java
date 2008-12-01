package operatore.gestioneUtenti;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * Classe che modella il form per la gestione degli utenti.
 * @author  e-vampire
 */
public class GestioneUtentiForm extends javax.swing.JFrame {
    
    /** Creates new form GestioneUtentiForm */
    public GestioneUtentiForm() {
        initComponents();
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
        this.setResizable(false);
    }
    
    /** Questo metodo è chiamato all'interno del costruttore per inizializzare
     * il form
     * Generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        creaUtenteButton = new javax.swing.JButton();
        ricercaUtenteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C o f f e e - Gestione Utenti");

        creaUtenteButton.setText("Crea Utente");
        creaUtenteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creaUtenteButtonMouseClicked(evt);
            }
        });

        ricercaUtenteButton.setText("Ricerca Utente");
        ricercaUtenteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ricercaUtenteButtonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 24));
        jLabel1.setText("Gestione Utenti");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(creaUtenteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ricercaUtenteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(creaUtenteButton)
                .addGap(18, 18, 18)
                .addComponent(ricercaUtenteButton)
                .addGap(99, 99, 99))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void creaUtenteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creaUtenteButtonMouseClicked
        CreaUtenteForm form = new CreaUtenteForm();
        form.setVisible(true);
    }//GEN-LAST:event_creaUtenteButtonMouseClicked

    private void ricercaUtenteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ricercaUtenteButtonMouseClicked
        RicercaUtenteForm form = new RicercaUtenteForm ();
        form.setVisible(true);
}//GEN-LAST:event_ricercaUtenteButtonMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestioneUtentiForm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creaUtenteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton ricercaUtenteButton;
    // End of variables declaration//GEN-END:variables
    
}
