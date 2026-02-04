class StringPatternSearch{
	public static void main(String[] args){
		String str="i am an integralite student gral from lucknow";
		String ptr="gral";
		boolean token=false;
		for(int i=0;i<=(str.length()-ptr.length());i++){
			if(ptr.charAt(0)== str.charAt(i)){
				int j=1;
				while(j<ptr.length()){
					if(ptr.charAt(j) != str.charAt(i+j)) break;
					j++;
				}
				if(j== ptr.length()){
					System.out.println("Pattern is found at"+" "+i);
					token =true;
//					break;
				}
			}
		}
		if(!token){
			System.out.println("pattern does not found");
		}
	}
}
