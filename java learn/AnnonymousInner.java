interface MyInterface{
	void display();
}
class Outer{
	String name="aamir";
	MyInterface mi=new MyInterface(){
		public void display(){
			System.out.println(name);
		}
	};
}
