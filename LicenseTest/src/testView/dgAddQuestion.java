package testView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorEvent;
import javax.swing.filechooser.FileNameExtensionFilter;
import testController.QuestionController;
import testModel.Answer;
import testModel.LoaiCauHoi;
import testModel.Question;

/**
 *
 * @author hai95
 */
public class dgAddQuestion extends java.awt.Dialog {

    /**
     * Creates new form dgAddQuestion
     */
    Question question = new Question();
    int index;
    QuestionController questionController = new QuestionController();
    List<Answer> lst_As = new ArrayList<>();
    List<LoaiCauHoi> lst_loai = new ArrayList<>();
    String image = null;

    public dgAddQuestion(java.awt.Frame parent, boolean modal, Question question, int index) {
        super(parent, modal);
        initComponents();
        setSize(1090, 800);
        setLocationRelativeTo(null);
        this.question = question;
        this.index = index;
        setStart();
    }

    public void setStart() {
        getTypetoCBO();
        txtID.setEnabled(false);
        if (index == 0) {
            lblTitle.setText("Thêm Câu Hỏi");
            txtNoiDung.setText("");
            txtDapAn1.setText("");
            txtDapAn2.setText("");
            txtDapAn3.setText("");
            txtGiaiThich.setText("");
            txtID.setText("");
            rdo1.setSelected(true);
            cboLoai.setSelectedIndex(0);
            lblHinh.removeAll();
            btnXacNhan.setText("Thêm");
        } else {
            try {
                lst_As = questionController.getListAnswersbyQuesstionID(question.getId());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Failed  dgAddQuestion: get list answer by question id failed");
            }
            lblTitle.setText("Cập nhật thông tin câu hỏi");
            btnXacNhan.setText("Cập nhật");
            txtID.setText(question.getId() + "");
            txtNoiDung.setText(question.getNoiDung());
            cboLoai.setSelectedIndex(question.getLoaiCauHoi_id() -1);
            questionController.setIcon(lblHinh, question.getHinh());

            if (lst_As.size() == 2) {
                txtDapAn1.setText(lst_As.get(0).getNoiDung());
                txtDapAn2.setText(lst_As.get(1).getNoiDung());
                if (lst_As.get(0).isTrangThai()) {
                    rdo1.setSelected(true);
                    txtGiaiThich.setText(lst_As.get(0).getGiaiThich());
                } else {
                    rdo2.setSelected(true);
                    txtGiaiThich.setText(lst_As.get(1).getGiaiThich());
                }
            } else {
                txtDapAn1.setText(lst_As.get(0).getNoiDung());
                txtDapAn2.setText(lst_As.get(1).getNoiDung());
                txtDapAn3.setText(lst_As.get(2).getNoiDung());
                if (lst_As.get(0).isTrangThai()) {
                    rdo1.setSelected(true);
                    txtGiaiThich.setText(lst_As.get(0).getGiaiThich());
                } else if (lst_As.get(1).isTrangThai()) {
                    rdo2.setSelected(true);
                    txtGiaiThich.setText(lst_As.get(1).getGiaiThich());
                } else {
                    rdo3.setSelected(true);
                    txtGiaiThich.setText(lst_As.get(2).getGiaiThich());
                }
            }
        }
    }

    public void getTypetoCBO() {
        try {
            lst_loai = questionController.getlistLoaiCauHoi();
            cboLoai.removeAll();
            for (LoaiCauHoi loaiCauHoi : lst_loai) {
                cboLoai.addItem(loaiCauHoi.getTenLoai());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Failed  dgAddQuestion: get list question type failed");
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
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNoiDung = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDapAn3 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDapAn1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDapAn2 = new javax.swing.JTextArea();
        btnXacNhan = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        rdo1 = new javax.swing.JRadioButton();
        rdo2 = new javax.swing.JRadioButton();
        rdo3 = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtGiaiThich = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblHinh = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboLoai = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(null);

        jPanel1.setLayout(null);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Thêm câu hỏi");
        jPanel1.add(lblTitle);
        lblTitle.setBounds(120, 30, 850, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Đáp án 3");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 500, 70, 20);

        txtNoiDung.setColumns(20);
        txtNoiDung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNoiDung.setRows(5);
        txtNoiDung.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(txtNoiDung);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 170, 1040, 100);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("ID Loại câu hỏi");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(500, 90, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Đáp án 2");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 390, 70, 20);

        txtDapAn3.setColumns(20);
        txtDapAn3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDapAn3.setRows(5);
        txtDapAn3.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(txtDapAn3);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 530, 570, 70);

        txtDapAn1.setColumns(20);
        txtDapAn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDapAn1.setRows(5);
        txtDapAn1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jScrollPane3.setViewportView(txtDapAn1);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(30, 310, 570, 70);

        txtDapAn2.setColumns(20);
        txtDapAn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDapAn2.setRows(5);
        txtDapAn2.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jScrollPane4.setViewportView(txtDapAn2);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(30, 420, 570, 70);

        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });
        jPanel1.add(btnXacNhan);
        btnXacNhan.setBounds(350, 740, 90, 23);

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnHuy);
        btnHuy.setBounds(610, 740, 90, 23);

        buttonGroup1.add(rdo1);
        rdo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(rdo1);
        rdo1.setBounds(120, 280, 93, 21);

        buttonGroup1.add(rdo2);
        rdo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(rdo2);
        rdo2.setBounds(120, 390, 93, 21);

        buttonGroup1.add(rdo3);
        rdo3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(rdo3);
        rdo3.setBounds(120, 500, 93, 21);

        txtGiaiThich.setColumns(20);
        txtGiaiThich.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGiaiThich.setRows(5);
        txtGiaiThich.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jScrollPane5.setViewportView(txtGiaiThich);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(30, 640, 1040, 70);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Giải thích");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 610, 70, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Nội dung");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 140, 70, 20);

        txtID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtID.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtID);
        txtID.setBounds(130, 90, 180, 30);

        lblHinh.setBackground(new java.awt.Color(255, 255, 255));
        lblHinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblHinh.setOpaque(true);
        lblHinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhMouseClicked(evt);
            }
        });
        jPanel1.add(lblHinh);
        lblHinh.setBounds(620, 310, 450, 250);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Đáp án 1");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 280, 70, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("ID");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 90, 70, 30);

        cboLoai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(cboLoai);
        cboLoai.setBounds(650, 90, 290, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Hình");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(620, 280, 70, 20);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
        dgQuestionList.dgQsList.setVisible(true);
    }//GEN-LAST:event_closeDialog

    private void lblHinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhMouseClicked
        // TODO add your handling code here:
        chooseImage();
    }//GEN-LAST:event_lblHinhMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        dgQuestionList.dgQsList.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
        if (index == 0) {
            AddQuestion();
        } else {
            updateQs();
        }

    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        dgQuestionList.dgQsList.setVisible(true);
    }//GEN-LAST:event_btnHuyActionPerformed
    //chọn ảnh
    public void chooseImage() {
        try {
            JFileChooser jfc = new JFileChooser();
            // thiết lập các file xuất hiện theo các loại file được lọc
            jfc.setAcceptAllFileFilterUsed(true);
            //thiết lập chuỗi các loại file ảnh có thể chọn
            String[] filefilter = {"png"};
            String desciption = "Các loại file được hỗ trợ : " + Arrays.toString(filefilter).replace('[', '(').replace(']', ')'); // đưa các loại đuôi file trong mảng filefilter sang chuỗi.
            jfc.setFileFilter(new FileNameExtensionFilter(desciption, filefilter));
            int chon = jfc.showOpenDialog(this);

            if (chon == JFileChooser.APPROVE_OPTION) {
                String[] hinh = jfc.getSelectedFile().getName().split("\\.");
                image = hinh[0];
                questionController.setIcon(lblHinh, image);
            } else {
                image = null;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Failed choose Image" + e);
        }
    }

    //check điều kiện
    public boolean check() {
        if (txtNoiDung.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập nội dung câu hỏi");
            txtNoiDung.requestFocus();
            return false;
        }
        if (txtDapAn1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đáp án 1");
            txtDapAn1.requestFocus();
            return false;
        }
        if (txtDapAn2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đáp án 2");
            txtDapAn2.requestFocus();
            return false;
        }
        if (txtDapAn3.getText().trim().isEmpty() && rdo3.isSelected()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập nội dung đáp án nên không thể chọn đáp án này là đáp án đúng");
            txtDapAn3.requestFocus();
            return false;
        }
        return true;
    }

    //thêm câu hỏi
    public void AddQuestion() {
        if (!check()) {
            return;
        }
        question.setNoiDung(txtNoiDung.getText());
        question.setHinh(lblHinh.getName());
        question.setTrangThai(true);
        for (LoaiCauHoi loaiCauHoi : lst_loai) {
            if (cboLoai.getSelectedItem().toString().equalsIgnoreCase(loaiCauHoi.getTenLoai())) {
                question.setLoaiCauHoi_id(loaiCauHoi.getID());
            }
        }
        int questionID = questionController.insertQuestion(question);
        List<Answer> lst_newAs = readNewAnswers(questionID);
        int row = 0;
        for (Answer lst_newA : lst_newAs) {
            row += questionController.insertDapAn(lst_newA);
        }
        if (row == lst_newAs.size()) {
            JOptionPane.showMessageDialog(this, "Thêm câu hỏi thành công");
            dgQuestionList.dgQsList.loadbyType();
            setVisible(false);
            dispose();
            dgQuestionList.dgQsList.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Thêm câu hỏi thất bại");
        }
    }

    //đọc dữ liệu từ form thêm câu hỏi
    public List<Answer> readNewAnswers(int QuestionID) {
        List<Answer> lst_newAs = new ArrayList<>();
        Answer as1 = new Answer();
        as1.setNoiDung(txtDapAn1.getText());
        as1.setCauhoi_id(QuestionID);
        as1.setTrangThai(rdo1.isSelected());
        if (rdo1.isSelected()) {
            as1.setGiaiThich(txtGiaiThich.getText());
        } else {
            as1.setGiaiThich("");
        }
        as1.setFlag(true);
        lst_newAs.add(as1);
        Answer as2 = new Answer();
        as2.setNoiDung(txtDapAn2.getText());
        as2.setCauhoi_id(QuestionID);
        as2.setTrangThai(rdo2.isSelected());
        if (rdo2.isSelected()) {
            as2.setGiaiThich(txtGiaiThich.getText());
        } else {
            as2.setGiaiThich("");
        }
        as2.setFlag(true);
        lst_newAs.add(as2);
        if (!txtDapAn3.getText().trim().isEmpty()) {
            Answer as3 = new Answer();
            as3.setNoiDung(txtDapAn3.getText());
            as3.setCauhoi_id(QuestionID);
            as3.setTrangThai(rdo3.isSelected());
            if (rdo3.isSelected()) {
                as3.setGiaiThich(txtGiaiThich.getText());
            } else {
                as3.setGiaiThich("");
            }
            as3.setFlag(true);
            lst_newAs.add(as3);
        }
        return lst_newAs;
    }

    //câp nhật câu hỏi
    public void updateQs() {
        int rowQs = 0;
        question.setHinh(lblHinh.getName());
        question.setNoiDung(txtNoiDung.getText());
        question.setLoaiCauHoi_id(cboLoai.getSelectedIndex() + 1);
        JOptionPane.showMessageDialog(this, question.getLoaiCauHoi_id());
        rowQs = questionController.updateQuesstion(question);
        readAnswersUpdate();
        int rowAs = 0;
        for (Answer lst_A : lst_As) {
            rowAs += questionController.updateDapAn(lst_A);
        }
        if (rowQs > 0 && rowAs == lst_As.size()) {
            JOptionPane.showMessageDialog(this, "Cập nhật câu hỏi thành công");
            dgQuestionList.dgQsList.loadbyType();
            setVisible(false);
            dispose();
            dgQuestionList.dgQsList.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Cập nhật câu hỏi thất bại " + rowQs + " Qs & " + rowAs + " As");
        }
    }

    //đọc dữ liệu từ form cập nhật câu hỏi
    public void readAnswersUpdate() {
        if (lst_As.size() == 2) {
            Answer as1 = lst_As.get(0);
            as1.setNoiDung(txtDapAn1.getText());
            as1.setTrangThai(rdo1.isSelected());
            if (rdo1.isSelected()) {
                as1.setGiaiThich(txtGiaiThich.getText());
            } else {
                as1.setGiaiThich("");
            }
            Answer as2 = lst_As.get(1);
            as2.setNoiDung(txtDapAn2.getText());
            as2.setTrangThai(rdo2.isSelected());
            if (rdo2.isSelected()) {
                as2.setGiaiThich(txtGiaiThich.getText());
            } else {
                as2.setGiaiThich("");
            }
            if (!txtDapAn3.getText().trim().isEmpty()) {
                Answer as3 = new Answer();
                as3.setNoiDung(txtDapAn3.getText());
                as3.setCauhoi_id(Integer.parseInt(txtID.getText()));
                as3.setTrangThai(rdo3.isSelected());
                if (rdo3.isSelected()) {
                    as3.setGiaiThich(txtGiaiThich.getText());
                } else {
                    as3.setGiaiThich("");
                }
                as3.setFlag(true);
                lst_As.add(as3);
            }
        } else {
            Answer as1 = lst_As.get(0);
            as1.setNoiDung(txtDapAn1.getText());
            as1.setTrangThai(rdo1.isSelected());
            if (rdo1.isSelected()) {
                as1.setGiaiThich(txtGiaiThich.getText());
            } else {
                as1.setGiaiThich("");
            }
            Answer as2 = lst_As.get(1);
            as2.setNoiDung(txtDapAn2.getText());
            as2.setTrangThai(rdo2.isSelected());
            if (rdo2.isSelected()) {
                as2.setGiaiThich(txtGiaiThich.getText());
            } else {
                as2.setGiaiThich("");
            }
            if (txtDapAn3.getText().trim().isEmpty()) {
                lst_As.get(2).setFlag(false);
            } else {
                Answer as3 = lst_As.get(2);
                as3.setNoiDung(txtDapAn3.getText());
                as3.setTrangThai(rdo3.isSelected());
                if (rdo3.isSelected()) {
                    as3.setGiaiThich(txtGiaiThich.getText());
                } else {
                    as3.setGiaiThich("");
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton rdo1;
    private javax.swing.JRadioButton rdo2;
    private javax.swing.JRadioButton rdo3;
    private javax.swing.JTextArea txtDapAn1;
    private javax.swing.JTextArea txtDapAn2;
    private javax.swing.JTextArea txtDapAn3;
    private javax.swing.JTextArea txtGiaiThich;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextArea txtNoiDung;
    // End of variables declaration//GEN-END:variables
}
