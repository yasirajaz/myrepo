class Outer{
	static private String name="arsh";
	//Outer(String s){
	//	name=s;
	//}
	static class Inner{
		private int age;
		Inner(int a){
			age=a;
		}
		public void printer(){
			System.out.println(name);
			System.out.println(age);
		}
	}
}
