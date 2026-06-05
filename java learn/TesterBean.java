class BeanClass{
	int i=0;
	public void display(){
		System.out.println(i);
		i++;
	}
}
class TesterBean{
	public static void main(String[] args){
		BeanClass b1=new BeanClass();
		b1.display();
		BeanClass b2=new BeanClass();
		b2.display();
	}
}
