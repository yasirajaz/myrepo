interface T5{
	T6 printer();
}
interface T6{
	T66 show();
}
interface T66{
	void display();
}
class A implements T5{
	public T6 printer(){
		System.out.println("printer method");
		return new B();
	}
}
class B implements T6{
	public T66 show(){
		System.out.println("show method");
		return new C();
	}
}
class C implements T66{
	public void display(){
		System.out.println("display method");
	}
}
class Factory{
	public static T5 getInstance(){
		return new A();
	}
}
