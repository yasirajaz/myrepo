import java.util.*;
class classdemo{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter radius of the circle is ");
		float radius= sc.nextFloat();
		System.out.println("the radius of the circle is "+radius);
		float area=calculateArea(radius);
		System.out.println("the areaof the circle is "+area);
	}
	static float calculateArea(float radius){
		int pi=22/7;
		float area=pi*radius*radius;
		return(area);
	}
}
