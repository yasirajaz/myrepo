class NonStaticInnerTester{
	public static void main(String[] args){
		//Outer ot=new Outer("zaid");
		//Outer.Inner it= ot.new Inner(50);
		//Outer.Inner it= new Outer("yasir").new Inner(20);
		//Outer.Inner it2= new Outer("yas").new Inner(20);
		//it.printer(); //due to static it is overrided by it2
		Outer.Inner it=new Outer.Inner(20);
		it.printer();
	}
}
