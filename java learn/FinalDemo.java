public final class FinalDemo{
	public final int x; //variable ek bar final ho gya to use update nagi kr skte
	FinalDemo(int a){
		x=a;
	}
	public final void display(){  // iss method ko override bhi nii krskte kyuki final
		System.out.println("display method");
	}
}
//class FinalChild extends FinalDemo{  //parent child nahi bnega kyuki class bhi final h
//	public void display(){
//		System.out.println("display method");
//	}
//}
