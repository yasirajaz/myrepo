abstract class AbstractDemo{
	public void display(){
		System.out.println("Display method");
	}
	public abstract void show();
	AbstractDemo(){
		System.out.println("abstract demo");
	}
}
class NonAbstract extends AbstractDemo{
	// override of abstract method show and redefining it
	public void show(){
		System.out.println("Show mwthod");
	}
	NonAbstract(){
		System.out.println("non abstract");
	}
}
