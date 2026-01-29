import java.util.*;
public class ifelse{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		if (a>b)
			System.out.println("a is greater than b");
		else if(a>b){
			System.out.println("a is grater of else if");
		}
		if(a>b){
			System.out.println("a is greater");
		}else
			System.out.print("both are equalof lesser");
		// agr if ki condition true ho gii to wo else if ko check nahi krega but second if ko krega anyhow, 
		//so isiliye else if use krna zyaada efficient hota h rather do if use kro
	}
}
