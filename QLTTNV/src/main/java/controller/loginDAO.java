/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import db.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.TaiKhoan;
/**
 *
 * @author NamTang
 */
public class loginDAO {
    public boolean login(TaiKhoan tk){
        boolean check = false;
        try {
            Connection con = DBUtil.getConnection();
            String sql = "SELECT * FROM TaiKhoan WHERE username=? AND password=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tk.getUsername());
            ps.setString(2, tk.getPassword());
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                check = true;
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return check;
    }
}
