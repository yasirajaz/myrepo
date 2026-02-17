class FactoryTester2{
	public static void main(String[] args){
		FactoryDemo2.fd.show();
		System.out.println(FactoryDemo2.fd.age);
		FactoryDemo2.fd.age=30;
		System.out.println(FactoryDemo2.fd.age);
		FactoryDemo2.fd.age=12;
		System.out.println(FactoryDemo2.fd.age);
	}
}
