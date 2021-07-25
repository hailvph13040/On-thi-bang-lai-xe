package testView;

import java.awt.Color;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import testController.QuestionController;
import testModel.CauHoi_DeThi;
import testModel.Dethi;

/**
 *
 * @author hai95
 */
public class dgStudy extends java.awt.Dialog {

    /**
     * Creates new form Study
     */
    QuestionController qs = new QuestionController();
    List<CauHoi_DeThi> lst_Kn;
    List<CauHoi_DeThi> lst_SH;
    List<CauHoi_DeThi> lst_Liet;
    public dgStudy(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(1200, 700);
        setLocationRelativeTo(null);
        setstart();
    }

    public void setstart() {
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        pnlQuestionSH = new javax.swing.JPanel();
        lbl8 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        pnlQuestionKn = new javax.swing.JPanel();
        lbl6 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        pnlQustionLiet = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();

        setTitle("Học lý thuyết");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(248, 248, 251));
        jPanel1.setLayout(null);

        btnMenu.setBackground(new java.awt.Color(78, 180, 84));
        btnMenu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("Menu");
        btnMenu.setBorderPainted(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu);
        btnMenu.setBounds(30, 60, 120, 30);

        pnlQuestionSH.setBackground(new java.awt.Color(255, 255, 255));
        pnlQuestionSH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlQuestionSHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlQuestionSHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlQuestionSHMouseExited(evt);
            }
        });
        pnlQuestionSH.setLayout(null);

        lbl8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl8.setText("Gồm 106 câu hỏi");
        pnlQuestionSH.add(lbl8);
        lbl8.setBounds(30, 70, 120, 20);

        lbl7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbl7.setText("CÂU SA HÌNH");
        pnlQuestionSH.add(lbl7);
        lbl7.setBounds(30, 20, 260, 30);

        lbl9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl9.setForeground(new java.awt.Color(80, 199, 135));
        lbl9.setText("Đã làm 0/106");
        pnlQuestionSH.add(lbl9);
        lbl9.setBounds(30, 110, 120, 20);

        jPanel1.add(pnlQuestionSH);
        pnlQuestionSH.setBounds(30, 460, 1140, 150);

        pnlQuestionKn.setBackground(new java.awt.Color(255, 255, 255));
        pnlQuestionKn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlQuestionKnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlQuestionKnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlQuestionKnMouseExited(evt);
            }
        });
        pnlQuestionKn.setLayout(null);

        lbl6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl6.setForeground(new java.awt.Color(80, 199, 135));
        lbl6.setText("Đã làm 0/75");
        pnlQuestionKn.add(lbl6);
        lbl6.setBounds(30, 110, 120, 20);

        lbl5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl5.setText("Gồm 75 câu hỏi");
        lbl5.setToolTipText("");
        pnlQuestionKn.add(lbl5);
        lbl5.setBounds(30, 70, 120, 20);

        lbl4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbl4.setText("CÂU HỎI KHÁI NIỆM VÀ QUY TẮC");
        pnlQuestionKn.add(lbl4);
        lbl4.setBounds(30, 20, 350, 30);

        jPanel1.add(pnlQuestionKn);
        pnlQuestionKn.setBounds(30, 290, 1140, 150);

        pnlQustionLiet.setBackground(new java.awt.Color(255, 255, 255));
        pnlQustionLiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlQustionLietMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlQustionLietMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlQustionLietMouseExited(evt);
            }
        });
        pnlQustionLiet.setLayout(null);

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbl1.setText("CÂU HỎI LIỆT");
        pnlQustionLiet.add(lbl1);
        lbl1.setBounds(30, 20, 260, 30);

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl3.setForeground(new java.awt.Color(80, 199, 135));
        lbl3.setText("Đã làm 0/19");
        pnlQustionLiet.add(lbl3);
        lbl3.setBounds(30, 110, 120, 20);

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl2.setText("Gồm 19 câu hỏi");
        pnlQustionLiet.add(lbl2);
        lbl2.setBounds(30, 70, 120, 20);

        jPanel1.add(pnlQustionLiet);
        pnlQustionLiet.setBounds(30, 120, 1140, 150);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1200, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    public void setColor(JPanel p, JLabel lb1, JLabel lb2, JLabel lb3) {
        p.setBackground(new Color(78, 180, 84));
        lb1.setForeground(Color.WHITE);
        lb2.setForeground(Color.WHITE);
        lb3.setForeground(new Color(255, 199, 67));
    }

    public void resetColor(JPanel p1, JLabel lb1, JLabel lb2, JLabel lb3) {
        p1.setBackground(Color.WHITE);
        lb1.setForeground(new Color(0, 0, 0));
        lb2.setForeground(new Color(0, 0, 0));
        lb3.setForeground(new Color(80, 199, 135));

    }
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        dispose();
        frHome Home = new frHome();
        Home.setVisible(true);

    }//GEN-LAST:event_btnMenuActionPerformed

    private void pnlQustionLietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQustionLietMouseClicked
        // mở form câu hỏi liệt và đóng form study
        dispose();
        dgCauHoiLiets cauHoiLiets = new dgCauHoiLiets(Run.home, true, lst_Liet);
        cauHoiLiets.setVisible(true);
    }//GEN-LAST:event_pnlQustionLietMouseClicked

    private void pnlQuestionKnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQuestionKnMouseClicked
        // mở form câu hỏi khái niệm & quy tắc và đóng form study
        dispose();
        dgKhaiNiemvaQuyTac khaiNiemvaQuyTac = new dgKhaiNiemvaQuyTac(Run.home, true, lst_Kn);
        khaiNiemvaQuyTac.setVisible(true);
    }//GEN-LAST:event_pnlQuestionKnMouseClicked

    private void pnlQuestionSHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQuestionSHMouseClicked
        // TODO add your handling code here:
        dispose();
        dgSaHinh sahinh = new dgSaHinh(Run.home, true, lst_SH);
        sahinh.setVisible(true);
    }//GEN-LAST:event_pnlQuestionSHMouseClicked

    private void pnlQustionLietMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQustionLietMouseEntered
        // TODO add your handling code here:
        setColor(pnlQustionLiet, lbl1, lbl2, lbl3);
    }//GEN-LAST:event_pnlQustionLietMouseEntered

    private void pnlQustionLietMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQustionLietMouseExited
        // TODO add your handling code here:
        resetColor(pnlQustionLiet, lbl1, lbl2, lbl3);
    }//GEN-LAST:event_pnlQustionLietMouseExited

    private void pnlQuestionKnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQuestionKnMouseEntered
        // TODO add your handling code here:
        setColor(pnlQuestionKn, lbl4, lbl5, lbl6);
    }//GEN-LAST:event_pnlQuestionKnMouseEntered

    private void pnlQuestionKnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQuestionKnMouseExited
        // TODO add your handling code here:
        resetColor(pnlQuestionKn, lbl4, lbl5, lbl6);
    }//GEN-LAST:event_pnlQuestionKnMouseExited

    private void pnlQuestionSHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQuestionSHMouseEntered
        // TODO add your handling code here:
        setColor(pnlQuestionSH, lbl7, lbl8, lbl9);
    }//GEN-LAST:event_pnlQuestionSHMouseEntered

    private void pnlQuestionSHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQuestionSHMouseExited
        // TODO add your handling code here:
        resetColor(pnlQuestionSH, lbl7, lbl8, lbl9);
    }//GEN-LAST:event_pnlQuestionSHMouseExited

    public void loadData() {
        try {
            lst_Kn = qs.getCauHoiDTbyDeThiID(qs.getListDTbyEmail(4).get(0).getId());
            lst_SH = qs.getCauHoiDTbyDeThiID(qs.getListDTbyEmail(2).get(0).getId());
            lst_Liet = qs.getCauHoiDTbyDeThiID(qs.getListDTbyEmail(3).get(0).getId());
            lbl2.setText("Gồm " + lst_Liet.size() + " câu hỏi");
            lbl5.setText("Gồm " + lst_Kn.size() + " câu hỏi");
            lbl8.setText("Gồm " + lst_SH.size() + " câu hỏi");
            int qsKNdone = 0;
            int qsSHdone = 0;
            int qsLdone = 0;
            for (CauHoi_DeThi cauHoi_DeThi : lst_Liet) {
                if (cauHoi_DeThi.getCauTraLoi() > 0) {
                    qsLdone ++;
                }
            }
            lbl3.setText("Đã làm " + qsLdone + " / " + lst_Liet.size());
            for (CauHoi_DeThi cauHoi_DeThi : lst_Kn) {
                if (cauHoi_DeThi.getCauTraLoi() > 0) {
                    qsKNdone ++;
                }
            }
            lbl6.setText("Đã làm " + qsKNdone + " / " + lst_Kn.size());
            for (CauHoi_DeThi cauHoi_DeThi : lst_SH) {
                if (cauHoi_DeThi.getCauTraLoi() > 0) {
                    qsSHdone ++;
                }
            }
            lbl9.setText("Đã làm " + qsSHdone + " / " + lst_SH.size());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(dgStudy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dgStudy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dgStudy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dgStudy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dgStudy dialog = new dgStudy(new java.awt.Frame(), true);
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
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JPanel pnlQuestionKn;
    private javax.swing.JPanel pnlQuestionSH;
    private javax.swing.JPanel pnlQustionLiet;
    // End of variables declaration//GEN-END:variables
}
