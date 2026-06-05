class IntStackTester{
	public static void main(String... args){
		IntStack is=new IntStack(5);
		is.push(10);
		is.push(20);
		is.push(30);
		System.out.println(is.peek());
		int len=is.size();
		for(int i=0;i<len;i++){
			System.out.println(i+"    "+is.pop());
		}
	}
}
