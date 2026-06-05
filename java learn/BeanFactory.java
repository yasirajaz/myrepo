class BeanClass{
	private BeanClass(){}
	int i=0;
	// singleton pattern h ye
	// isme sbse phle b ka instance b1 get krega null pe to b1=0 print hoga and increment ho jaega b=1
	//then b!=null ho jaega to b2 b1 me jo hoga use get krega joki 1 h.
	private static BeanClass b=null;
	public static BeanClass getInstance(){
		if(b==null) b=new BeanClass();
		return b;
	}
	public void display(){
		System.out.println(i);
		i++;
	}
}
class BeanFactory{
	public static void main(String[] args){
		// yha jo object bn rha hwo factory method se bn rha n ki composition se
		BeanClass b1=BeanClass.getInstance();
		BeanClass b2=BeanClass.getInstance();
		b1.display();
		b2.display();
	}
}
