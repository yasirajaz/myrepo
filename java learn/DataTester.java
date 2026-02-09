package dtpkg;
import dpkg.DataDemo;
public class DataTester extends DataDemo{
	public static void main(String[] args){
		DataTester dd=new DataTester();
		System.out.println(dd.b+" "+dd.c);//+dd.a+" "+dd.c+" "); //dd.d will not work bcz it is private access modifiers in dpkg
	}
}
