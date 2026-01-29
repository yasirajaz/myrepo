import java.util.*;
class switch1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		switch(x){
			case 97: System.out.println("hello");
			break;
			case 'b': System.out.println("namaste");
			break;
			case 5%2: System.out.println("bonjour");
			break;
                	default: System.out.print("invaluid option");
		}

	}
}
