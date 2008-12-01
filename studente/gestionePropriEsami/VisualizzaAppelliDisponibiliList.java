package studente.gestionePropriEsami;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;
import operatore.gestioneAppelli.Appelli;
import operatore.gestioneAppelli.Appello;
import operatore.gestioneUtenti.Studente;

/**
 * Classe che modella la lista degli appelli a cui un dato studente può prenotarsi
 * @author  e-vampire
 */
public class VisualizzaAppelliDisponibiliList extends javax.swing.JFrame {
    
    /** Creates new form VisualizzaAppelliDisponibiliList */
    public VisualizzaAppelliDisponibiliList(Studente studente) {
        this.studente=studente;
        initComponents();
        this.setResizable(false);
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
    }
    
    /** Questo metodo è chiamato dall'intento del costruttore per inizializzare
     * il form
     * Generato da NetBeans.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        richiediPrenotazioneAppelloButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C o f f e e - Appelli Disponibili");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        jLabel1.setText("Appelli Disponibili");

        jTable1.setModel(new Appelli());
        jScrollPane1.setViewportView(jTable1);

        richiediPrenotazioneAppelloButton.setText("Richiedi Prenotazione Appello");
        richiediPrenotazioneAppelloButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                richiediPrenotazioneAppelloButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(richiediPrenotazioneAppelloButton))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(richiediPrenotazioneAppelloButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void richiediPrenotazioneAppelloButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_richiediPrenotazioneAppelloButtonMouseClicked

        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Nessun appello selezionato");
        } else {
            Appelli appelli = new Appelli();
            Appello selezionato = appelli.get(selectedRow);
            try{
                GestionePropriEsamiControlInterface esContr = (GestionePropriEsamiControlInterface)Naming.lookup("rmi://localhost/GestionePropriEsami");
                esContr.prenotaEsame(selezionato, studente);
                JOptionPane.showMessageDialog(null, "Ti sei prenotato all'esame di " + selezionato.getEsame() + "\n  " + selezionato.getEsame());
            }catch(RemoteException e){
                JOptionPane.showMessageDialog(null, "Errore remoto:\n"+e.getMessage());
            }catch(MalformedURLException e){
                JOptionPane.showMessageDialog(null, "URL errato:\n"+e.getMessage());
            }catch(NotBoundException e){
                JOptionPane.showMessageDialog(null, "Nessun Bound per GestioneAppelli:\n"+e.getMessage());
        }
        }
    }//GEN-LAST:event_richiediPrenotazioneAppelloButtonMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton richiediPrenotazioneAppelloButton;
    // End of variables declaration//GEN-END:variables
    private Studente studente;
}
