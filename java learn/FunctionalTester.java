class LibTester{
	public static void main(String[] args){
		LibClass ls=new LibClass();
		ls.caller(()->{System.out.println("hello "); System.out.println("yasir");});
	}
}
