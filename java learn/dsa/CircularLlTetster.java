class CircularLlTester{
	public static void main(String... args){
		CircularLl cl=new CircularLl();
		cl.createList(4);
		cl.display();
		cl.addNode(50,4);
		cl.display();
		cl.addNode(60,2);
		cl.display();
		cl.addNode(70,1);
		cl.display();
		cl.delete(1);
		cl.display();
		cl.delete(4);
		cl.display();
	}
}
