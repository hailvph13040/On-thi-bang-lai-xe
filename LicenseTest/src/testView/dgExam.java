package testView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import testController.QuestionController;
import testModel.Answer;
import testModel.CauHoi_DeThi;
import testModel.Dethi;
import testModel.Question;

/**
 *
 * @author hai95
 */
public class dgExam extends java.awt.Dialog {

    /**
     * Creates new form dgQuestion
     */
    public Dethi dethi;
    public QuestionController questionController = new QuestionController();
    List<CauHoi_DeThi> lstcCauHoi_DeThi = new ArrayList<>();
    List<Question> lsQuestions = new ArrayList<>();
    List<Answer> lstAnswers = new ArrayList<>();
    List<Answer> lsAnswersQuestion = new ArrayList<>();
    int index;
    public Thread timeEx;

    public dgExam(java.awt.Frame parent, boolean modal, Dethi dethi) {
        super(parent, modal);
        initComponents();
        setSize(1200, 800);
        setLocationRelativeTo(null);
        this.dethi = dethi;
        try {
            lstcCauHoi_DeThi = questionController.getCauHoiDTbyDeThiID(dethi.getId());
            lsQuestions = questionController.getListQuestion();
            lstAnswers = questionController.getListAnswers();
            timeExam();
            timeEx.start();
            setQuesstion_Exam();
            loadQuestionbyIndex(0);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Failed dgExam 1: get list question exam or get list question" + ex);
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblMaDe = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblCauHoi = new javax.swing.JLabel();
        lblHinh = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txpA = new javax.swing.JTextPane();
        rdoA = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txpB = new javax.swing.JTextPane();
        rdoB = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txpCauHoi = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txpC = new javax.swing.JTextPane();
        rdoC = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        btnEnd = new javax.swing.JButton();
        lblTimer = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlMenuCauHoi = new javax.swing.JPanel();

        setTitle("Question");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(235, 235, 235));
        jPanel1.setLayout(null);

        lblMaDe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMaDe.setText("Đề thi số 1");
        jPanel1.add(lblMaDe);
        lblMaDe.setBounds(30, 20, 210, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(238, 246, 237));
        jPanel3.setLayout(null);

        lblCauHoi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblCauHoi.setForeground(new java.awt.Color(58, 180, 84));
        lblCauHoi.setText("Câu hỏi 8");
        jPanel3.add(lblCauHoi);
        lblCauHoi.setBounds(20, 10, 250, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 1000, 50);
        jPanel2.add(lblHinh);
        lblHinh.setBounds(530, 200, 450, 250);

        txpA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txpA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txpA.setEnabled(false);
        jScrollPane4.setViewportView(txpA);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(50, 200, 460, 50);

        rdoA.setBackground(new java.awt.Color(255, 255, 255));
        rdoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAActionPerformed(evt);
            }
        });
        jPanel2.add(rdoA);
        rdoA.setBounds(20, 210, 20, 21);

        txpB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txpB.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txpB.setEnabled(false);
        jScrollPane5.setViewportView(txpB);

        jPanel2.add(jScrollPane5);
        jScrollPane5.setBounds(50, 270, 460, 50);

        rdoB.setBackground(new java.awt.Color(255, 255, 255));
        rdoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBActionPerformed1(evt);
            }
        });
        jPanel2.add(rdoB);
        rdoB.setBounds(20, 280, 20, 21);

        txpCauHoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txpCauHoi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txpCauHoi.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txpCauHoi.setEnabled(false);
        jScrollPane3.setViewportView(txpCauHoi);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 60, 970, 100);

        txpC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txpC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txpC.setEnabled(false);
        jScrollPane2.setViewportView(txpC);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(50, 340, 460, 50);

        rdoC.setBackground(new java.awt.Color(255, 255, 255));
        rdoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCActionPerformed(evt);
            }
        });
        jPanel2.add(rdoC);
        rdoC.setBounds(20, 350, 20, 21);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(100, 170, 1000, 510);

        jPanel4.setBackground(new java.awt.Color(78, 180, 84));
        jPanel4.setLayout(null);

        btnEnd.setBackground(new java.awt.Color(255, 118, 89));
        btnEnd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEnd.setForeground(new java.awt.Color(255, 255, 255));
        btnEnd.setText("Kết thúc");
        btnEnd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 118, 89)));
        btnEnd.setBorderPainted(false);
        btnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndActionPerformed(evt);
            }
        });
        jPanel4.add(btnEnd);
        btnEnd.setBounds(1070, 10, 100, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 60, 1200, 50);

        lblTimer.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTimer.setForeground(new java.awt.Color(255, 51, 51));
        lblTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimer.setText("12:35");
        jPanel1.add(lblTimer);
        lblTimer.setBounds(610, 120, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Thời gian còn lại:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(460, 120, 130, 30);

        pnlMenuCauHoi.setBackground(new java.awt.Color(235, 235, 235));
        jPanel1.add(pnlMenuCauHoi);
        pnlMenuCauHoi.setBounds(100, 690, 1000, 70);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1200, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(true);
    }//GEN-LAST:event_closeDialog

    private void btnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndActionPerformed
        // TODO add your handling code here:
        resultExam();
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnEndActionPerformed

    private void rdoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCActionPerformed
        rdoA.setSelected(false);
        rdoB.setSelected(false);
        rdoC.setSelected(true);
        if (rdoC.isSelected()) {
            lstcCauHoi_DeThi.get(index).setCauTraLoi(lsAnswersQuestion.get(2).getId());
            lstcCauHoi_DeThi.get(index).setTrangThai(lsAnswersQuestion.get(2).isTrangThai());
        } else {
            lstcCauHoi_DeThi.get(index).setCauTraLoi(-1);
            lstcCauHoi_DeThi.get(index).setTrangThai(false);
        }
    }//GEN-LAST:event_rdoCActionPerformed

    private void rdoBActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBActionPerformed1
        // TODO add your handling code here:
        rdoA.setSelected(false);
        rdoC.setSelected(false);
        rdoB.setSelected(true);
        if (rdoB.isSelected()) {
            lstcCauHoi_DeThi.get(index).setCauTraLoi(lsAnswersQuestion.get(1).getId());
            lstcCauHoi_DeThi.get(index).setTrangThai(lsAnswersQuestion.get(1).isTrangThai());
        } else {
            lstcCauHoi_DeThi.get(index).setCauTraLoi(-1);
            lstcCauHoi_DeThi.get(index).setTrangThai(false);
        }
    }//GEN-LAST:event_rdoBActionPerformed1

    private void rdoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAActionPerformed
        // TODO add your handling code here:
        rdoC.setSelected(false);
        rdoB.setSelected(false);
        rdoA.setSelected(true);
        if (rdoA.isSelected()) {
            lstcCauHoi_DeThi.get(index).setCauTraLoi(lsAnswersQuestion.get(0).getId());
            lstcCauHoi_DeThi.get(index).setTrangThai(lsAnswersQuestion.get(0).isTrangThai());
        } else {
            lstcCauHoi_DeThi.get(index).setCauTraLoi(-1);
            lstcCauHoi_DeThi.get(index).setTrangThai(false);
        }
    }//GEN-LAST:event_rdoAActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed
    public void timeExam() {
        timeEx = new Thread() {
            int time = dethi.getTimer();

            @Override
            public void run() {
                while (true) {
                    time--;
                    int ss = time % 60;
                    int m = time / 60;
                    lblTimer.setText(m + ":" + ss);
                    if (time == 0) {
                        break;
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };

    }

    public void setQuesstion_Exam() {
        try {
            pnlMenuCauHoi.removeAll();
            JButton[] btnQuesstion = new JButton[lstcCauHoi_DeThi.size()];
            for (int i = 0; i < lstcCauHoi_DeThi.size(); i++) {
                btnQuesstion[i] = new JButton();
                btnQuesstion[i].setName(i + "");
                btnQuesstion[i].setText((i + 1) + "");
                btnQuesstion[i].setFont(new java.awt.Font("Tahoma", 0, 14));

                if (lstcCauHoi_DeThi.get(i).getCauTraLoi() > -1) {
                    btnQuesstion[i].setBackground(Color.GREEN);
                } else {
                    btnQuesstion[i].setBackground(Color.white);
                }
                btnQuesstion[i].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        index = Integer.parseInt(e.getComponent().getName());
                        loadQuestionbyIndex(index);
                        setQuesstion_Exam();
                    }

                });
                pnlMenuCauHoi.add(btnQuesstion[i]);
                pnlMenuCauHoi.updateUI();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Failed get list question exam" + ex);
        }
    }

    public void setIcon(String nameIcon) {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/Images/" + nameIcon + ".png"));
        lblHinh.setIcon(imageIcon);
    }

    public void loadQuestionbyIndex(int index) {
        try {
            rdoA.setSelected(false);
            rdoB.setSelected(false);
            rdoC.setSelected(false);
            for (Question lsQuestion : lsQuestions) {
                if (lstcCauHoi_DeThi.get(index).getCauHoi_id() == lsQuestion.getId()) {

                    txpCauHoi.setText("Câu " + (index + 1) + ": " + lsQuestion.getNoiDung());
                    if (lsQuestion.getHinh().length() > 0) {
                        lblHinh.setVisible(true);
                        setIcon(lsQuestion.getHinh());
                    } else {
                        lblHinh.setVisible(false);
                    }
                    lsAnswersQuestion = questionController.getListAnswersbyQuesstionID(lstcCauHoi_DeThi.get(index).getCauHoi_id());
                    if (lsAnswersQuestion.size() == 2) {
                        txpA.setText(lsAnswersQuestion.get(0).getNoiDung());
                        txpB.setText(lsAnswersQuestion.get(1).getNoiDung());
                        if (lstcCauHoi_DeThi.get(index).getCauTraLoi() == lsAnswersQuestion.get(0).getId()) {
                            rdoA.setSelected(true);
                            rdoB.setSelected(false);
                        } else if (lstcCauHoi_DeThi.get(index).getCauTraLoi() == lsAnswersQuestion.get(1).getId()) {
                            rdoB.setSelected(true);
                            rdoA.setSelected(false);
                        }
                        rdoC.setVisible(false);
                        txpC.setVisible(false);
                        jScrollPane2.setVisible(false);
                    } else if(lsAnswersQuestion.size() == 3){
                        rdoC.setVisible(true);
                        txpC.setVisible(true);
                        jScrollPane2.setVisible(true);
                        txpA.setText(lsAnswersQuestion.get(0).getNoiDung());
                        txpB.setText(lsAnswersQuestion.get(1).getNoiDung());
                        txpC.setText(lsAnswersQuestion.get(2).getNoiDung());
                        if (lstcCauHoi_DeThi.get(index).getCauTraLoi() == lsAnswersQuestion.get(0).getId()) {
                            rdoA.setSelected(true);
                            rdoB.setSelected(false);
                            rdoC.setSelected(false);
                        } else if (lstcCauHoi_DeThi.get(index).getCauTraLoi() == lsAnswersQuestion.get(1).getId()) {
                            rdoB.setSelected(true);
                            rdoA.setSelected(false);
                            rdoC.setSelected(false);
                        } else if (lstcCauHoi_DeThi.get(index).getCauTraLoi() == lsAnswersQuestion.get(2).getId()) {
                            rdoC.setSelected(true);
                            rdoA.setSelected(false);
                            rdoB.setSelected(false);
                        }
                    }
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Failed get Answers by QuestionID" + ex);
        }
    }

    public void resultExam() {
        timeEx.stop();
        String[] resultTime = lblTimer.getText().split(":");
        int timeLeft = Integer.parseInt(resultTime[0]) * 60 + Integer.parseInt(resultTime[1]);
        int resultAnsswer = 0;
        boolean result= true;
        List<Question> lst_CauLiet = questionController.getCauLiet(lsQuestions);
        for (CauHoi_DeThi cauHoi_DeThi : lstcCauHoi_DeThi) {
            for (Question cauLiet : lst_CauLiet) {
                if (cauHoi_DeThi.getCauHoi_id() == cauLiet.getId()) {
                    if (!cauHoi_DeThi.isTrangThai()) {
                        result = false;
                        break;
                    }
                    resultAnsswer ++;
                }
            }
            if (cauHoi_DeThi.isTrangThai()) {
                resultAnsswer ++;
            }
        }
        if (result && resultAnsswer >= 15) {
            JOptionPane.showMessageDialog(this, "Pass : " + resultAnsswer + "/25");
            
        }

    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCauHoi;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblMaDe;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JPanel pnlMenuCauHoi;
    private javax.swing.JRadioButton rdoA;
    private javax.swing.JRadioButton rdoB;
    private javax.swing.JRadioButton rdoC;
    private javax.swing.JTextPane txpA;
    private javax.swing.JTextPane txpB;
    private javax.swing.JTextPane txpC;
    private javax.swing.JTextPane txpCauHoi;
    // End of variables declaration//GEN-END:variables
}
