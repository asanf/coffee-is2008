package system;


import docente.HomeDocenteForm;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import operatore.HomeOperatoreForm;
import operatore.gestioneUtenti.Docente;
import operatore.gestioneUtenti.Operatore;
import operatore.gestioneUtenti.Studente;
import operatore.gestioneUtenti.UtenteRegistrato;
import studente.HomeStudenteForm;



/**
 *
 * @author  
 */
public class LoginForm extends javax.swing.JFrame {
    
    /** Creates new form LoginFrame */
    public LoginForm() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
        this.setResizable(false);
        this.setTitle("C o f f e e ");
    }
    
    /** Questo metodo è chiamato dall'intento del costruttore per inizializzare
     * il form
     * Generato da NetBeans.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomeUtenteLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        richiediAggiuntaAccountButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 24));
        jLabel1.setText("Coffee Login");

        nomeUtenteLabel.setText("Nome Utente: ");

        passwordLabel.setText("Password: ");

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });

        richiediAggiuntaAccountButton.setText("Richiedi Account");
        richiediAggiuntaAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                richiediAggiuntaAccountButtonMouseClicked(evt);
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(loginButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(richiediAggiuntaAccountButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nomeUtenteLabel)
                                .addComponent(passwordLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordField)
                                .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeUtenteLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(richiediAggiuntaAccountButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        LoginControl loginControl = new LoginControl();
        UtenteRegistrato utente = loginControl.checkLogin(usernameTextField.getText(), passwordField.getText());
        HomeForm home = null;
        if(utente == null){
            JOptionPane.showMessageDialog(null,"Nome utente o Password NON validi");
        }else{
            JOptionPane.showMessageDialog(null, "Benvenuto/a "+ utente.getNome() + " " + utente.getCognome() + "\nOra verrai reindirizzato alla tua home");
            if(utente instanceof Studente){
                home = new HomeStudenteForm((Studente)utente);
            }else if(utente instanceof Docente){
                home = new HomeDocenteForm((Docente)utente);
            }else if(utente instanceof Operatore){
                home = new HomeOperatoreForm((Operatore)utente);
            }
            home.setVisible(true);
            this.setVisible(false);
        }       
        
    }//GEN-LAST:event_loginButtonMouseClicked

    private void richiediAggiuntaAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_richiediAggiuntaAccountButtonMouseClicked
        RichiediAggiuntaAccountForm aggiuntaAccountForm = new RichiediAggiuntaAccountForm();
        aggiuntaAccountForm.setVisible(true);
    }//GEN-LAST:event_richiediAggiuntaAccountButtonMouseClicked

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            loginButtonMouseClicked(new java.awt.event.MouseEvent(loginButton, 0, 0, 0, 0, 0, 0, rootPaneCheckingEnabled));
        }
    }//GEN-LAST:event_passwordFieldKeyPressed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel nomeUtenteLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton richiediAggiuntaAccountButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
    
}
