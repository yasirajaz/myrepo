/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ubuntu
 */
public class RegisterDao {
    public void registerUser(String email, String password,String firstname, String lastname,String dob,int gender){
        try{
            Connection con = DBConnection.getConnection();
            
            String sql = "SELECT uid FROM user_table ORDER BY uid DESC LIMIT 1";
            
            PreparedStatement ps = DBConnection.getPreparedStatement(con,sql);
            ResultSet rs = DBConnection.executeQuery(ps);
            
            
            int uid;
            if (!rs.next()) {
                uid = 1;
            } else {
                uid = rs.getInt("uid");
                uid++;
            }
            
            
            String sql1 = "INSERT INTO user_table(uid,firstname, lastname, dob, gender) VALUES ('" +uid+ "','"+ firstname +"','"+ lastname +"', '"+ dob +"', " + gender+")";
            PreparedStatement ps1 = DBConnection.getPreparedStatement(con,sql1);
            DBConnection.executeUpdate(ps1);
            
            
            String sql2 = "INSERT INTO login_table(email, password, status, uid) VALUES ('"+email+"','"+password+"','"+0+"','"+uid+"')";
            PreparedStatement ps2 = DBConnection.getPreparedStatement(con,sql2);
            DBConnection.executeUpdate(ps2);
            
         
            System.out.println("User Registered Successfully");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
