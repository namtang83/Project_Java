/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
/**
 *
 * @author NamTang
 */
public class DBUtil {
    
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=quanlynhanvien;trustServerCertificate=true";
            String user = "sa";
            String password = "1010011";
            con = DriverManager.getConnection(dbUrl, user, password);
            if(con != null){
                System.out.println("Ket noi CSDL thanh cong!");
            }
        } catch (ClassNotFoundException | SQLException e) {}
        return con;
    }
    
}
