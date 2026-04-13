package mypkg;
class EmpTester{
	public static void main(String... args){ //throws Exception{
		//throws ClassNotFoundException; throws InstantiationException; throws NoSuchMethodException{
		//1Employee e=new Employee();
		//Class c=e.getClass(); this getClass is method of Object
		//2another way is forName() method present in Class
		//Class c=Class.forName("mypkg.Employee");
		//3
		try{
			Class c=Employee.class;
			System.out.println(c.getName());


			//Employee e=(Employee)c.getConstructor().newInstance();
			Employee e=(Employee)Class.forName("mypkg.Employee").getConstaructor.newInstance();
			e.display();
		}catch(Exception e){
			e.printStackTrace();
		}
		// getConstructor ek method h Constatructor class me jo ki newInstance ko invoke kr rha h wo bhi constructor class m h
	}
}
