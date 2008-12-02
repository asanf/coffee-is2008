package operatore.gestioneEsami;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 * Classe che gestisce il form per l'eliminazione di un esame
 * @author Vincenzo Alessandro Cavaso
 */
public class RicercaEsameForm extends javax.swing.JFrame {
    
    /** Creates new form RicercaEsameForm */
    public RicercaEsameForm() {
        esami = new Esami();
        initComponents();
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        this.setTitle("Coffee - Ricerca Esami");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
        this.setResizable(false);
    }
    
    /** Metodo richiamato all'interno del costruttore per inizializzare il form
     * Generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        parametroRicercaEsame = new javax.swing.JTextField();
        ricercaEsameButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabellaRisultati = new javax.swing.JTable();
        modificaEsameButton = new javax.swing.JButton();
        eliminaEsameButton = new javax.swing.JButton();
        visualizzaSchedaEsameButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        jLabel1.setText("Ricerca Esame");

        jLabel2.setText("Nome Esame da Cercare ( o parte di):");

        parametroRicercaEsame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                parametroRicercaEsameKeyPressed(evt);
            }
        });

        ricercaEsameButton.setText("Cerca");
        ricercaEsameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ricercaEsameButtonMouseClicked(evt);
            }
        });

        tabellaRisultati.setModel(esami);
        jScrollPane1.setViewportView(tabellaRisultati);

        modificaEsameButton.setText("Modifica Esame");
        modificaEsameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificaEsameButtonMouseClicked(evt);
            }
        });

        eliminaEsameButton.setText("Elimina Esame");
        eliminaEsameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminaEsameButtonMouseClicked(evt);
            }
        });

        visualizzaSchedaEsameButton.setText("Visualizza Scheda Esame");
        visualizzaSchedaEsameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizzaSchedaEsameButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(parametroRicercaEsame)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ricercaEsameButton))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modificaEsameButton)
                        .addGap(18, 18, 18)
                        .addComponent(eliminaEsameButton)
                        .addGap(18, 18, 18)
                        .addComponent(visualizzaSchedaEsameButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ricercaEsameButton)
                    .addComponent(parametroRicercaEsame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificaEsameButton)
                    .addComponent(eliminaEsameButton)
                    .addComponent(visualizzaSchedaEsameButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ricercaEsameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ricercaEsameButtonMouseClicked
        try{
            EsameControlInterface esCont = (EsameControlInterface)Naming.lookup("rmi://localhost/GestioneEsami");
            esami.setData(esCont.ricercaEsame(parametroRicercaEsame.getText()));
        }catch(RemoteException e){
            JOptionPane.showMessageDialog(null, "Errore remoto:\n"+e.getMessage());
        }catch(MalformedURLException e){
            JOptionPane.showMessageDialog(null, "URL errato:\n"+e.getMessage());
        }catch(NotBoundException e){
            JOptionPane.showMessageDialog(null, "Nessun Bound per GestioneAppelli:\n"+e.getMessage());
        }
    }//GEN-LAST:event_ricercaEsameButtonMouseClicked

    private void parametroRicercaEsameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_parametroRicercaEsameKeyPressed
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER)
            ricercaEsameButton.doClick();
    }//GEN-LAST:event_parametroRicercaEsameKeyPressed

    private void modificaEsameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificaEsameButtonMouseClicked
        int selectedRow = tabellaRisultati.getSelectedRow();
        if(selectedRow<0)
            JOptionPane.showMessageDialog(null, "Nessun esame selezionato");
        else{
            ModificaEsameForm esForm = new ModificaEsameForm(esami.get(selectedRow));
            esForm.setVisible(true);
            try{
                EsameControlInterface esCont = (EsameControlInterface)Naming.lookup(("rmi://localhost/GestioneEsami"));
                esami.setData(esCont.ricercaEsame(""));
            }catch(RemoteException e){
                JOptionPane.showMessageDialog(null, "Errore remoto:\n"+e.getMessage());
            }catch(MalformedURLException e){
                JOptionPane.showMessageDialog(null, "URL errato:\n"+e.getMessage());
            }catch(NotBoundException e){
                JOptionPane.showMessageDialog(null, "Nessun Bound per GestioneAppelli:\n"+e.getMessage());
            }
        }
}//GEN-LAST:event_modificaEsameButtonMouseClicked

    private void eliminaEsameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminaEsameButtonMouseClicked

        int selectedRow = tabellaRisultati.getSelectedRow();
        if(selectedRow < 0)
            JOptionPane.showMessageDialog(null, "Nessun esame selezionato");
        else{
             try{   
                EsameControlInterface esCont = (EsameControlInterface)Naming.lookup("rmi://localhost/GestioneEsami");
                esCont.eliminaEsame(esami.get(selectedRow));
                esami.setData(esCont.ricercaEsame(""));
             }catch(RemoteException e){
                JOptionPane.showMessageDialog(null, "Errore remoto:\n"+e.getMessage());
             }catch(MalformedURLException e){
                JOptionPane.showMessageDialog(null, "URL errato:\n"+e.getMessage());
             }catch(NotBoundException e){
                JOptionPane.showMessageDialog(null, "Nessun Bound per GestioneAppelli:\n"+e.getMessage());
             }
            
        }
}//GEN-LAST:event_eliminaEsameButtonMouseClicked

    private void visualizzaSchedaEsameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizzaSchedaEsameButtonMouseClicked
        int selectedRow = tabellaRisultati.getSelectedRow();
        if(selectedRow < 0)
            JOptionPane.showMessageDialog(null, "Nessun esame selezionato");
        else{
            VisualizzaSchedaEsameForm esScheda = new VisualizzaSchedaEsameForm(esami.get(selectedRow));
            esScheda.setVisible(true);
        }
    }//GEN-LAST:event_visualizzaSchedaEsameButtonMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminaEsameButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificaEsameButton;
    private javax.swing.JTextField parametroRicercaEsame;
    private javax.swing.JButton ricercaEsameButton;
    private javax.swing.JTable tabellaRisultati;
    private javax.swing.JButton visualizzaSchedaEsameButton;
    // End of variables declaration//GEN-END:variables
    private Esami esami;
    
}
