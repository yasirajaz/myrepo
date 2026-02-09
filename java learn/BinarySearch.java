class BinarySearch{
	int binary(int[] a,int low,int high,int data){
		if(low<=high){
			int mid= (low+high)/2;
			if(data==a[mid]){
				return mid;
			}else if(data<a[mid]){
				return binary(a,low,mid-1,data);
			}else if(data>a[mid]){
				return binary(a,mid+1,high,data);
			}
		}
		return -1;
	}
}
