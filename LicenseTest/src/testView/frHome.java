package testView;

import javax.swing.JRootPane;

/**
 *
 * @author hai95
 * thêm icon vào 
 */

public class frHome extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public frHome() {
        initComponents();
        setsize();
        
    }
    public void setsize(){
        pnlHome.setSize(1200, 800);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHome = new javax.swing.JPanel();
        btnCauHoi = new javax.swing.JButton();
        btnLyThuyet = new javax.swing.JButton();
        btnThi = new javax.swing.JButton();
        btnChangePw = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ôn thi bằng lái xe máy");
        setAlwaysOnTop(true);

        pnlHome.setBackground(new java.awt.Color(255, 255, 255));
        pnlHome.setPreferredSize(new java.awt.Dimension(1200, 800));
        pnlHome.setLayout(null);

        btnCauHoi.setBackground(new java.awt.Color(255, 118, 89));
        btnCauHoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCauHoi.setForeground(new java.awt.Color(255, 255, 255));
        btnCauHoi.setIcon(new javax.swing.ImageIcon("E:\\Ky_4\\DU_AN_1\\On-thi-bang-lai-xe\\LicenseTest\\src\\Images\\Question_fill.png")); // NOI18N
        btnCauHoi.setText("Bộ câu hỏi");
        btnCauHoi.setBorderPainted(false);
        btnCauHoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCauHoi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCauHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCauHoiActionPerformed(evt);
            }
        });
        pnlHome.add(btnCauHoi);
        btnCauHoi.setBounds(640, 410, 250, 180);

        btnLyThuyet.setBackground(new java.awt.Color(0, 182, 222));
        btnLyThuyet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLyThuyet.setForeground(new java.awt.Color(255, 255, 255));
        btnLyThuyet.setIcon(new javax.swing.ImageIcon("E:\\Ky_4\\DU_AN_1\\On-thi-bang-lai-xe\\LicenseTest\\src\\Images\\Desk_alt_fill.png")); // NOI18N
        btnLyThuyet.setText("Học lý thuyết");
        btnLyThuyet.setBorderPainted(false);
        btnLyThuyet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLyThuyet.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLyThuyet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLyThuyetActionPerformed(evt);
            }
        });
        pnlHome.add(btnLyThuyet);
        btnLyThuyet.setBounds(280, 230, 230, 180);

        btnThi.setBackground(new java.awt.Color(86, 222, 167));
        btnThi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThi.setForeground(new java.awt.Color(255, 255, 255));
        btnThi.setIcon(new javax.swing.ImageIcon("E:\\Ky_4\\DU_AN_1\\On-thi-bang-lai-xe\\LicenseTest\\src\\Images\\File_dock_fill.png")); // NOI18N
        btnThi.setText("Thi thử");
        btnThi.setBorderPainted(false);
        btnThi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThiActionPerformed(evt);
            }
        });
        pnlHome.add(btnThi);
        btnThi.setBounds(510, 230, 380, 180);

        btnChangePw.setBackground(new java.awt.Color(248, 205, 54));
        btnChangePw.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnChangePw.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePw.setIcon(new javax.swing.ImageIcon("E:\\Ky_4\\DU_AN_1\\On-thi-bang-lai-xe\\LicenseTest\\src\\Images\\User_fill.png")); // NOI18N
        btnChangePw.setText("Đổi mật khẩu");
        btnChangePw.setBorderPainted(false);
        btnChangePw.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChangePw.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChangePw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePwActionPerformed(evt);
            }
        });
        pnlHome.add(btnChangePw);
        btnChangePw.setBounds(280, 410, 360, 180);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLyThuyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLyThuyetActionPerformed
        // TODO add your handling code here:
        dgStudy study = new dgStudy(Run.home, true);
        study.setVisible(true);
    }//GEN-LAST:event_btnLyThuyetActionPerformed

    private void btnThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThiActionPerformed
        // TODO add your handling code here:
        dgMenuDT deThi = new dgMenuDT(Run.home, true);
        deThi.setVisible(true);
    }//GEN-LAST:event_btnThiActionPerformed

    private void btnCauHoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCauHoiActionPerformed
        // TODO add your handling code here:
        dgQuestionList dgList = new dgQuestionList(Run.home, true);
        dgList.setVisible(true);
    }//GEN-LAST:event_btnCauHoiActionPerformed

    private void btnChangePwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePwActionPerformed
        // TODO add your handling code here:
        Dgdoimatkhau dgdoimk = new Dgdoimatkhau(Run.home, true);
        dgdoimk.setVisible(true);

    }//GEN-LAST:event_btnTaiKhoanActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThongKeActionPerformed


    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCauHoi;
    private javax.swing.JButton btnChangePw;
    private javax.swing.JButton btnLyThuyet;
    private javax.swing.JButton btnThi;
    private javax.swing.JPanel pnlHome;
    // End of variables declaration//GEN-END:variables
}
