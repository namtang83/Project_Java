/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import db.DBUtil;
import model.BienNhan;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author NamTang
 */
public class BienNhanDAO {
    public int insert(BienNhan biennhan){
        int ketqua = 0;
        try {
            Connection con = DBUtil.getConnection();
            String sql = "insert into BienNhan(maBN, maNV, hoTen, thuongThem, tongTien, ngayNhan, nguoiNhap) values(?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, biennhan.getMaBN());
            ps.setString(2, biennhan.getNhanVien().getMaNV());
            ps.setString(3, biennhan.getNhanVien().getHoTen());
            ps.setFloat(4, biennhan.getThuongThem());
            ps.setFloat(5, biennhan.getTongTien());
            ps.setDate(6, new java.sql.Date(biennhan.getNgayNhan().getTime()));
            ps.setString(7, biennhan.getNguoiNhap());
            System.out.println(sql);
            ketqua = ps.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Đã lưu!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }
    
    public int countAllBienNhan(){
        try {
            Connection con = DBUtil.getConnection();
            String sql = "select count(*) as SumBN from BienNhan";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt("SumBN");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    
}
