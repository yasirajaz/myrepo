import java.util.*;
public class Views {
    public String welcomeScreen(Scanner sc){
        System.out.println("========>WELCOME TO HOSTEL SEARCH<=========");
        System.out.print("ENTER STUDENT NAME: ");
        String name=sc.nextLine().trim();
        return name;
    }
    public void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
