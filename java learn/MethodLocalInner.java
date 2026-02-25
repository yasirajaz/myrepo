class MethodLocal{
	int age=20;
	public void caller(){
		class LocalDemo{
			String name="yasir ajaz";
			public void display(){
				System.out.println(name+"    "+age);
			}
		}
		LocalDemo ld=new LocalDemo();
		ld.display();
	}
}
