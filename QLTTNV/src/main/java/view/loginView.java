/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import controller.loginDAO;
import model.TaiKhoan;

/**
 *
 * @author NamTang
 */
public class loginView extends javax.swing.JFrame {
    
    public loginView(){
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

        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        close_lb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username_lb = new javax.swing.JLabel();
        password_lb = new javax.swing.JLabel();
        username_tf = new javax.swing.JTextField();
        password_tf = new javax.swing.JPasswordField();
        login_btn = new javax.swing.JButton();
        viewpass = new javax.swing.JLabel();
        viewpass1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(401, 450));

        mainPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        mainPanel.setForeground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(0, 204, 255));
        headerPanel.setName(""); // NOI18N
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close_lb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        close_lb.setForeground(new java.awt.Color(255, 0, 0));
        close_lb.setText("X");
        close_lb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_lbMouseClicked(evt);
            }
        });
        headerPanel.add(close_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN");
        headerPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 21, -1, -1));

        mainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 399, 100));

        username_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username_lb.setForeground(new java.awt.Color(102, 102, 102));
        username_lb.setText("Username:");
        mainPanel.add(username_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 81, -1));

        password_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password_lb.setForeground(new java.awt.Color(102, 102, 102));
        password_lb.setText("Password:");
        mainPanel.add(password_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 79, -1));

        username_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mainPanel.add(username_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 275, 45));

        password_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mainPanel.add(password_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 275, 45));

        login_btn.setBackground(new java.awt.Color(0, 204, 255));
        login_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_btn.setForeground(new java.awt.Color(255, 255, 255));
        login_btn.setText("Login");
        login_btn.setBorderPainted(false);
        login_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        mainPanel.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 275, 53));

        viewpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewicon.png"))); // NOI18N
        viewpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewpassMouseClicked(evt);
            }
        });
        mainPanel.add(viewpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 30, 45));

        viewpass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewicon.png"))); // NOI18N
        viewpass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewpass1MouseClicked(evt);
            }
        });
        mainPanel.add(viewpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_lbMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_close_lbMouseClicked

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        // TODO add your handling code here:
        String uname = username_tf.getText();
        String pass = String.valueOf(password_tf.getPassword());
        
        if(uname.isBlank()){
            JOptionPane.showMessageDialog(null, "Username khong duoc de trong!");
        } else if (pass.isBlank()){
            JOptionPane.showMessageDialog(null, "Password khong duoc de trong!");
        } else {
            TaiKhoan tk = new TaiKhoan(uname, pass);
            loginDAO lgd = new loginDAO();
            if(lgd.login(tk)){
                String name = uname;
                JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
                dispose();
                homeView h = new homeView();
                h.setVisible(true);
            } else if(!lgd.login(tk)){
                JOptionPane.showMessageDialog(this, "Đăng nhập thất bại!");
                username_tf.setText("");
                password_tf.setText("");
            }
        }
    }//GEN-LAST:event_login_btnActionPerformed

    private void viewpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewpassMouseClicked
        // TODO add your handling code here:
        password_tf.setEchoChar((char) 0);
        viewpass.setVisible(false);
        viewpass1.setVisible(true);
        
    }//GEN-LAST:event_viewpassMouseClicked

    private void viewpass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewpass1MouseClicked
        // TODO add your handling code here:
        password_tf.setEchoChar('*');
        viewpass1.setVisible(false);
        viewpass.setVisible(true);
    }//GEN-LAST:event_viewpass1MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close_lb;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton login_btn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel password_lb;
    private javax.swing.JPasswordField password_tf;
    private javax.swing.JLabel username_lb;
    private javax.swing.JTextField username_tf;
    private javax.swing.JLabel viewpass;
    private javax.swing.JLabel viewpass1;
    // End of variables declaration//GEN-END:variables
}
