#include<stdio.h>
void bubblesort(int* a,int n){
	int i,temp;
	if(n==1) return;
	for(i=0;i<n-1;i++){
		if(a[i]>a[i+1]){
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
	}
	bubblesort(a,n-1);
}
void printarray(int*a, int n){
	int i;
	for(i=0;i<n;i++){
		printf("%d ",a[i]);
	}
	printf("\n");
}
int main(){
	int arr[] = {15,9,85,3,4,1,2,10};
	int len = sizeof(arr) / sizeof(arr[0]);
	printf("unsorted array: ");
	printarray(arr,len);
	bubblesort(arr,len);
	printf("Sorted array: ");
	printarray(arr,len);
	return 0;
}
