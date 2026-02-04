class LocalVariableTest{
	void printer(){
		int i=10;
		int j;
		if(true){
			i=5;
			System.out.println(i);
		}
		System.out.println(i);
		// we cant print j bcz compile time error bcz not initialised
	}
	public static void main(String[] args){
		LocalVariableTest lt=new LocalVariableTest();
		lt.printer();
	}
}

