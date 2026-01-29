class patter4{
	public static void main(String[] args){
		for (int i = 1; i <= 5; i++){
			for (int s = 1; s <= 5; s++) {
				if (s <= 5 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
