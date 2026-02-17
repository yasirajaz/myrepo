class DemoTester{
	int age;
	private DemoTester(){
		age=55;
	}
	public void display(){
		System.out.println("Display method");
	}
	// agr demotester private h to wo khi aur call nahi ho skta except in the same class
	// to ise call krne k liye hum isko ek public method bnaenge and reference s call krenge
	// public bna ke bhi object to create ho jaega lkn refence create nahi hoga to us ehum static bnaege taki bina refeerence ke call ho ske
	public static DemoTester getInstance(){
		return new DemoTester();
	}
}
