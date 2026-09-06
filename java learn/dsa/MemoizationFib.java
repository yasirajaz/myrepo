import java.util.*;
// hm iss problem me ye dekh rhe ki bar bar 1,2,3.. ye saare term n  calculate ho
//iske liye ek array me line se sb claculate kr le i.e val[]
//then jb hm chexk krenge ki uske do phle wala calculate h to thik h,nahi tot calculaet kro
//fir uske baad ek list me sbko add kr de and usko rpint kr de
class MemoizationFib{
	static int[] val;
	public static int fib(int n){
		if(val[n] !=0) return val[n];
		val[n]= fib(n-1)+fib(n-2);
                return val[n];
	}
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the term: ");
		int n=sc.nextInt();
		val=new int[n+1];
		for(int i=1;i<3;i++){
			val[i]=1;
		}
		int data=fib(n);
		System.out.println("the "+n+"th term of fibbonacci is "+data);
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i<=n;i++){
			al.add(fib(i));
		}
		System.out.print(al);
	}
}
