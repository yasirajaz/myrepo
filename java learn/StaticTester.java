class StaticTester{
	public static void main(String[] args){
		StaticDemo sd5=new StaticDemo();
		StaticDemo sd6=new StaticDemo();
		sd5.display();
		sd6.display();
		sd5.x=15;
		sd5.y=30;
		sd5.display();
		sd6.display();
	}
}
