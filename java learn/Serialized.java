class Serialized{
	public static void main(String[] args){
		int x=5;
		// old method deprecated Integer it=new Integer(x);//(5) or ("5")
		//boxing
		Integer it=x;
		//unboxing
		int y=it.intValue();
		System.out.println(y);
	}
}
