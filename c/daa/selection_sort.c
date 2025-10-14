#include<stdio.h>
void selection_sort(int* a, int n){
	int i,j,temp;
	for(i=0;i<n-1;i++){
		int index=i;
		for(j=i+1;j<n;j++){
			if(a[j]<a[index]){
				index=j;
			}
		}
		temp=a[i];
		a[i]=a[index];
		a[index]=temp;
	}
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
	int i;
	printf("unsorted array: ");
	printarray(arr,len);
	selection_sort(arr, len);
	printf("Sorted array: ");
	printarray(arr,len);
	return 0;
}

