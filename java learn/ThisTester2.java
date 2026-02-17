class ThisTester2{
	public static void main(String[] args){
		ThisDemo2 td1=new ThisDemo2(20);
		System.out.println(td1.age);
		ThisDemo2 td2= new ThisDemo2(20,"yasir");
		System.out.println(td2.age+" "+td2.name);
		ThisDemo2 td3=new ThisDemo2(22,"yasir","integral");
		System.out.println(td3.age+" "+td3.name+" "+td3.college);
	}
}
