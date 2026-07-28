import java.sql.*;
public class JdbcDemo {
    public static void main(String... args){
        String url="jdbc:mysql://localhost:3306/mydb";
        String username="yasir";
        String password="yasirajaz";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            Statement stm=con.createStatement();
            int id=6;
            String name="yasir";
            int age=66;
            int salary=666666;
            String query5="INSERT INTO employee_table(emp_id,emp_name,emp_age,emp_salary) VALUES('"+id+"','"+name+"','"+age+"','"+salary+"')";
            stm.execute(query5);
            String query="SELECT emp_id,emp_name,emp_age,emp_salary FROM employee_table";
            ResultSet rs=stm.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getInt("emp_id")+"  "+rs.getString("emp_name")+" "+rs.getInt("emp_age")+" "+rs.getInt("emp_salary"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
