#include<stdio.h>
void insertion_sort(int* a, int n){
	int i,j;
	for (j=1;j<n;j++){
		int key= a[j];
		int i=j-1;
		while (i>=0 && a[i]>key){
			a[i+1]=a[i];
			i--;
		}
		a[i+1]=key;
	}
}
void printarray(int* a,int n){
	int i;
	printf("unsorted array: ");
	for(i=0;i<n;i++){
		printf("%d ",a[i]);
	}
	printf("\n");
}
int main() {
	int arr[] = {15,9,85,3,4,1,2,10};
	int len = sizeof(arr) / sizeof(arr[0]);
	int i;
	printf("unsorted array: ");
	printarray(arr,len);
	insertion_sort(arr, len);
	printf("Sorted array: ");
	printarray(arr,len);
	return 0;
}
