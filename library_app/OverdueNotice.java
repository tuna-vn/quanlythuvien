/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library_app;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Admin
 */
public class OverdueNotice extends javax.swing.JFrame {
Connection conn;
    /**
     * Creates new form OverdueNotice
     */
    public OverdueNotice() {
        initComponents();
        load();
        loadMPM();
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
        jLabel10 = new javax.swing.JLabel();
        ppEdt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        note = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        xoaBtn = new javax.swing.JButton();
        suaBtn = new javax.swing.JButton();
        luuBtn = new javax.swing.JButton();
        mapm = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setFocusable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
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
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 40));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mã phiếu phạt:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 140, 30));

        ppEdt.setBackground(new java.awt.Color(255, 51, 51));
        ppEdt.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        ppEdt.setForeground(new java.awt.Color(255, 255, 255));
        ppEdt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        ppEdt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ppEdt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ppEdtFocusLost(evt);
            }
        });
        jPanel1.add(ppEdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 280, 40));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mã phiếu mượn:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 30));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Số tiền phạt:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 130, 30));

        price.setBackground(new java.awt.Color(255, 51, 51));
        price.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        price.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceKeyReleased(evt);
            }
        });
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 280, 40));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Lý do:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 130, 30));

        note.setBackground(new java.awt.Color(255, 51, 51));
        note.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        note.setForeground(new java.awt.Color(255, 255, 255));
        note.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        note.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(note, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 280, 40));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ngày phạt:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 130, 30));

        date.setBackground(new java.awt.Color(255, 51, 51));
        date.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        date.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 280, 40));

        xoaBtn.setBackground(new java.awt.Color(102, 102, 255));
        xoaBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        xoaBtn.setForeground(new java.awt.Color(255, 255, 255));
        xoaBtn.setText("Xóa");
        xoaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaBtnActionPerformed(evt);
            }
        });
        jPanel1.add(xoaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 120, 40));

        suaBtn.setBackground(new java.awt.Color(102, 102, 255));
        suaBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        suaBtn.setForeground(new java.awt.Color(255, 255, 255));
        suaBtn.setText("Sửa");
        suaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaBtnActionPerformed(evt);
            }
        });
        jPanel1.add(suaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 120, 40));

        luuBtn.setBackground(new java.awt.Color(102, 102, 255));
        luuBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        luuBtn.setForeground(new java.awt.Color(255, 255, 255));
        luuBtn.setText("Lưu");
        luuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(luuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 120, 40));

        jPanel1.add(mapm, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 280, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 670));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_app/adminIcons/icons8_Books_26px.png"))); // NOI18N
        jLabel2.setText("Danh sách phạt");

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 680, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private String getIDPM() throws SQLException{
         String id = null;
       String selectItem=mapm.getSelectedItem().toString();// lấy cái đã chọn trong combobox
        // String[] part=selectItem.split("--");// tách phần -- ra khỏi chuỗi
       //  String name=part[0].trim();    // lấy phần tử đầu tiên cũng như là phần mã pm ra
           conn=ConnectDB.KetnoiDB();
           String sql="select mapm from phieumuon where mapm=? and trangthai=?";
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setString(1, selectItem);
           ps.setString(2, "Đã trả");
           ResultSet rs=ps.executeQuery();
             if(rs.next()) {                 
                 id=rs.getString("phieumuon.mapm");
             }
       
      return id;
   }
    private void loadMPM(){
        try {
             try {
            conn=ConnectDB.KetnoiDB();
            String sql="select phieumuon.mapm from phieumuon ";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                mapm.addItem(rs.getString("mapm"));
            }
        } catch (Exception e) {
        e.printStackTrace();
        }
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
    private boolean validatePP(){
         String date=this.date.getText().toString();
      if (!date.matches("^\\d{4}-\\d{1,2}-\\d{1,2}$")) {
          JOptionPane.showMessageDialog(rootPane, "Hãy nhập theo định dạng ngày sinh theo Năm-Tháng-Ngày");
          return false;
      }
      return true;
    }
    private  boolean checkDuplicate(){
        String id=ppEdt.getText().toString();
      boolean isExit=false;
       try {
            conn=ConnectDB.KetnoiDB();
            String sql="Select * From phieuphat Where Mapp=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                isExit=true;
            }else{
                isExit=false;
            }
                    
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isExit;
    }
    private void deletePP(){
        String pp=ppEdt.getText().toString();
        try {
            conn=ConnectDB.KetnoiDB();
            String sql="Delete from phieuphat Where Mapp=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, pp);
            ps.executeUpdate();
            load();
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
    private void updatePP(){
        String pp=ppEdt.getText().toString();
        
        String price=this.price.getText().toString();
        String note=this.note.getText().toString();
        String date=this.date.getText().toString();
        try {
            conn=ConnectDB.KetnoiDB();
            String sql="Update phieuphat Set mapm =? , sotienphat=? , lydo=? Where mapp=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, getIDPM());
            ps.setString(2, price);
            ps.setString(3, note);
            ps.setString(4, pp);
          ps.executeUpdate();
          load();
          conn.close();
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
    private void insertPP(){
        String pp=ppEdt.getText().toString();

        String price=this.price.getText().toString();
        String note=this.note.getText().toString();
        String date=this.date.getText().toString();
        try {
            conn=ConnectDB.KetnoiDB();
            String sql="Insert phieuphat values(?,?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, pp);
            ps.setString(2, getIDPM());
            ps.setString(3, price);
            ps.setString(4, note);
            ps.setString(5, date);
            ps.executeUpdate();
            load();
            conn.close();
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
    private void load(){
         table.removeAll();
        try {
            conn=ConnectDB.KetnoiDB();
            String sql="Select *from phieuphat  ";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            String[] arr={"Mã phiếu phạt","Mã phiếu mượn","Số tiền phạt","Lý do","Ngày phạt"};
            DefaultTableModel model=new DefaultTableModel(arr,0);
            while (rs.next()) {
                Vector v=new Vector();
                v.add(rs.getString(1).toString());
                v.add(rs.getString(2).toString());
                v.add(rs.getString(3).toString());
                v.add(rs.getString(4).toString()); 
                v.add(rs.getString(5).toString()); 

                model.addRow(v);
            }
            table.setModel(model);
            conn.close();
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
Home h=new Home();
h.setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void ppEdtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ppEdtFocusLost
        // TODO add your handling code here:
        if (checkDuplicate()==true) {
            JOptionPane.showMessageDialog(rootPane, "đã có phiếu phạt này rồi");
        }
    }//GEN-LAST:event_ppEdtFocusLost

    private void priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyReleased
        // TODO add your handling code here:

         if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
    // Cho phép nhập số và xóa ký tự
        } else {
     JOptionPane.showMessageDialog(rootPane, "Chỉ dc nhập số");
            String tienphat=price.getText().toString();
            this.price.setText(tienphat.substring(0, tienphat.length()-1));
              }
    }//GEN-LAST:event_priceKeyReleased

    private void luuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuBtnActionPerformed
        // TODO add your handling code here:
        if (validatePP()==true) {
            if (checkDuplicate()==false) {
                insertPP();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Đã có ID này rồi");
            }
        }
    }//GEN-LAST:event_luuBtnActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int i=table.getSelectedRow();
        String id=table.getValueAt(i, 1).toString();
        mapm.setSelectedItem(id);
        
        ppEdt.setText(table.getValueAt(i, 0).toString());
       
        price.setText(table.getValueAt(i, 2).toString());
        note.setText(table.getValueAt(i, 3).toString());
        date.setText(table.getValueAt(i, 4).toString());
        
    }//GEN-LAST:event_tableMouseClicked

    private void suaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaBtnActionPerformed
        // TODO add your handling code here:
        updatePP();
    }//GEN-LAST:event_suaBtnActionPerformed

    private void xoaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaBtnActionPerformed
        // TODO add your handling code here:
        deletePP();
    }//GEN-LAST:event_xoaBtnActionPerformed

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
            java.util.logging.Logger.getLogger(OverdueNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OverdueNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OverdueNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OverdueNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OverdueNotice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton luuBtn;
    private javax.swing.JComboBox<String> mapm;
    private javax.swing.JTextField note;
    private javax.swing.JTextField ppEdt;
    private javax.swing.JTextField price;
    private javax.swing.JButton suaBtn;
    private javax.swing.JTable table;
    private javax.swing.JButton xoaBtn;
    // End of variables declaration//GEN-END:variables
}
