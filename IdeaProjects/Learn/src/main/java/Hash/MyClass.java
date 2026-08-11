package Hash;
import java.security.MessageDigest;
import java.util.Scanner;

public class MyClass {
    public static void main(String... args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string: ");
        s=sc.nextLine();
        try {
            //getting it by factory method
            MessageDigest md = MessageDigest.getInstance("SHA1");
            byte[] bt = s.getBytes();
            byte[] pass = md.digest(bt);
            System.out.println(pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
