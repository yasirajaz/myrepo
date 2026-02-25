class LibTester{
	public static void main(String[] args){
		LibClass ls=new LibClass();
		//FunctionalInterfaceF fi= ()->{System.out.println("hello "); System.out.println("yasir");};
		//ls.caller(fi);
		// ls.caller(()->{sop("fdc");});
		FunctionalInterfaceF fi=s->{System.out.println("single argument and statement without parenthesis and curly braces "); System.out.println(s);};
		ls.caller(fi,"Lucknow");
		MyInterface mi=(x,y)->x+y;
		ls.caller(mi,5,6);
	}
}
