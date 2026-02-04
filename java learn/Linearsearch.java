class Linearsearch{
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7,8,9};
		int x=4;
		SearchingAlgos sa= new SearchingAlgos();
		int result=sa.linearSearch(a,x);
		if(result==-1){
			System.out.println("data not found");
		}else{
			System.out.println("data is found at "+result);
		}
	}
}
