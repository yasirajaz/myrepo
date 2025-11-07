#include<stdio.h>
int partition(int* a,int p,int r){
	int x=a[r];
	int i=p-1;
	int j,temp;
	for(j=p;j<r;j++){
		if(a[j]<=x){
			i +=1;
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	temp=a[i+1];
	a[i+1]=a[r];
	a[r]=temp;
	return i+1;
}
void quicksort(int* a,int p,int r){
	if (p<r){
		int q=partition(a,p,r);
		quicksort(a,p,q-1);
		quicksort(a,q+1,r);
	}
}
void printarray(int* a,int n){
	int i;
	for(i=0;i<n;i++){
		printf("%d ",a[i]);
	}
	printf("\n");
}
int main(int args,char** argv){
	int arr[]={-5,-3,-4,7,9,2,1,3,4};
	int length= sizeof(arr)/sizeof(arr[0]);
	printf("given array: ");
	printarray(arr,length);
	quicksort(arr,0,length);
	printf("sorted array: ");
	printarray(arr,length);
	return 0;
}
