package system;

import java.awt.Dimension;
import java.awt.Toolkit;
import operatore.gestioneUtenti.UtenteRegistrato;


public class HomeForm extends javax.swing.JFrame {
    
    /** Creates new form HomeForm */
    public HomeForm(UtenteRegistrato utente) {
        initComponents();
        this.setTitle("Coffee - Coffee's an Organazier For Friendly Exams Experience");
        this.setResizable(false);
        homeTitle.setText("Benvenuto " + utente.getNome());
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
    }
    
    /** Questo metodo è chiamato all'interno del costruttore per inizializzare
     * il form
     * Generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeTitle = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homeTitle.setFont(new java.awt.Font("DejaVu Sans", 0, 24));
        homeTitle.setText("Benvenuto");

        logoutButton.setText("Logout");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        this.setVisible(false);
        LoginForm login = new LoginForm();
        login.setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel homeTitle;
    private javax.swing.JButton logoutButton;
    // End of variables declaration//GEN-END:variables
    
}
