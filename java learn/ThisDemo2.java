class ThisDemo2{
	int age;
	String name;
	String college;
	ThisDemo2(int x){
		age=x;
	}
	ThisDemo2(int x,String y){
		this(x);
		name=y;
	}
	ThisDemo2(int x,String y,String z){
		this(x,y);
		college=z;
	}
}
