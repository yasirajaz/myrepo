class pattern8{
        public static void main(String[] args){
                for(int i=1;i<=3;i++){
			for (int j=1; j<=3+i-1; j++) {
				if (j<=3-i) System.out.print("  ");
				else System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=3-1;i>=1; i--) {
			for (int j=1; j<=3+i-1;j++){
				if (j<=3-i) System.out.print("  ");
                                else System.out.print("* "); 
                        }
			System.out.println();
		}
	}
}
