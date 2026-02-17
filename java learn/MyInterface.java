public interface MyInterface{
	int x=5; // by default public sttaic final
	void display();// by default public abstract bcz of interface c;ass
}
class MyClass implements MyInterface{
	public void display(){ //public kyuki by public abstract ko public krna pdega
		System.out.println("display method");
	}
}
