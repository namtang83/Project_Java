/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import db.DBUtil;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.NhanVien;

/**
 *
 * @author NamTang
 */
public class NhanVienDAO {
//  ADD Nhan Vien
    
    public int insert(NhanVien nhanvien){
        int ketqua = 0;
        try {
            Connection con = DBUtil.getConnection();
            String sql = "insert into NhanVien(maNV, hoTen, gioiTinh, ngaySinh, sdt, diaChi, ngayVL, maCV, maBP, luongCB, heSoLuong) values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nhanvien.getMaNV());
            ps.setString(2, nhanvien.getHoTen());
            ps.setString(3, nhanvien.getGioiTinh());
            ps.setDate(4, new java.sql.Date(nhanvien.getNgaySinh().getTime()));
            ps.setString(5, nhanvien.getSdt());
            ps.setString(6, nhanvien.getDiaChi());
            ps.setDate(7, new java.sql.Date(nhanvien.getNgayVaoLam().getTime()));
            ps.setString(8, nhanvien.getChucVu().getMaCV());
            ps.setString(9, nhanvien.getBoPhan().getMaBP());
            ps.setFloat(10, nhanvien.getLuongCB());
            ps.setFloat(11, nhanvien.getHeSoLuong());
            System.out.println(sql);
            ketqua = ps.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Thêm nhân viên thành công!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Mã nhân viên đã tồn tại!");
        }
        return ketqua;
    }
    
//    DELETE Nhan Vien

    public int delete(NhanVien nhanvien){
        int ketqua = 0;
        try {
            Connection con = DBUtil.getConnection();
            String sql = "delete from NhanVien where maNV=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nhanvien.getMaNV());
            System.out.println(sql);
            ketqua = ps.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Xóa nhân viên thành công!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Mã nhân viên không tồn tại!");
        }
        return ketqua;
    }
//    UPDATE Nhan Vien
    
    public int update(NhanVien nhanvien){
        int ketqua = 0;
        try {
            Connection con = DBUtil.getConnection();
            String sql = "update NhanVien set hoTen=?, gioiTinh=?, ngaySinh=?, sdt=?, diaChi=?, ngayVL=?, maCV=?, maBP=? where maNV=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nhanvien.getHoTen());
            ps.setString(2, nhanvien.getGioiTinh());
            ps.setDate(3, new java.sql.Date(nhanvien.getNgaySinh().getTime()));
            ps.setString(4, nhanvien.getSdt());
            ps.setString(5, nhanvien.getDiaChi());
            ps.setDate(6, new java.sql.Date(nhanvien.getNgayVaoLam().getTime()));
            ps.setString(7, nhanvien.getChucVu().getMaCV());
            ps.setString(8, nhanvien.getBoPhan().getMaBP());
            ps.setString(9, nhanvien.getMaNV());
            
            System.out.println(sql);
            ketqua = ps.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Cập nhật nhân viên thành công!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }
    
//      UPDATE LUONG NHANVIEN
    public int updateLuong(NhanVien nhanvien){
        int ketqua = 0;
        try {
            Connection con = DBUtil.getConnection();
            String sql = "update NhanVien set luongCB=?, heSoLuong=? where maNV=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setFloat(1, nhanvien.getLuongCB());
            ps.setFloat(2, nhanvien.getHeSoLuong());
            ps.setString(3, nhanvien.getMaNV());
            
            System.out.println(sql);
            ketqua = ps.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Cập nhật lương nhân viên thành công!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }
//     Kiem Tra Ma Nhan Vien co trong CSDL ?
    public boolean checkMaNV(String manv){
        boolean check = false;
        try {
            Connection con = DBUtil.getConnection();
            String sql = "select * from NhanVien where maNV=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, manv);
            System.out.println(sql);
            ResultSet rs = ps.executeQuery();
            check = rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            check = false;
        }
        return check;
    }
    
//  SEARCH NhanVien by maNV
    
    public NhanVien selectBymaNV(String manv){
        NhanVien nv = null;
        try {
            Connection con = DBUtil.getConnection();
            String sql = "(select * from NhanVien inner join BoPhan on NhanVien.maBP=BoPhan.maBP inner join ChucVu on NhanVien.maCV=ChucVu.maCV where maNV=?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, manv);
            System.out.println(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                nv = new NhanVien();
                nv.setMaNV(rs.getString("maNV"));
                nv.setHoTen(rs.getString("hoTen"));
                java.sql.Date ngaysinh = rs.getDate("ngaySinh");
                if(ngaysinh != null){
                    nv.setNgaySinh(new Date(ngaysinh.getTime()));
                }
                nv.setGioiTinh(rs.getString("gioiTinh"));
                nv.setSdt(rs.getString("sdt"));
                nv.setDiaChi(rs.getString("diaChi"));
                java.sql.Date ngayvaolam = rs.getDate("ngayVL");
                if(ngayvaolam != null){
                    nv.setNgayVaoLam(new Date(ngayvaolam.getTime()));
                }
                nv.getChucVu().setMaCV(rs.getString("maCV"));
                nv.getChucVu().setTenCV(rs.getString("tenCV"));
                nv.getBoPhan().setMaBP(rs.getString("maBP"));
                nv.getBoPhan().setTenBP(rs.getString("tenBP"));
                nv.setLuongCB(rs.getFloat("luongCB"));
                nv.setHeSoLuong(rs.getFloat("heSoLuong"));
            }
            
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nv;
    }
//    Lay danh sach tat ca NhanVien
    public ArrayList<NhanVien> selectAllNV(){
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            Connection con = DBUtil.getConnection();
            String sql = "select * from NhanVien inner join BoPhan on NhanVien.maBP=BoPhan.maBP inner join ChucVu on NhanVien.maCV=ChucVu.maCV";
            PreparedStatement ps = con.prepareStatement(sql);
            System.out.println(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("maNV"));
                nv.setHoTen(rs.getString("hoTen"));
                java.sql.Date ngaysinh = rs.getDate("ngaySinh");
                if(ngaysinh != null){
                    nv.setNgaySinh(new Date(ngaysinh.getTime()));
                }
                nv.setGioiTinh(rs.getString("gioiTinh"));
                nv.setSdt(rs.getString("sdt"));
                nv.setDiaChi(rs.getString("diaChi"));
                java.sql.Date ngayvaolam = rs.getDate("ngayVL");
                if(ngayvaolam != null){
                    nv.setNgayVaoLam(new Date(ngayvaolam.getTime()));
                }
                nv.getChucVu().setMaCV(rs.getString("maCV"));
                nv.getChucVu().setTenCV(rs.getString("tenCV"));
                nv.getBoPhan().setMaBP(rs.getString("maBP"));
                nv.getBoPhan().setTenBP(rs.getString("tenBP"));
                nv.setLuongCB(rs.getFloat("luongCB"));
                nv.setHeSoLuong(rs.getFloat("heSoLuong"));
                list.add(nv);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
