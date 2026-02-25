class AnnonymousTester{
	public static void main(String[] args){
		MyClass m5=new MyClass();
		MyInterface mi=new MyInterface(){
			public void display(){
				System.out.println("display method");
			}
		};
		m5.myMethod(mi);
	}
}
