import java.util.*;
import java.sql.*;
public class MainClass {
    public static void main(String[] args){
        Views views= new Views();
        HostelDao hd=new HostelDao();
        Scanner sc=new Scanner(System.in);
        while(true) {
            views.clearScreen();
            String name = views.welcomeScreen(sc);
            try {
                Connection con = hd.doConnect();
                String query="SELECT h.hostler_name, h.contact_no, r.room_no, r.wing_name, hs.hostel_name FROM hostler_info h JOIN room_info r ON (h.room_id = r.room_id) JOIN hostel_info hs ON (r.hostel_id = hs.hostel_id) WHERE (h.hostler_name = ?)";
                PreparedStatement pst=hd.getStatement(con,query);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
