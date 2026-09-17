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
    public void registerUser(String email, String password,String firstname, String lastname,String dob,String gender){
        try{
            Connection con = DBConnection.getConnection();
            String sql = "SELECT uid FROM user_table ORDER BY uid DESC LIMIT 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int uid;
            if (!rs.next()) {
                uid = 1;
            } else {
                uid = rs.getInt("uid");
                uid++;
            }
            String sql1 = "INSERT INTO user_table(firstname, lastname, dob, gender) VALUES ('"+uid+"',"+ firstname +"','"+ lastname +"', '"+ dob +"', '" + gender+"')";
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.executeUpdate();
            String sql2 = "INSERT INTO login_table(email, password, status, uid) VALUES ('"+email+"','"+password+"','"+1+"','"+uid+"')";
            PreparedStatement ps2 = con.prepareStatement(sql2);
            
            ps2.executeUpdate();
            System.out.println("User Registered Successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
