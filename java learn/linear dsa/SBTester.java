class SBTester{
	public static void main(String... args){
		StringBuilder sb=new StringBuilder();
		StringBuilder sb2=new StringBuilder(20);
		StringBuilder sb3= new StringBuilder("Lucknow");
		System.out.println(sb3);
		System.out.println(sb.length()+"  "+sb.capacity());
		System.out.println(sb2.length()+"  "+sb2.capacity());
		System.out.println(sb3.length()+"  "+sb3.capacity());


		sb3.insert(4,"for"); //index,string
		System.out.println(sb3);

		sb3.delete(7,9);// index1,offset(index2-1)
		System.out.println(sb3);

		StringBuilder sb4=new StringBuilder();
		StringBuilder sb5=sb4.append("Lucknow");
		System.out.println(sb4==sb5);


		StringBuilder sb6=new StringBuilder(10);
		sb6.append("Lucknow");
		System.out.println(sb6.length()+"  "+sb6.capacity());
		sb6.append(" Junction");
		System.out.println(sb6.length()+"  "+sb6.capacity());
		sb6.append(" East");
		System.out.println(sb6.length()+"  "+sb6.capacity());


		StringBuilder sb7=new StringBuilder("Lucknow");
		sb7.trimToSize(); // makes capacity equals to length
		System.out.println(sb7.length()+"  "+sb7.capacity());
		sb7.ensureCapacity(50);
		System.out.println(sb7.length()+"  "+sb7.capacity());


		sb7.replace(4,7,"later");
		System.out.println(sb7);
		sb7.reverse();
		System.out.println(sb7);
	}
}
