class MergeSortDemo{
	public void merge(int[] a,int p,int q,int r){
		int n1=q-p+1,
		n2=r-q;
		int[] L=new int[n1];
		int[] R=new int[n2];
		for(int i=0;i<n1;i++){
			L[i]=a[p+i];
		}
		for(int j=0;j<n2;j++) R[j]=a[j+q+1];
		int i=0,j=0,k=p;
		while(i<n1 && j<n2){
			if(L[i] <R[j]){
				a[k]=L[i];
				i++;
			}else{
				a[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			a[k]=L[i];
			i++;k++;
		}
		while(j<n2){
			a[k]=R[j];
			j++;k++;
		}
	}
	public void mergeSort(int[] a,int p,int r){
		if(p>=r) return;
		int q=(p+r)/2;
		mergeSort(a,p,q);
		mergeSort(a,q+1,r);
		merge(a,p,q,r);
	}
	public static void main(String[] args){
		int[] arr={2,3,5,7,1,4,8,9};
		int start=0;
		int last=arr.length-1;
		int mid=(start+last)/2;
		MergeSortDemo obj=new MergeSortDemo();
		obj.mergeSort(arr,start,last);
		for(int x: arr){
			System.out.print(x+" ");
		}
	}
}
