import java.util.Scanner;
class DivideKaro{
	public static void main(String... args){
		int x,y,z;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter numerator: ");
		x=sc.nextInt();
		System.out.print("Enter denomenator: ");
		y=sc.nextInt();
		z=x/y;
		System.out.println(z);
	}
}
