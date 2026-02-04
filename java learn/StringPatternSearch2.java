class StringPatternSearch2{
        public static void main(String[] args){
                String str="i am an integralite student gral from lucknow";
                String ptr="gral";
                boolean token=false;
                for(int i=0;i<=(str.length()-ptr.length());i++){
                        if(ptr.charAt(0)== str.charAt(i) && str.substring(i,i+ptr.length()).equals(ptr)){
				System.out.println("Pattern is found at"+" "+i);
                                token =true;
                        }
                }
                if(!token){
                        System.out.println("pattern does not found");
                }
        }
}

