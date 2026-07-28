import java.sql.*;
public class SQLInjectionDemo {
    public static void main(String... args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "yasir";
        String password = "yasirajaz";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement pst = con.prepareStatement("INSERT INTO employee_table(emp_id,emp_name,emp_salary,emp_age) VALUES(?,?,?,?)");
            pst.setInt(1,7);
            pst.setString(2,"rohit");
            pst.setInt(3,39);
            pst.setInt(4,1000000);
            pst.execute();
            PreparedStatement pst5 = con.prepareStatement("SELECT emp_id,emp_name,emp_salary,emp_age FROM employee_table WHERE emp_id=?");
            pst5.setInt(1, 7);// NUMBER OF QUEStion mark and the id value in second
            ResultSet rs=pst5.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("emp_id")+"  "+rs.getString("emp_name")+"   "+rs.getInt("emp_salary")+"  "+rs.getInt("emp_age"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}