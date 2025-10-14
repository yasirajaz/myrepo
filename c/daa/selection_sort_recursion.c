#include<stdio.h>
void selection_sort(int* a, int n){
	int i,temp,index;
	if(n==1) return;
	index=0;
	for(i=1;i<n;i++){
		if(a[i]<a[index]) index=i;
	}
	temp=a[0];
	a[0]=a[index];
	a[index]=temp;
	selection_sort(a+1,n-1);
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

