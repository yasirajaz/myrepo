class DoublyllTester{
	public static void main(String... args){
		Doublyll dl=new Doublyll();
		dl.createList(5);
		dl.display();
		dl.addNode(10,4);
		dl.display();
		dl.delete(4);
		dl.display();
	}
}
