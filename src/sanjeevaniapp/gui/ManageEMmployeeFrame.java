/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.gui;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import sanjeevaniapp.pojo.UserProfile;

/**
 *
 * @author Ramkumar
 */
public class ManageEMmployeeFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManageEMmployeeFrame
     */
    public ManageEMmployeeFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblGreet.setText("Hello, USER-"+UserProfile.getUserName());
        Image icon = Toolkit.getDefaultToolkit().getImage("src/sanjeevaniapp/icons/Logo4.png");    
        this.setIconImage(icon); 
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblGreet = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lblViewEmp = new javax.swing.JLabel();
        lblRemoveEmp = new javax.swing.JLabel();
        lblAddEmp = new javax.swing.JLabel();
        lblUpdateEmp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("     Sanjeevani Application");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 470, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setToolTipText("");
        jLabel3.setMaximumSize(new java.awt.Dimension(1222, 500));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1070, 430));

        jPanel3.setBackground(new java.awt.Color(209, 209, 247));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGreet.setBackground(new java.awt.Color(0, 0, 0));
        lblGreet.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblGreet.setForeground(new java.awt.Color(255, 255, 255));
        lblGreet.setText("Hello, USER-Ramkumar");
        jPanel1.add(lblGreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 418, 64));

        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(51, 102, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 14, 660, -1));

        lblViewEmp.setBackground(new java.awt.Color(0, 204, 204));
        lblViewEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblViewEmp.setText("              View Employee");
        lblViewEmp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblViewEmp.setOpaque(true);
        lblViewEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewEmpMouseClicked(evt);
            }
        });
        jPanel3.add(lblViewEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 108, 233, 57));

        lblRemoveEmp.setBackground(new java.awt.Color(0, 204, 204));
        lblRemoveEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRemoveEmp.setText("           Remove Employee");
        lblRemoveEmp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblRemoveEmp.setOpaque(true);
        lblRemoveEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRemoveEmpMouseClicked(evt);
            }
        });
        jPanel3.add(lblRemoveEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 204, 233, 57));

        lblAddEmp.setBackground(new java.awt.Color(0, 204, 204));
        lblAddEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAddEmp.setText("              Add Employee");
        lblAddEmp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblAddEmp.setOpaque(true);
        lblAddEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddEmpMouseClicked(evt);
            }
        });
        jPanel3.add(lblAddEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 108, 233, 57));

        lblUpdateEmp.setBackground(new java.awt.Color(0, 204, 204));
        lblUpdateEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUpdateEmp.setText("             Update Employee");
        lblUpdateEmp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblUpdateEmp.setOpaque(true);
        lblUpdateEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdateEmpMouseClicked(evt);
            }
        });
        jPanel3.add(lblUpdateEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 204, 233, 57));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("    Manage Employee");
        jLabel6.setOpaque(true);
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 14, 236, 64));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/doctor.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 111, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 1050, 310));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAddEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddEmpMouseClicked
        AddEmployeeFrame add= new AddEmployeeFrame(); 
        add.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAddEmpMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AdminOptionsFrame f = new AdminOptionsFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lblViewEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewEmpMouseClicked
        ViewEmployeeFrame f = new ViewEmployeeFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblViewEmpMouseClicked

    private void lblUpdateEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateEmpMouseClicked
        UpdateEmployeeFrame f=new UpdateEmployeeFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblUpdateEmpMouseClicked

    private void lblRemoveEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveEmpMouseClicked
        RemoveEmployeeFrame f = new RemoveEmployeeFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRemoveEmpMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int ans;
        ans=JOptionPane.showConfirmDialog(null,"Are You Sure?","Quitting!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (ans==JOptionPane.YES_OPTION){
            LoginFrame f= new LoginFrame();
            f.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(ManageEMmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEMmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEMmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEMmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEMmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAddEmp;
    private javax.swing.JLabel lblGreet;
    private javax.swing.JLabel lblRemoveEmp;
    private javax.swing.JLabel lblUpdateEmp;
    private javax.swing.JLabel lblViewEmp;
    // End of variables declaration//GEN-END:variables
}
