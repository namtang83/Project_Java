/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import model.ChucVu;
import db.DBUtil;
/**
 *
 * @author NamTang
 */
public class ChucVuDAO {
    public ChucVu FindmaCV(String tencv){
        ChucVu chucvu = null;
        try {
            Connection con = DBUtil.getConnection();
            String sql = "select * from ChucVu where tenCV=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,tencv);
            System.out.println(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                chucvu = new ChucVu();
                chucvu.setMaCV(rs.getString("maCV"));
                chucvu.setTenCV(rs.getString("tenCV"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return chucvu;
    }
}
