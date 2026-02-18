public interface MyInterface5{
        void show(); // by default public sttaic final
        void printer();
	void display();// by default public abstract bcz of interface c;ass
}
public class AdapterDemo implements MyInterface5{  //adapter class isliye kyuki ho ske to hme ki ek abstract method us ekrna ho like in library
	public void display(); //we have to use only display
	public void show();
	public void printer();
}
class MyClass extends AdapterDemo{
        public void display(){ //public kyuki by public abstract ko public krna pdega
                System.out.println("display method");
        }
}
