/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amzposttool;

import dataTypes.SimulationResult;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;

/**
 *
 * @author Kailin
 */
public class AnalysisFrame extends javax.swing.JFrame {

    /**
     * Creates new form AnalysisFrame
     */
    private String baselinePath = "";
    private String comparePath = "";
    private SimulationResult baselineRes;
    private SimulationResult compareRes;
    private int fileIterator = 0;

    private int frameX = 1874;
    private int frameY = 607;
    private int picX = 900;
    private int picY = 506;
    private int sliderMax=900;
    private int sliderMin=300;

    public AnalysisFrame(String _base, String _compare) {
        baselinePath = _base;
        comparePath = _compare;
        initComponents();
        System.out.println("base" + baselinePath);
        System.out.println("compare" + comparePath);
        baselineRes = new SimulationResult(baselinePath);
        compareRes = new SimulationResult(comparePath);
        fileIterator = 0;
        
        jSlider1.setMaximum(sliderMax);
        jSlider1.setMinimum(sliderMin);
        jSlider1.setValue(picX);
        jLabel1.setLocation(20, 20);
        jLabel2.setLocation(20+jLabelBaselinePic.getWidth()+10, 20);
        jLabelBaselinePic.setLocation(20, 100);
        jLabelComparePic.setLocation(20+jLabelBaselinePic.getWidth()+10, picY);
        
        this.updateImages();
        //jSlider1.addChangeListener();
        /*
        jLabel3.setIcon(createImageIcon(this.baselinePath + "\\TPC_X11_x=400.png"));
        jLabel4.setIcon(createImageIcon(this.comparePath + "\\TPC_X11_x=400.png"));
         */
    }

    public AnalysisFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelComparePic = new javax.swing.JLabel();
        jLabelBaselinePic = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1800, 670));

        jLabel1.setText("Baseline");

        jLabel2.setText("Compare");

        jButton2.setText("--->");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("<---");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 618, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(153, 153, 153))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelBaselinePic, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelComparePic, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(257, 257, 257))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelBaselinePic, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabelComparePic, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        showNext();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        showPrevious();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        picX=jSlider1.getValue();
        picY=jSlider1.getValue()*9/16;
        updateImages();
        
    }//GEN-LAST:event_jSlider1StateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnalysisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnalysisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnalysisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnalysisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnalysisFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBaselinePic;
    private javax.swing.JLabel jLabelComparePic;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
 private ImageIcon createImageIcon(String picPath) {

        javax.swing.ImageIcon picIcon = new javax.swing.ImageIcon(picPath);
        java.awt.Image picImageScaled = picIcon.getImage().getScaledInstance(picX, picY, HEIGHT);
        javax.swing.ImageIcon picIconScaled = new javax.swing.ImageIcon(picImageScaled);

        return picIconScaled;
    }

    private void showNext() {
        if (fileIterator < (baselineRes.getSize() - 1)) {
            fileIterator++;
            updateImages();
        }
    }

    private void showPrevious() {
        if (fileIterator > 1) {
            fileIterator--;
            updateImages();
        }
    }

    private void updateImages() {
        this.setSize(frameX,frameY);
        jLabelBaselinePic.setIcon(createImageIcon(this.baselineRes.getListOfFiles().get(fileIterator).getAbsolutePath()));
        jLabelBaselinePic.setSize(picX,picY);
        jLabelComparePic.setIcon(createImageIcon(this.compareRes.getListOfFiles().get(fileIterator).getAbsolutePath()));
        jLabelBaselinePic.setSize(picX,picY);
        jLabel1.setText("Baseline: " + this.baselineRes.getListOfFiles().get(fileIterator).getAbsolutePath());
        jLabel2.setText("Compare: " + this.baselineRes.getListOfFiles().get(fileIterator).getAbsolutePath());
        jLabel1.setLocation(20, 20);
        jLabel2.setLocation(20+jLabelBaselinePic.getWidth()+10, 20);
        jLabelBaselinePic.setLocation(20, 100);
        jLabelComparePic.setLocation(20+jLabelBaselinePic.getWidth()+10, 100);
    }
    


}
