class countchar{
	public static void main(String[] args){
		String s="Lucknow Junction";
		char[] ch= s.toCharArray();
		for(int i=0;i<ch.length;i++){
			int count=1;
			if(ch[i] ==' ') continue;
			for(int j=i+1;j<ch.length;j++){
				if(ch[i] == ch[j]){
					count++;
					ch[j]='0';
				}
			}
			if(ch[i]=='0') continue;
			System.out.println(ch[i]+" frequency is "+ count);
		}
	}
}
