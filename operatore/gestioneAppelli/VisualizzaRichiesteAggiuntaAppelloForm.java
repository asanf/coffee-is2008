package operatore.gestioneAppelli;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 * Classe che gestisce il form per visualizzare le richieste di aggiunta appello
 * @author  Antonio Sanfelice
 */
public class VisualizzaRichiesteAggiuntaAppelloForm extends javax.swing.JFrame {
    
    /** Creates new form VisualizzaRichiesteAggiuntaAppelloForm */
    public VisualizzaRichiesteAggiuntaAppelloForm() {
        initComponents();
        appelli = new Appelli();
        appelli.caricaRichieste();
        richiesteTable.setModel(appelli);
    }
    
    /** Questo metodo è richiamto nel costruttore per inizializzare il form
     * Generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        richiesteTable = new javax.swing.JTable();
        aggiungiAppelloButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        jLabel1.setText("Richieste in Attesa");

        jScrollPane1.setViewportView(richiesteTable);

        aggiungiAppelloButton.setText("Aggiungi Appello");
        aggiungiAppelloButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aggiungiAppelloButtonMouseClicked(evt);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aggiungiAppelloButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aggiungiAppelloButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aggiungiAppelloButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aggiungiAppelloButtonMouseClicked
        int selectedRow = richiesteTable.getSelectedRow();
        if(selectedRow<0)
            JOptionPane.showMessageDialog(null, "Devi selezionare una richiesta.");
        else{
            Appello tmp = appelli.get(selectedRow);
            try{
                AppelloControlInterface appCont = (AppelloControlInterface)Naming.lookup("rmi://localhost/GestioneAppelli");
                appCont.aggiungiAppello(tmp);
            }catch(RemoteException e){
                JOptionPane.showMessageDialog(null, "Errore remoto:\n"+e);
            }catch(MalformedURLException e){
                JOptionPane.showMessageDialog(null, "URL oggetto remoto non valido:\n"+e);
            }catch(NotBoundException e){
                JOptionPane.showMessageDialog(null, "Nessun bound per l'oggetto richiesto:\n"+e);
            }
        }
    }//GEN-LAST:event_aggiungiAppelloButtonMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungiAppelloButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable richiesteTable;
    // End of variables declaration//GEN-END:variables
    private Appelli appelli;
}
