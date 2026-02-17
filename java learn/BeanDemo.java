class BeanDemo{
	//different from factory bcz factory method returns something but this doesnt
	private int age;
	private String name;
	public void setAge(int age){ //setter method
		this.age=age;
	}
	public int getAge(){ //getter method
		return age;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}
