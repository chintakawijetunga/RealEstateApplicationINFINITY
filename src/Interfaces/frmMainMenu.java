package Interfaces;

import java.beans.PropertyVetoException;
import java.util.logging.*;
import javax.swing.ImageIcon;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class frmMainMenu extends javax.swing.JFrame {

    public frmMainMenu() {
        
        initComponents();
        this.setResizable(false);        
        setIconImage(new ImageIcon(getClass().getResource("/Images/MainMenu.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jMainDesktopPane = new javax.swing.JDesktopPane();
      jMainMenuBar = new javax.swing.JMenuBar();
      jMenuFile = new javax.swing.JMenu();
      jMIExit = new javax.swing.JMenuItem();
      jMenuRealEstate = new javax.swing.JMenu();
      jMIRealEstate = new javax.swing.JMenuItem();
      jMenuHelp = new javax.swing.JMenu();
      jMIAboutUs = new javax.swing.JMenuItem();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Infinity Real Estates >> Main Menu");

      javax.swing.GroupLayout jMainDesktopPaneLayout = new javax.swing.GroupLayout(jMainDesktopPane);
      jMainDesktopPane.setLayout(jMainDesktopPaneLayout);
      jMainDesktopPaneLayout.setHorizontalGroup(
         jMainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 912, Short.MAX_VALUE)
      );
      jMainDesktopPaneLayout.setVerticalGroup(
         jMainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 583, Short.MAX_VALUE)
      );

      jMenuFile.setMnemonic('F');
      jMenuFile.setText("File");

      jMIExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
      jMIExit.setText("Exit");
      jMIExit.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMIExitActionPerformed(evt);
         }
      });
      jMenuFile.add(jMIExit);

      jMainMenuBar.add(jMenuFile);

      jMenuRealEstate.setMnemonic('R');
      jMenuRealEstate.setText("Real Estate");

      jMIRealEstate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
      jMIRealEstate.setText("Real Estate");
      jMIRealEstate.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMIRealEstateActionPerformed(evt);
         }
      });
      jMenuRealEstate.add(jMIRealEstate);

      jMainMenuBar.add(jMenuRealEstate);

      jMenuHelp.setMnemonic('H');
      jMenuHelp.setText("Help");

      jMIAboutUs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
      jMIAboutUs.setText("About Us");
      jMIAboutUs.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMIAboutUsActionPerformed(evt);
         }
      });
      jMenuHelp.add(jMIAboutUs);

      jMainMenuBar.add(jMenuHelp);

      setJMenuBar(jMainMenuBar);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jMainDesktopPane)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jMainDesktopPane))
      );

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

    private void jMIExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIExitActionPerformed
       
        this.dispose();
    }//GEN-LAST:event_jMIExitActionPerformed

    private void jMIRealEstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRealEstateActionPerformed

        frmRealEstate obj = frmRealEstate.GetInstance();

        if (!obj.isVisible()) {
            jMainDesktopPane.add(obj);
            obj.setVisible(true);
        } else {
            obj.toFront();
        }

        try {
            obj.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIRealEstateActionPerformed

    private void jMIAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAboutUsActionPerformed
        // TODO add your handling code here:
        frmAboutUs obj = frmAboutUs.GetInstance();

        if (!obj.isVisible()) {
            jMainDesktopPane.add(obj);
            obj.setVisible(true);
        } else {
            obj.toFront();
        }
    }//GEN-LAST:event_jMIAboutUsActionPerformed

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
         BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;

         javax.swing.UIManager.setLookAndFeel("org.jb2011.lnf.beautyeye.BeautyEyeLookAndFeelWin");
         javax.swing.UIManager.put("RootPane.setupButtonVisible", false);

      } catch (javax.swing.UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(frmRealEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMainMenu().setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JMenuItem jMIAboutUs;
   private javax.swing.JMenuItem jMIExit;
   private javax.swing.JMenuItem jMIRealEstate;
   private javax.swing.JDesktopPane jMainDesktopPane;
   private javax.swing.JMenuBar jMainMenuBar;
   private javax.swing.JMenu jMenuFile;
   private javax.swing.JMenu jMenuHelp;
   private javax.swing.JMenu jMenuRealEstate;
   // End of variables declaration//GEN-END:variables
}
