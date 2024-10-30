/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library_app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ManagementAuthor extends javax.swing.JFrame {

    Connection conn;

    /**
     * Creates new form ManagementAuthor
     */
    public ManagementAuthor() {
        initComponents();
        load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idEdt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nameEdt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dateEdt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nationalityEdt = new javax.swing.JTextField();
        luuBtn = new javax.swing.JButton();
        suaBtn = new javax.swing.JButton();
        xoaBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tacgiaTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 670));
        setPreferredSize(new java.awt.Dimension(1200, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_app/adminIcons/icons8_Exit_26px_2.png"))); // NOI18N
        jLabel1.setText("Quay lại");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 40));

        idEdt.setBackground(new java.awt.Color(102, 102, 255));
        idEdt.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        idEdt.setForeground(new java.awt.Color(255, 255, 255));
        idEdt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        idEdt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idEdt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idEdtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idEdtFocusLost(evt);
            }
        });
        jPanel1.add(idEdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 240, 40));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mã tác giả");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 80, -1));

        jLabel11.setBackground(new java.awt.Color(153, 0, 242));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_app/adminIcons/icons8_Books_26px.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 60, 50));

        jLabel12.setBackground(new java.awt.Color(153, 0, 242));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_app/adminIcons/icons8_Conference_26px.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 60, 50));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tên tác giả");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 80, -1));

        nameEdt.setBackground(new java.awt.Color(102, 102, 255));
        nameEdt.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        nameEdt.setForeground(new java.awt.Color(255, 255, 255));
        nameEdt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        nameEdt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(nameEdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 240, 40));

        jLabel14.setBackground(new java.awt.Color(153, 0, 242));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_app/adminIcons/icons8_Book_26px.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 60, 50));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ngày sinh");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 80, -1));

        dateEdt.setBackground(new java.awt.Color(102, 102, 255));
        dateEdt.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        dateEdt.setForeground(new java.awt.Color(255, 255, 255));
        dateEdt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        dateEdt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(dateEdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 240, 40));

        jLabel16.setBackground(new java.awt.Color(153, 0, 242));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_app/adminIcons/icons8_Library_26px_1.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 60, 50));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Quốc tịch");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 80, -1));

        nationalityEdt.setBackground(new java.awt.Color(102, 102, 255));
        nationalityEdt.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        nationalityEdt.setForeground(new java.awt.Color(255, 255, 255));
        nationalityEdt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        nationalityEdt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(nationalityEdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 240, 40));

        luuBtn.setBackground(new java.awt.Color(255, 51, 51));
        luuBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        luuBtn.setForeground(new java.awt.Color(255, 255, 255));
        luuBtn.setText("Lưu");
        luuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(luuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 90, 40));

        suaBtn.setBackground(new java.awt.Color(255, 51, 51));
        suaBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        suaBtn.setForeground(new java.awt.Color(255, 255, 255));
        suaBtn.setText("Sửa");
        suaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaBtnActionPerformed(evt);
            }
        });
        jPanel1.add(suaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 90, 40));

        xoaBtn.setBackground(new java.awt.Color(255, 51, 51));
        xoaBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        xoaBtn.setForeground(new java.awt.Color(255, 255, 255));
        xoaBtn.setText("Xóa");
        xoaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaBtnActionPerformed(evt);
            }
        });
        jPanel1.add(xoaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 90, 40));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bấm vào đây nếu bạn muốn sang quản lý sách");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 250, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 670));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_app/adminIcons/icons8_Books_26px.png"))); // NOI18N
        jLabel2.setText("Quản lý tác giả");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 59, 351, 37));

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 102, -1, -1));

        tacgiaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã tác giả", "Tên tác giả", "Ngày sinh", "Quốc tịch"
            }
        ));
        tacgiaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tacgiaTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tacgiaTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 157, 680, 351));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 780, 830));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  private boolean checkDuplicateID() {
        String id = idEdt.getText().toString();
        boolean isExit = false;
        try {
            conn = ConnectDB.KetnoiDB();
            String sql = "Select * From tacgia Where MaTacGia='" + id + "'";
            Statement st = conn.createStatement();
            ResultSet s = st.executeQuery(sql);

            if (s.next()) {
                isExit = true;
            } else {
                isExit = false;
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isExit;
    }

    private boolean validateAuthor() {
        String date = dateEdt.getText().toString();
        if (!date.matches("^\\d{4}-\\d{1,2}-\\d{1,2}$")) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập theo định dạng ngày sinh theo Năm-Tháng-Ngày");
            return false;
        }
        return true;
    }

    private void deleteAuthor() {
        String id = idEdt.getText().toString();
        try {
            conn = ConnectDB.KetnoiDB();
            String sql = "Delete From tacgia Where MaTacGia=?";
            PreparedStatement s = conn.prepareStatement(sql);
            s.setString(1, id);
            s.executeUpdate();
            load();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateAuthor() {
        String id = idEdt.getText().toString();
        String name = nameEdt.getText().toString();
        String date = dateEdt.getText().toString();
        String nationality = nationalityEdt.getText().toString();
        try {
            conn = ConnectDB.KetnoiDB();
            String sql = "Update tacgia set TenTacGia=?, NgaySinh=? , QuocTich=? where MaTacGia=?";
            PreparedStatement s = conn.prepareStatement(sql);
            s.setString(1, name);
            s.setString(2, date);
            s.setString(3, nationality);
            s.setString(4, id);
            s.executeUpdate();
            load();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void insertAuthor() {
        String id = idEdt.getText().toString();
        String name = nameEdt.getText().toString();
        String date = dateEdt.getText().toString();
        String nationality = nationalityEdt.getText().toString();
        try {
            conn = ConnectDB.KetnoiDB();
            String sql = "Insert tacgia Values (?,?,?,?)";
            PreparedStatement s = conn.prepareStatement(sql);
            s.setString(1, id);
            s.setString(2, name);
            s.setString(3, date);
            s.setString(4, nationality);
            s.executeUpdate();
            load();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void load() {
        tacgiaTable.removeAll();
        try {
            conn = ConnectDB.KetnoiDB();
            String sql = "Select * From tacgia";
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);

            String[] arr = {"Mã tác giả", "Tên tác giả", "Ngày sinh", "Quốc tịch"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1).toString());
                v.add(rs.getString(2).toString());
                v.add(rs.getString(3).toString());
                v.add(rs.getString(4).toString());
                model.addRow(v);
            }
            tacgiaTable.setModel(model);
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        Home h = new Home();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void luuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuBtnActionPerformed
        // TODO add your handling code here:
        if (validateAuthor() == true) {
            if (checkDuplicateID() == false) {
                insertAuthor();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Trùng ID rồi");
            }
        } else {
            return;
        }

    }//GEN-LAST:event_luuBtnActionPerformed

    private void tacgiaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tacgiaTableMouseClicked
        // TODO add your handling code here:
        try {
            int i = tacgiaTable.getSelectedRow();
            idEdt.setText(tacgiaTable.getValueAt(i, 0).toString());
            nameEdt.setText(tacgiaTable.getValueAt(i, 1).toString());
            dateEdt.setText(tacgiaTable.getValueAt(i, 2).toString());
            nationalityEdt.setText(tacgiaTable.getValueAt(i, 3).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tacgiaTableMouseClicked

    private void suaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaBtnActionPerformed
        // TODO add your handling code here:
        if (validateAuthor() == true) {

            updateAuthor();

        }

    }//GEN-LAST:event_suaBtnActionPerformed

    private void xoaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaBtnActionPerformed
        // TODO add your handling code here:
        deleteAuthor();
    }//GEN-LAST:event_xoaBtnActionPerformed

    private void idEdtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idEdtFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_idEdtFocusGained

    private void idEdtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idEdtFocusLost
        // TODO add your handling code here:
        if (checkDuplicateID() == true) {
            JOptionPane.showMessageDialog(rootPane, "Đã có ID này rồi");
        }
    }//GEN-LAST:event_idEdtFocusLost

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        ManagementBook book = new ManagementBook();
        book.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(ManagementAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementAuthor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateEdt;
    private javax.swing.JTextField idEdt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton luuBtn;
    private javax.swing.JTextField nameEdt;
    private javax.swing.JTextField nationalityEdt;
    private javax.swing.JButton suaBtn;
    private javax.swing.JTable tacgiaTable;
    private javax.swing.JButton xoaBtn;
    // End of variables declaration//GEN-END:variables
}
