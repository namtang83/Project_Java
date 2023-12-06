/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.BoPhanDAO;
import controller.ChucVuDAO;
import controller.NhanVienDAO;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;
import model.BoPhan;
import model.ChucVu;
import model.NhanVien;

/**
 *
 * @author NamTang
 */
public class nhanVienView extends javax.swing.JFrame {
    homeView hv = new homeView();
    /**
     * Creates new form nhanVienView
     */
    public nhanVienView() {
        initComponents();
        JTableHeader header = thongtinnvtable.getTableHeader();
        header.setFont( new Font("Segoe UI",Font.BOLD,10));
        DefaultTableCellRenderer centerText = new DefaultTableCellRenderer();
        centerText.setHorizontalAlignment(jLabel1.CENTER);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainNVPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        troveluong_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        thongtinnvtable = new javax.swing.JTable();
        timkiem_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inforPanel = new javax.swing.JPanel();
        manv_tf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hoten_tf = new javax.swing.JTextField();
        updatenv_btn = new javax.swing.JButton();
        clearnv_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sodienthoai_tf = new javax.swing.JTextField();
        diachi_tf = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        ngaysinh_jcal = new com.toedter.calendar.JDateChooser();
        gioitinhnam = new javax.swing.JRadioButton();
        gioitinhnu = new javax.swing.JRadioButton();
        tenbophan_cb = new javax.swing.JComboBox<>();
        tenchucvu_cb = new javax.swing.JComboBox<>();
        addnv_btn = new javax.swing.JButton();
        deletenv_btn = new javax.swing.JButton();
        ngayvaolam_jcal = new com.toedter.calendar.JDateChooser();
        resettbluong_btn = new javax.swing.JButton();
        cleartbluong_btn = new javax.swing.JButton();
        printtbluong_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 600));

        mainNVPanel.setBackground(new java.awt.Color(204, 255, 255));
        mainNVPanel.setPreferredSize(new java.awt.Dimension(900, 600));
        mainNVPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUẢN LÝ THÔNG TIN NHÂN VIÊN");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 255)));
        mainNVPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 600, 50));

        troveluong_btn.setBackground(new java.awt.Color(102, 102, 102));
        troveluong_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        troveluong_btn.setForeground(new java.awt.Color(255, 255, 255));
        troveluong_btn.setText("Back");
        troveluong_btn.setBorderPainted(false);
        troveluong_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        troveluong_btn.setFocusPainted(false);
        troveluong_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                troveluong_btnActionPerformed(evt);
            }
        });
        mainNVPanel.add(troveluong_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 100, 30));

        thongtinnvtable.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        thongtinnvtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã nhân viên", "Họ tên", "Giới tính", "Ngày sinh", "Số điện thoại", "Địa chỉ", "Ngày vào làm", "Chức vụ", "Bộ phận", "Lương", "Hệ số"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(thongtinnvtable);
        if (thongtinnvtable.getColumnModel().getColumnCount() > 0) {
            thongtinnvtable.getColumnModel().getColumn(0).setResizable(false);
            thongtinnvtable.getColumnModel().getColumn(0).setPreferredWidth(30);
            thongtinnvtable.getColumnModel().getColumn(1).setResizable(false);
            thongtinnvtable.getColumnModel().getColumn(2).setResizable(false);
            thongtinnvtable.getColumnModel().getColumn(3).setResizable(false);
            thongtinnvtable.getColumnModel().getColumn(4).setResizable(false);
            thongtinnvtable.getColumnModel().getColumn(5).setResizable(false);
            thongtinnvtable.getColumnModel().getColumn(6).setResizable(false);
            thongtinnvtable.getColumnModel().getColumn(7).setResizable(false);
            thongtinnvtable.getColumnModel().getColumn(8).setResizable(false);
            thongtinnvtable.getColumnModel().getColumn(9).setResizable(false);
            thongtinnvtable.getColumnModel().getColumn(10).setResizable(false);
            thongtinnvtable.getColumnModel().getColumn(11).setResizable(false);
        }

        mainNVPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 880, 200));

        timkiem_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                timkiem_tfKeyReleased(evt);
            }
        });
        mainNVPanel.add(timkiem_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 190, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Search:");
        mainNVPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 30));

        inforPanel.setBackground(new java.awt.Color(204, 204, 204));
        inforPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manv_tf.setForeground(new java.awt.Color(153, 153, 153));
        manv_tf.setText("'A0000' Enter");
        manv_tf.setPreferredSize(new java.awt.Dimension(60, 30));
        manv_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                manv_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                manv_tfFocusLost(evt);
            }
        });
        manv_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                manv_tfKeyPressed(evt);
            }
        });
        inforPanel.add(manv_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 150, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Mã nhân viên:");
        inforPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Họ tên:");
        inforPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 78, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Giới tính:");
        inforPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 78, -1));
        inforPanel.add(hoten_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 150, 30));

        updatenv_btn.setBackground(new java.awt.Color(0, 0, 255));
        updatenv_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updatenv_btn.setForeground(new java.awt.Color(255, 255, 255));
        updatenv_btn.setText("Update");
        updatenv_btn.setBorderPainted(false);
        updatenv_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatenv_btn.setFocusPainted(false);
        updatenv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatenv_btnActionPerformed(evt);
            }
        });
        inforPanel.add(updatenv_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 90, 30));

        clearnv_btn.setBackground(new java.awt.Color(255, 255, 0));
        clearnv_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clearnv_btn.setForeground(new java.awt.Color(255, 255, 255));
        clearnv_btn.setText("Clear");
        clearnv_btn.setBorderPainted(false);
        clearnv_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearnv_btn.setFocusPainted(false);
        clearnv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearnv_btnActionPerformed(evt);
            }
        });
        inforPanel.add(clearnv_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 90, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Chức vụ:");
        inforPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 78, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Bộ phận:");
        inforPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 84, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Ngày sinh:");
        inforPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Số điện thoại:");
        inforPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Địa chỉ: ");
        inforPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, 20));
        inforPanel.add(sodienthoai_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 160, 30));
        inforPanel.add(diachi_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 160, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Ngày vào làm:");
        inforPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));

        ngaysinh_jcal.setDateFormatString("dd/MM/yyyy");
        inforPanel.add(ngaysinh_jcal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 160, 30));

        gioitinhnam.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(gioitinhnam);
        gioitinhnam.setText("Nam");
        inforPanel.add(gioitinhnam, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 80, 40));

        gioitinhnu.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(gioitinhnu);
        gioitinhnu.setText("Nữ");
        inforPanel.add(gioitinhnu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 70, 40));

        tenbophan_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bo phan giam doc", "Bo phan quan ly", "Bo phan nhan su", "Bo phan tai chinh, ke toan", "Bo phan kinh doanh", "Bo phan marketing", "Bo phan san xuat", "Bo phan an ninh" }));
        tenbophan_cb.setSelectedIndex(-1);
        inforPanel.add(tenbophan_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 160, 30));

        tenchucvu_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chu tich", "Giam doc", "Hoi dong quan tri", "Quan ly", "Truong nhom", "Nhan vien" }));
        tenchucvu_cb.setSelectedIndex(-1);
        inforPanel.add(tenchucvu_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 160, 30));

        addnv_btn.setBackground(new java.awt.Color(51, 255, 51));
        addnv_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addnv_btn.setForeground(new java.awt.Color(255, 255, 255));
        addnv_btn.setText("Add");
        addnv_btn.setBorderPainted(false);
        addnv_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addnv_btn.setFocusPainted(false);
        addnv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnv_btnActionPerformed(evt);
            }
        });
        inforPanel.add(addnv_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 90, 30));

        deletenv_btn.setBackground(new java.awt.Color(255, 0, 0));
        deletenv_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deletenv_btn.setForeground(new java.awt.Color(255, 255, 255));
        deletenv_btn.setText("Delete");
        deletenv_btn.setBorderPainted(false);
        deletenv_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletenv_btn.setFocusPainted(false);
        deletenv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletenv_btnActionPerformed(evt);
            }
        });
        inforPanel.add(deletenv_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 90, 30));

        ngayvaolam_jcal.setDateFormatString("dd/MM/yyyy");
        inforPanel.add(ngayvaolam_jcal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 160, 30));

        mainNVPanel.add(inforPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 880, 260));

        resettbluong_btn.setBackground(new java.awt.Color(51, 255, 51));
        resettbluong_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resettbluong_btn.setForeground(new java.awt.Color(255, 255, 255));
        resettbluong_btn.setText("Reset");
        resettbluong_btn.setBorderPainted(false);
        resettbluong_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resettbluong_btn.setFocusPainted(false);
        resettbluong_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resettbluong_btnActionPerformed(evt);
            }
        });
        mainNVPanel.add(resettbluong_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 100, 30));

        cleartbluong_btn.setBackground(new java.awt.Color(255, 51, 51));
        cleartbluong_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cleartbluong_btn.setForeground(new java.awt.Color(255, 255, 255));
        cleartbluong_btn.setText("Clear");
        cleartbluong_btn.setBorderPainted(false);
        cleartbluong_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cleartbluong_btn.setFocusPainted(false);
        cleartbluong_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleartbluong_btnActionPerformed(evt);
            }
        });
        mainNVPanel.add(cleartbluong_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 100, 30));

        printtbluong_btn.setBackground(new java.awt.Color(0, 51, 255));
        printtbluong_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        printtbluong_btn.setForeground(new java.awt.Color(255, 255, 255));
        printtbluong_btn.setText("Print");
        printtbluong_btn.setBorderPainted(false);
        printtbluong_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printtbluong_btn.setFocusPainted(false);
        printtbluong_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printtbluong_btnActionPerformed(evt);
            }
        });
        mainNVPanel.add(printtbluong_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainNVPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainNVPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void troveluong_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_troveluong_btnActionPerformed
        hv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_troveluong_btnActionPerformed

    private void updatenv_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatenv_btnActionPerformed
        String manv = manv_tf.getText();
        ChucVu chucvu = new ChucVu();
        ChucVuDAO chucvudao = new ChucVuDAO();
        BoPhan bophan = new BoPhan();
        BoPhanDAO bophandao = new BoPhanDAO();
        String tencv = (String) tenchucvu_cb.getSelectedItem();
        String tenbp = (String) tenbophan_cb.getSelectedItem();
        chucvu = chucvudao.FindmaCV(tencv);
        bophan = bophandao.FindmaBP(tenbp);
        String gioitinh = "";
        if(gioitinhnam.isSelected()){
            gioitinh = "Nam";
        } else if (gioitinhnu.isSelected()){
            gioitinh = "Nu";
        }
        String hoten = hoten_tf.getText();
        String sdt = sodienthoai_tf.getText();
        String diachi = diachi_tf.getText();
        java.util.Date ngaysinh = (java.util.Date) ngaysinh_jcal.getDate();
        java.util.Date ngayvaolam = (java.util.Date) ngayvaolam_jcal.getDate();
        
        if(manv.isBlank() || !manv.matches("A[0-9]{4}")){
            JOptionPane.showMessageDialog(null, "Mã nhân viên bắt đầu bằng chữ A và có 5 ký tự!","",JOptionPane.INFORMATION_MESSAGE);
        } else if(hoten.isBlank()  || !hoten.matches("[a-zA-Z\\s]+") ){
            JOptionPane.showMessageDialog(null, "Họ tên không được để trống và là chuỗi!","",JOptionPane.INFORMATION_MESSAGE);
        } else if(gioitinh.equals("")){
            JOptionPane.showMessageDialog(null, "Giới tính không được để trống!","",JOptionPane.INFORMATION_MESSAGE);
        } else if(ngaysinh == null){
            JOptionPane.showMessageDialog(null, "Ngày sinh không được để trống!","",JOptionPane.INFORMATION_MESSAGE);
        } else if(sdt.isBlank() || !sdt.matches("\\d+")){
            JOptionPane.showMessageDialog(null, "Số diện thoại không được để trống và là số!","",JOptionPane.INFORMATION_MESSAGE);
        } else if(diachi.isBlank() || !diachi.matches("[a-zA-Z\\s]+")){
            JOptionPane.showMessageDialog(null, "Địa chỉ không được để trống, không chứa ký tự đặc biệt và là chuỗi!","",JOptionPane.INFORMATION_MESSAGE);
        } else if(ngayvaolam == null){
            JOptionPane.showMessageDialog(null, "Ngày sinh không được để trống!","",JOptionPane.INFORMATION_MESSAGE);
        } else if(tenbophan_cb.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Bộ phận không được để trống!","",JOptionPane.INFORMATION_MESSAGE);
        } else if(tenchucvu_cb.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Chức vụ không được để trống!","",JOptionPane.INFORMATION_MESSAGE);
        } else {
            int check = JOptionPane.showConfirmDialog(null,"Bạn có muốn cập nhật nhân viên này không?", "Cập nhật nhân viên", JOptionPane.YES_NO_OPTION);
            if(check == 0){
                NhanVien nv = new NhanVien(manv, hoten, gioitinh, ngaysinh, sdt, diachi, ngayvaolam, chucvu, bophan, 0, 1);
                NhanVienDAO nhanviendao = new NhanVienDAO();
                boolean kt = nhanviendao.checkMaNV(manv);
                if(kt){
                    System.out.println(kt);
                    nhanviendao.update(nv);
                } else {
                    JOptionPane.showMessageDialog(null, "Mã nhân viên không tồn tại!");
                    System.out.println(kt);
                }
                
            } 
        }
    }//GEN-LAST:event_updatenv_btnActionPerformed

    private void clearnv_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearnv_btnActionPerformed
        manv_tf.setText("'A0000' Enter");
        manv_tf.setForeground(new Color(153,153,153));
        hoten_tf.setText("");
        buttonGroup1.clearSelection();
        ngaysinh_jcal.setCalendar(null);
        sodienthoai_tf.setText("");
        diachi_tf.setText("");
        ngayvaolam_jcal.setCalendar(null);
        tenchucvu_cb.setSelectedIndex(-1);
        tenbophan_cb.setSelectedIndex(-1);
    }//GEN-LAST:event_clearnv_btnActionPerformed

    private void timkiem_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timkiem_tfKeyReleased
        DefaultTableModel tableModel = (DefaultTableModel) thongtinnvtable.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(tableModel);
        thongtinnvtable.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(timkiem_tf.getText()));
    }//GEN-LAST:event_timkiem_tfKeyReleased

    private void resettbluong_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resettbluong_btnActionPerformed
        NhanVienDAO nhanviendao = new NhanVienDAO();
        DefaultTableModel tableModel = (DefaultTableModel) thongtinnvtable.getModel();
        ArrayList<NhanVien> list = nhanviendao.selectAllNV();
        int i = 1;
        tableModel.setRowCount(0);
        for(NhanVien n: list){
            tableModel.addRow(new Object[]{
                i++,
                n.getMaNV(),
                n.getHoTen(),
                n.getGioiTinh(),
                n.getNgaySinh(),
                n.getSdt(),
                n.getDiaChi(),
                n.getNgayVaoLam(),
                n.getChucVu().getTenCV(),
                n.getBoPhan().getTenBP(),
                n.getLuongCB(),
                n.getHeSoLuong(),
            });
        }
    }//GEN-LAST:event_resettbluong_btnActionPerformed

    private void cleartbluong_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleartbluong_btnActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) thongtinnvtable.getModel();
        tableModel.setRowCount(0);
    }//GEN-LAST:event_cleartbluong_btnActionPerformed

    private void printtbluong_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printtbluong_btnActionPerformed
        MessageFormat header = new MessageFormat("DANH SÁCH THÔNG TIN NHÂN VIÊN!");
        MessageFormat footer = new MessageFormat("********************************");
        try {
            thongtinnvtable.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_printtbluong_btnActionPerformed

    private void manv_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manv_tfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String manv = manv_tf.getText();            
            NhanVienDAO nhanviendao = new NhanVienDAO();
            NhanVien nhanvien = new NhanVien();
            nhanvien = nhanviendao.selectBymaNV(manv);
            if(nhanvien==null){
                JOptionPane.showMessageDialog(null, "Mã nhân viên không tồn tại!");
                return;
            }
            hoten_tf.setText(nhanvien.getHoTen());
            ngaysinh_jcal.setDate(nhanvien.getNgaySinh());
            if(nhanvien.getGioiTinh().equals("Nam")){
                gioitinhnam.setSelected(rootPaneCheckingEnabled);
            } else if(nhanvien.getGioiTinh().equals("Nu")){
                gioitinhnu.setSelected(rootPaneCheckingEnabled);
            }
            sodienthoai_tf.setText(nhanvien.getSdt());
            diachi_tf.setText(nhanvien.getDiaChi());
            ngayvaolam_jcal.setDate(nhanvien.getNgayVaoLam());
            int index_bp = tenbophan_cb.getItemCount();       
            for(int i = 0; i <= index_bp; i++){
                String bophan = tenbophan_cb.getItemAt(i);
                if(nhanvien.getBoPhan().getTenBP().equals(bophan)){
                    tenbophan_cb.setSelectedIndex(i);
                }
            }
            int index_cv = tenchucvu_cb.getItemCount();       
            for(int i = 0; i <= index_cv; i++){
                String chucvu = tenchucvu_cb.getItemAt(i);
                if(nhanvien.getChucVu().getTenCV().equals(chucvu)){
                    tenchucvu_cb.setSelectedIndex(i);
                }
            }
        }
    }//GEN-LAST:event_manv_tfKeyPressed

    private void addnv_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnv_btnActionPerformed
        String manv = manv_tf.getText();
        ChucVu chucvu = new ChucVu();
        ChucVuDAO chucvudao = new ChucVuDAO();
        BoPhan bophan = new BoPhan();
        BoPhanDAO bophandao = new BoPhanDAO();
        String tencv = (String) tenchucvu_cb.getSelectedItem();
        String tenbp = (String) tenbophan_cb.getSelectedItem();
        chucvu = chucvudao.FindmaCV(tencv);
        bophan = bophandao.FindmaBP(tenbp);
        String gioitinh = "";
        if(gioitinhnam.isSelected()){
            gioitinh = "Nam";
        } else if (gioitinhnu.isSelected()){
            gioitinh = "Nu";
        }
        String hoten = hoten_tf.getText();
        String sdt = sodienthoai_tf.getText();
        String diachi = diachi_tf.getText();
        java.util.Date ngaysinh = (java.util.Date) ngaysinh_jcal.getDate();
        java.util.Date ngayvaolam = (java.util.Date) ngayvaolam_jcal.getDate();
        
        if(manv.isBlank() || !manv.matches("A[0-9]{4}")){
            JOptionPane.showMessageDialog(null, "Mã nhân viên bắt đầu bằng chữ A và có 5 ký tự!","",JOptionPane.INFORMATION_MESSAGE);
        } else if(hoten.isBlank()  || !hoten.matches("[a-zA-Z\\s]+") ){
            JOptionPane.showMessageDialog(null, "Họ tên không được để trống và là chuỗi!","",JOptionPane.INFORMATION_MESSAGE);
        } else if(gioitinh.equals("")){
            JOptionPane.showMessageDialog(null, "Giới tính không được để trống!","",JOptionPane.INFORMATION_MESSAGE);
        } else if(ngaysinh == null){
            JOptionPane.showMessageDialog(null, "Ngày sinh không được để trống!","",JOptionPane.INFORMATION_MESSAGE);
        } else if(sdt.isBlank() || !sdt.matches("\\d+")){
            JOptionPane.showMessageDialog(null, "Số diện thoại không được để trống và là số!","",JOptionPane.INFORMATION_MESSAGE);
        } else if(diachi.isBlank() || !diachi.matches("[a-zA-Z\\s]+")){
            JOptionPane.showMessageDialog(null, "Địa chỉ không được để trống, không chứa ký tự đặc biệt và là chuỗi!","",JOptionPane.INFORMATION_MESSAGE);
        } else if(ngayvaolam == null){
            JOptionPane.showMessageDialog(null, "Ngày sinh không được để trống!","",JOptionPane.INFORMATION_MESSAGE);
        } else if(tenbophan_cb.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Bộ phận không được để trống!","",JOptionPane.INFORMATION_MESSAGE);
        } else if(tenchucvu_cb.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Chức vụ không được để trống!","",JOptionPane.INFORMATION_MESSAGE);
        } else {
            int check = JOptionPane.showConfirmDialog(null,"Bạn có muốn thêm nhân viên mới không?", "Thêm nhân viên", JOptionPane.YES_NO_OPTION);
            if(check == 0){
                NhanVien nv = new NhanVien(manv, hoten, gioitinh, ngaysinh, sdt, diachi, ngayvaolam, chucvu, bophan, 0, 1);
                NhanVienDAO nhanviendao = new NhanVienDAO();
                nhanviendao.insert(nv);
            } 
        }
    }//GEN-LAST:event_addnv_btnActionPerformed

    private void deletenv_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletenv_btnActionPerformed
         String manv = manv_tf.getText();
        int check = JOptionPane.showConfirmDialog(null,"Bạn có muốn xóa nhân viên không?", "Xóa nhân viên", JOptionPane.YES_NO_OPTION);
            if(check == 0){
                NhanVien nhanvien = new NhanVien();
                nhanvien.setMaNV(manv);
                NhanVienDAO nhanviendao = new NhanVienDAO();
                nhanviendao.delete(nhanvien);
            }
    }//GEN-LAST:event_deletenv_btnActionPerformed

    private void manv_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_manv_tfFocusGained
        if(manv_tf.getText().equals("'A0000' Enter")){
            manv_tf.setText("");
            manv_tf.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_manv_tfFocusGained

    private void manv_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_manv_tfFocusLost
        if(manv_tf.getText().equals("")){
            manv_tf.setText("'A0000' Enter");
            manv_tf.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_manv_tfFocusLost

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
            java.util.logging.Logger.getLogger(nhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nhanVienView().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addnv_btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearnv_btn;
    private javax.swing.JButton cleartbluong_btn;
    private javax.swing.JButton deletenv_btn;
    private javax.swing.JTextField diachi_tf;
    private javax.swing.JRadioButton gioitinhnam;
    private javax.swing.JRadioButton gioitinhnu;
    private javax.swing.JTextField hoten_tf;
    private javax.swing.JPanel inforPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainNVPanel;
    private javax.swing.JTextField manv_tf;
    private com.toedter.calendar.JDateChooser ngaysinh_jcal;
    private com.toedter.calendar.JDateChooser ngayvaolam_jcal;
    private javax.swing.JButton printtbluong_btn;
    private javax.swing.JButton resettbluong_btn;
    private javax.swing.JTextField sodienthoai_tf;
    private javax.swing.JComboBox<String> tenbophan_cb;
    private javax.swing.JComboBox<String> tenchucvu_cb;
    private javax.swing.JTable thongtinnvtable;
    private javax.swing.JTextField timkiem_tf;
    private javax.swing.JButton troveluong_btn;
    private javax.swing.JButton updatenv_btn;
    // End of variables declaration//GEN-END:variables
}
