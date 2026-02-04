class ReversingString{
	public static void main(String[] args){
		String s1="Lucknow";
		char temp=0;
		char[] s2=s1.toCharArray();
		for(int i=0;j=s2.length-1;i<j;i++;j--){
			temp=s2[i];
			s2[i]=s2[j];
			s2[j] = temp;
			String s3=new String(s2);
		}
		System.out.println("string is reverse: "+s3);
	}
}
