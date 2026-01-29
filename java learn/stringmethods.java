class stringmethods{
	public static void main(String[] args){
		String s1="Lucknow";

		System.out.println(s1.length());

		String s2=s1.concat(" Junction");
		System.out.println(s2);

		String s3=s2.toLowerCase();
		String s4=s2.toUpperCase();
		System.out.println(s3+"   "+s4);

		String s5= " Lucknow Junction ";
		String s6="lucknow junction";
		String s55=s5.trim();

		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println(s55);
		System.out.println(s55.length());
		System.out.println(s5.length());

		String s7="Lucknow Junction";
		System.out.println(s7.charAt(1));
		System.out.println(s7.indexOf('n'));
		System.out.println(s7.lastIndexOf('n'));

		char[] ch=s7.toCharArray();
		System.out.println(ch.length);
		String s8= new String(ch);
		System.out.println(s8);


		String s9=s1.substring(0,4); // 0 se leke 4-1 tk
		System.out.println(s9);
		String s10=s1.substring(4,7); // 4 se leke 7-1 tk
		System.out.println(s10);
		String s11= s1.substring(2); // 2 se leke last tk
		System.out.println(s11);

		String s12="Lucknow-Kanpur-Banaras";
		String[] sa=s12.split("-");
		for(int i=0;i<sa.length;i++){
			System.out.print(sa[i]+"  ");
		}
	}
}
