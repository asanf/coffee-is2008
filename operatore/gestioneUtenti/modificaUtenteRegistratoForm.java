package operatore.gestioneUtenti;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 * Classe che gestiosce il form per la modifica di un utente registrato nel database
 * @author  Vincenzo Alessandro Cavaso
 */
public class modificaUtenteRegistratoForm extends javax.swing.JFrame {
    
    /** Creates new form modificaUtenteRegistratoForm */
    public modificaUtenteRegistratoForm(UtenteRegistrato utente) {
        initComponents();
        this.utente=utente;
        setFields(utente);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
        this.setResizable(false);
    }
    
    public void setFields(UtenteRegistrato utente){
        nomeField.setText(utente.getNome());
        cognomeField.setText(utente.getCognome());
        indirizzoField.setText(utente.getIndirizzo());
        dataNascitaField.setText(utente.getDataNascita());
        matricolaField.setText(utente.getMatricola());
        usernameField.setText(utente.getLogin());
        passwordField.setText(utente.getPassword());
        repeatedPasswordField.setText(utente.getPassword());
    }
    
    /**Questo metodo è chiamato all'interno del costruttore per inizializzare
     * il form
     * Generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        matricolaField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cognomeField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        indirizzoField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dataNascitaField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        cleanButton = new javax.swing.JButton();
        ModificaUtenteButton = new javax.swing.JButton();
        passwordField = new javax.swing.JTextField();
        repeatedPasswordField = new javax.swing.JTextField();

        setTitle("Modifica Utente");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 24));
        jLabel1.setText("Modifica Utente");

        jLabel2.setText("Nome:");

        jLabel5.setText("Matricola:");

        jLabel3.setText("Cognome:");

        jLabel10.setText("Indirizzo:");

        jLabel6.setText("Data di nascita: ");

        jLabel8.setText("Password: ");

        jLabel9.setText("Ripeti Password:");

        jLabel7.setText("Nome utente:");

        cleanButton.setText("Azzera Campi");
        cleanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cleanButtonMouseClicked(evt);
            }
        });

        ModificaUtenteButton.setText("Modifica");
        ModificaUtenteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificaUtenteButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addGap(230, 230, 230))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ModificaUtenteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                .addComponent(cleanButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(62, 62, 62))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ModificaUtenteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cognomeField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(indirizzoField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeField, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(matricolaField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(repeatedPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataNascitaField, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(cleanButton)
                                .addGap(0, 0, 0)))))
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
                    .addComponent(matricolaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cognomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(dataNascitaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indirizzoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repeatedPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificaUtenteButton)
                    .addComponent(cleanButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificaUtenteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificaUtenteButtonMouseClicked
        UtenteRegistrato newUtente = new UtenteRegistrato();
        newUtente.setCognome(cognomeField.getText());
        newUtente.setDataNascita(dataNascitaField.getText());
        newUtente.setIndirizzo(indirizzoField.getText());
        newUtente.setLogin(usernameField.getText());
        newUtente.setMatricola(matricolaField.getText());
        newUtente.setNome(nomeField.getText());
        newUtente.setPassword(passwordField.getText());
        try{
            GestioneUtentiControlInterface control = (GestioneUtentiControl)Naming.lookup("rmi://localhost/GestioneUtenti");
            control.modificaUtenteRegistrato(utente, newUtente);
        }catch(RemoteException e){
            JOptionPane.showMessageDialog(null, "Errore remoto:\n"+e.getMessage());
        }catch(MalformedURLException e){
            JOptionPane.showMessageDialog(null, "URL errato:\n"+e.getMessage());
        }catch(NotBoundException e){
            JOptionPane.showMessageDialog(null, "Nessun Bound per GestioneAppelli:\n"+e.getMessage());
        }
        setVisible(false);
    }//GEN-LAST:event_ModificaUtenteButtonMouseClicked

    private void cleanButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanButtonMouseClicked
        nomeField.setText("");
        cognomeField.setText("");
        matricolaField.setText("");
        dataNascitaField.setText("");
        indirizzoField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        repeatedPasswordField.setText("");
    }//GEN-LAST:event_cleanButtonMouseClicked
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ModificaUtenteButton;
    private javax.swing.JButton cleanButton;
    private javax.swing.JTextField cognomeField;
    private javax.swing.JTextField dataNascitaField;
    private javax.swing.JTextField indirizzoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField matricolaField;
    private javax.swing.JTextField nomeField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField repeatedPasswordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
    UtenteRegistrato utente;
}
