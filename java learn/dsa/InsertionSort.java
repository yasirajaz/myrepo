class InsertionSort{
	public void Insertion(int[] arr){
		for(int i=1;i<arr.length;i++){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	public void recIns(int[] arr,int len){
		if(len<=1) return;
		int key=arr[len-1];
		int j=len-2;
		recIns(arr,len-1);
		while(j>=0 && arr[j]>key){
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
	}



	public static void main(String[] args){
		int[] a={7,3,5,4,2,6};
		int l=a.length;
		InsertionSort obj= new InsertionSort();
		//obj.Insertion(a);
		obj.recIns(a,l);
		for(int x: a){
			System.out.print(x+"  ");
		}
	}
}
