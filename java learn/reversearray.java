class reversearray{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6};
		int[] rarr=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			rarr[i]=arr[arr.length-1-i];
		}
		for(int i=0;i<rarr.length;i++){
			System.out.print(rarr[i]+ " ");
		}
	}
}
