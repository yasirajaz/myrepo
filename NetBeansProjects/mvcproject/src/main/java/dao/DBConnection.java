/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_tables?useSSL=false","yasir","yasirajaz");
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return con;
    }
    public static PreparedStatement getPreparedStatement(
            Connection con, String sql) {

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ps;
    }

    public static ResultSet executeQuery(PreparedStatement ps) {

        ResultSet rs = null;

        try {
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }

    public static int executeUpdate(PreparedStatement ps) {

        int result = 0;

        try {
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
