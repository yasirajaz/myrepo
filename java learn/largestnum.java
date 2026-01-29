class largestnum{
	public static void main(String[] args){
		int[] arr={1,2,4,5,77,9};
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(max>arr[i]){
				 System.out.println(max);
			}else{
				max=arr[i];
			}
		}
	}
}
