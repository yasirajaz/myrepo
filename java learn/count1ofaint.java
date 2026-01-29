import java.util.*;
class count1ofaint{
	public static void main(String[] args){
		int x=11;
		int count=0;
		while(x!=0){
			if((x&1)==1){
				count++;
			}
			x=x>>>1;
		}
		System.out.println(count);
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the input you want to count its one in binary: ");
		int n= sc.nextInt();
		int count5=0;
                while(n!=0){
			count5++;
                        n=n&(n-1);
                }
                System.out.println(count5);
	}
}
