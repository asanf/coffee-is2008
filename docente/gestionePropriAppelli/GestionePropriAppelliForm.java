package docente.gestionePropriAppelli;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author  e-vampire
 */
public class GestionePropriAppelliForm extends javax.swing.JFrame {
    
    /** Crea il nuovo form GestionePropriAppelliForm */
    public GestionePropriAppelliForm() {
        initComponents();
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
        
    }
    
    /** Questo metodo è chiamato all'interno del costruttore per inizializzare
     * il form.
     * Generato da NetBeans.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        richiediAggiuntaAppelloButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ricercaPrenotatiButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coffee - Gestione Propri Appelli");

        richiediAggiuntaAppelloButton.setText("Richiedi Aggiunta Appello");
        richiediAggiuntaAppelloButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                richiediAggiuntaAppelloButtonMouseClicked(evt);
            }
        });

        jButton2.setText("Modifica Data Appello");

        ricercaPrenotatiButton.setText("Ricerca Prenotati");
        ricercaPrenotatiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ricercaPrenotatiButtonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        jLabel1.setText("Gestione Propri Appelli");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ricercaPrenotatiButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(richiediAggiuntaAppelloButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(richiediAggiuntaAppelloButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(ricercaPrenotatiButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void richiediAggiuntaAppelloButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_richiediAggiuntaAppelloButtonMouseClicked
        RichiediAggiuntaAppelloForm aggAppFrm=new RichiediAggiuntaAppelloForm();
        aggAppFrm.setVisible(true);
}//GEN-LAST:event_richiediAggiuntaAppelloButtonMouseClicked

    private void ricercaPrenotatiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ricercaPrenotatiButtonMouseClicked
        RicercaPrenotatiForm ricPrenFrm= new RicercaPrenotatiForm();
        ricPrenFrm.setVisible(true);
    }//GEN-LAST:event_ricercaPrenotatiButtonMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionePropriAppelliForm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton ricercaPrenotatiButton;
    private javax.swing.JButton richiediAggiuntaAppelloButton;
    // End of variables declaration//GEN-END:variables
    
}
