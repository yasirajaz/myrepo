class MainClassInjection{
	public static void main(String[] args){
		SortingAlgos sa=new SortingAlgos();
		SearchingAlgos sea=new SearchingAlgos();
		Algos algo=new Algos(sa,sea);
		int[] arr = {64, 25, 12, 22, 11};
		algo.sa.bubbleSort(arr);
		System.out.println("Sorted Array:");
		for (int x : arr)
			System.out.print(x + " ");
		System.out.println();
		int index=algo.sea.linearSearch(arr, 22);
		if (index != -1) System.out.println("Found at index " + index);
		else System.out.println("Not found");
	}
}
