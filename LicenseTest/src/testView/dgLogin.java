package testView;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import testController.LoginController;
import testModel.User;
import javax.swing.JRootPane;

/**
 *
 * @author dovancuong
 */
public class dgLogin extends java.awt.Dialog {

    /**
     * Creates new form Login
     */
    LoginController loginController = new LoginController();

    public dgLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        settingStart();
    }
    public void settingStart(){
        setSize(600, 400);
        setLocationRelativeTo(null);
        txtEmail.requestFocus();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        lblRegisster = new javax.swing.JLabel();
        pwPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFindPw = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Login");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(null);

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setLayout(null);

        lblRegisster.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRegisster.setForeground(new java.awt.Color(78, 180, 84));
        lblRegisster.setText("Đăng ký");
        lblRegisster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegissterMouseClicked(evt);
            }
        });
        pnlLogin.add(lblRegisster);
        lblRegisster.setBounds(90, 330, 80, 17);

        pwPass.setBackground(new java.awt.Color(231, 243, 231));
        pwPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(231, 243, 231), 4));
        pnlLogin.add(pwPass);
        pwPass.setBounds(90, 200, 420, 40);

        btnLogin.setBackground(new java.awt.Color(78, 180, 84));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Đăng nhập");
        btnLogin.setBorderPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLogin);
        btnLogin.setBounds(90, 270, 420, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setText("Đăng nhập");
        pnlLogin.add(jLabel1);
        jLabel1.setBounds(220, 30, 150, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Email");
        pnlLogin.add(jLabel3);
        jLabel3.setBounds(90, 80, 50, 22);

        lblFindPw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFindPw.setForeground(new java.awt.Color(78, 180, 84));
        lblFindPw.setText("Quên mật khẩu");
        lblFindPw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFindPwMouseClicked(evt);
            }
        });
        pnlLogin.add(lblFindPw);
        lblFindPw.setBounds(410, 330, 100, 17);

        txtEmail.setBackground(new java.awt.Color(231, 243, 231));
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(231, 243, 231), 4));
        pnlLogin.add(txtEmail);
        txtEmail.setBounds(90, 110, 420, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mật khẩu");
        pnlLogin.add(jLabel2);
        jLabel2.setBounds(90, 170, 90, 22);

        add(pnlLogin);
        pnlLogin.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        mathchesUser();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblRegissterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegissterMouseClicked
        // TODO add your handling code here:
        dgRegister register = new dgRegister(Run.home, true);
        register.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRegissterMouseClicked

    private void lblFindPwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFindPwMouseClicked
        // TODO add your handling code here:
        dgFindPassword findPassword = new dgFindPassword(Run.home, true);
        findPassword.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblFindPwMouseClicked
    public void mathchesUser() {
        try {
            String email = txtEmail.getText();
            String pass = pwPass.getText();
            Run.user = loginController.getUserbyEmail(email);
            if (pass.equals(Run.user.getPass())) {
                JOptionPane.showMessageDialog(this, "Login success");
                Run.frHome();
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Login failed: " + e);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dgLogin dialog = new dgLogin(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblFindPw;
    private javax.swing.JLabel lblRegisster;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField pwPass;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
