import java.util.*;
class twopowern{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the num you want to cherck for two power n:");
		int n= sc.nextInt();
		if((n &(n-1))==0){
			System.out.println("the number is two power n");
		}else{
			System.out.println("the number is not two power n");
		}
	}
}

