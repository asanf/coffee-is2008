package studente.analisiCarriera;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * Classe che modella la vista delle statische degli esami per un dato studente  
 * @author  Demia Massaro
 */
public class VisualizzaStatisticheForm extends javax.swing.JFrame {
    
    
    public VisualizzaStatisticheForm(String mediaAritmetica,String mediaPonderata, String votoDiLaurea){
            initComponents();
            mediaAritmeticaLabel.setText(mediaAritmetica);
            mediaPonderataLabel.setText(mediaPonderata);
            votoLaureaStimatoLabel.setText(votoDiLaurea);
            this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);
       
    }
    
    /** Questo metodo è chiamato dall'intento del costruttore per inizializzare
     * il form
     * Generato da NetBeans.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statisticheTitle = new javax.swing.JLabel();
        promptMediaAritmetica = new javax.swing.JLabel();
        promptVotoLaurea = new javax.swing.JLabel();
        mediaAritmeticaLabel = new javax.swing.JLabel();
        votoLaureaStimatoLabel = new javax.swing.JLabel();
        promptmediaPonderata = new javax.swing.JLabel();
        mediaPonderataLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C o f f e e - Statistiche degli esami");

        statisticheTitle.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        statisticheTitle.setText("Statistiche");

        promptMediaAritmetica.setText("Media Aritmetica: ");

        promptVotoLaurea.setText("Voto di laurea atteso: ");

        promptmediaPonderata.setText("Media Ponderata: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statisticheTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(promptMediaAritmetica)
                            .addComponent(promptmediaPonderata)
                            .addComponent(promptVotoLaurea))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(votoLaureaStimatoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(mediaPonderataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mediaAritmeticaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statisticheTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mediaAritmeticaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(promptMediaAritmetica))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mediaPonderataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(promptmediaPonderata))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(promptVotoLaurea)
                    .addComponent(votoLaureaStimatoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel mediaAritmeticaLabel;
    private javax.swing.JLabel mediaPonderataLabel;
    private javax.swing.JLabel promptMediaAritmetica;
    private javax.swing.JLabel promptVotoLaurea;
    private javax.swing.JLabel promptmediaPonderata;
    private javax.swing.JLabel statisticheTitle;
    private javax.swing.JLabel votoLaureaStimatoLabel;
    // End of variables declaration//GEN-END:variables
    
}
