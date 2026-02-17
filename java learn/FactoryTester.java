class FactoryTester{
	public static void main(String[] args){
		FactoryDemo fd1=FactoryDemo.factory(20,"yasir ajaz");
		FactoryDemo fd2=FactoryDemo.factory(24,"zaid khan");
		System.out.println(fd1.age+" "+fd1.name);
		System.out.println(fd2.age+" "+fd2.name);
	}
}
