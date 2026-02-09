class BinaryTest{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6,7,8};
		BinarySearch bs= new BinarySearch();
		int result= bs.binary(arr,0,arr.length,7);
		if(result ==-1) System.out.println("data is not present in the array");
		else
			System.out.println("the data is found at index "+result);
	}
}
