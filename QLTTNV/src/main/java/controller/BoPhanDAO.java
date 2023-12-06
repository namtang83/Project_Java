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
import model.BoPhan;

/**
 *
 * @author NamTang
 */
public class BoPhanDAO {
    public BoPhan FindmaBP(String tenbophan){
        BoPhan bophan = null;
        try {
            Connection con = DBUtil.getConnection();
            String sql = "select * from BoPhan where tenBP=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,tenbophan);
            System.out.println(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                bophan = new BoPhan();
                bophan.setMaBP(rs.getString("maBP"));
                bophan.setTenBP(rs.getString("tenBP"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bophan;
    }
}
