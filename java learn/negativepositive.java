class negativepositive{
	public static void main(String[] args){
		int[] arr={2,4,-3,-7,8,4,-9,4};
		int temp=0;
		ab:
		for(int i=0;i<arr.length;i++){
			for(int j=arr.length-1;j>0;j--){
				if(arr[i]>0 && arr[j]<0 && i<j){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
