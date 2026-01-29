class secondlargest{
        public static void main(String[] args){
		int[] arr={1,2,4,5,77,9};
		int max=0;
		int secondmax=0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				secondmax=max;
				max=arr[i];
			}else if(arr[i]>secondmax && arr[i]!=max){
				secondmax=arr[i];
			}
		}
		System.out.println(secondmax);
	}
}
