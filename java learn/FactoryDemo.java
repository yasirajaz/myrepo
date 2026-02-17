class FactoryDemo{
	int age;
	String name;
	public static FactoryDemo fd=null; //singleton pattern
	private FactoryDemo(int a,String y){
		age=a;
		name=y;
	}
	public static FactoryDemo factory(int x,String y){
		if(fd==null){				//ye krne se sirf ek hi object create hoga and uska reference class ke fd me jaega
			fd= new FactoryDemo(x,y);
		}
		return fd;  // phla loop chlega to fd1 ka object bnke fd me store ho jaega and then fd2 me bhi whi hoga kyuki dusra object create nahi hoga
				// yani dono fd1 nad fd2 dono me fd1 wala print hoga
	}
}
