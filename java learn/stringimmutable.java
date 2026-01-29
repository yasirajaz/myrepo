class stringimmutable{
	public static void main(String[] args){
		String s1="LUCKNOW";
		String s2=s1;
		System.out.println(s1==s2);
		s1=s1+" JUNCTION";
		System.out.println(s1+" "+s2);
		System.out.println(s1==s2);
		//String s2=s1;
		//System.out.println(s1==s2);
	}
}
