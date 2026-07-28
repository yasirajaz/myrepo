import java.sql.*;
public class DaoTester {
    public static void main(String... args){
        try{
            MyDao md= new MyDao();
            Connection con=md.doConnect();
            //Statement stm=md.getStatement(con);
            String query="INSERT INTO employee_table(emp_id,emp_name) VALUES(?,?)";
            PreparedStatement pst=md.getStatement(con,query);
            pst.setInt(1,666);
            pst.setString(2,"yas");
            md.storeData(pst);
            String select = "SELECT emp_id, emp_name FROM employee_table";
            PreparedStatement pst5=md.getStatement(con,select);
            ResultSet rs = md.getData(pst5);
            while(rs.next()){
                System.out.println(rs.getInt("emp_id")+"    "+rs.getString("emp_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
