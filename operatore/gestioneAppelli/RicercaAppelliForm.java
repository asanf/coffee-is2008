
package operatore.gestioneAppelli;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 *Classe che gestiosce il form per la ricercad degli appelli
 * @author Antonio Sanfelice
 */
public class RicercaAppelliForm extends javax.swing.JFrame {
    
    /** Creates new form RicercaAppelliForm */
    public RicercaAppelliForm() {
        appelli = new Appelli();
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
    }
    
    /** Questo metodo è richiamto nel costruttore per inizializzare il form
     * Generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        parametroRicerca = new javax.swing.JComboBox();
        valoreDaCercare = new javax.swing.JTextField();
        ricercaAppelliButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        modificaAppelloButton = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setTitle("Coffee - Ricerca Appelli");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        jLabel1.setText("Ricerca Appelli");

        jLabel2.setText("Campo da cercare:");

        parametroRicerca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "esame", "docente", "data", "aula" }));

        valoreDaCercare.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valoreDaCercareKeyPressed(evt);
            }
        });

        ricercaAppelliButton.setText("Cerca");
        ricercaAppelliButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ricercaAppelliButtonMouseClicked(evt);
            }
        });

        jTable1.setModel(appelli);
        jScrollPane1.setViewportView(jTable1);

        modificaAppelloButton.setText("Modifica Appello");
        modificaAppelloButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificaAppelloButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(parametroRicerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valoreDaCercare, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(ricercaAppelliButton))
                    .addComponent(jLabel1)
                    .addComponent(modificaAppelloButton))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(parametroRicerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valoreDaCercare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ricercaAppelliButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(modificaAppelloButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ricercaAppelliButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ricercaAppelliButtonMouseClicked
        try{
            AppelloControlInterface appCont = (AppelloControlInterface)Naming.lookup("rmi://localhost/GestioneAppelli");
            appelli.setData(appCont.ricercaAppello((String)parametroRicerca.getSelectedItem(), valoreDaCercare.getText()));   
        }catch(RemoteException e){
            JOptionPane.showMessageDialog(null, "Errore remoto:\n"+e.getMessage());
        }catch(MalformedURLException e){
            JOptionPane.showMessageDialog(null, "URL errato:\n"+e.getMessage());
        }catch(NotBoundException e){
            JOptionPane.showMessageDialog(null, "Nessun Bound per GestioneAppelli:\n"+e.getMessage());
        }
}//GEN-LAST:event_ricercaAppelliButtonMouseClicked

    private void valoreDaCercareKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valoreDaCercareKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            ricercaAppelliButtonMouseClicked(new java.awt.event.MouseEvent(ricercaAppelliButton, 0, 0, 0, 0, 0, 0, rootPaneCheckingEnabled));
        }
    }//GEN-LAST:event_valoreDaCercareKeyPressed

    private void modificaAppelloButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificaAppelloButtonMouseClicked
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow<0)
            JOptionPane.showMessageDialog(null, "Nessun appello selezionato");
        else{
            ModificaAppelloForm modAppForm = new ModificaAppelloForm(appelli.get(selectedRow));
            modAppForm.setVisible(true);
        try{
            AppelloControlInterface appCont = (AppelloControlInterface)Naming.lookup("rmi://localhost/GestioneAppelli");
            appelli.setData(appCont.ricercaAppello("esame", ""));
        }catch(RemoteException e){
            JOptionPane.showMessageDialog(null, "Errore remoto:\n"+e.getMessage());
        }catch(MalformedURLException e){
            JOptionPane.showMessageDialog(null, "URL errato:\n"+e.getMessage());
        }catch(NotBoundException e){
            JOptionPane.showMessageDialog(null, "Nessun Bound per GestioneAppelli:\n"+e.getMessage());
        }
        }
        
    }//GEN-LAST:event_modificaAppelloButtonMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificaAppelloButton;
    private javax.swing.JComboBox parametroRicerca;
    private javax.swing.JButton ricercaAppelliButton;
    private javax.swing.JTextField valoreDaCercare;
    // End of variables declaration//GEN-END:variables
    Appelli appelli;
}
