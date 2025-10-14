#include<stdio.h>
#include<limits.h>
void merge(int* a,int si,int mid,int li){
	int n1=mid-si+1;
	int n2=li-mid;
	int left[n1+1],right[n2+1];
	int i,j;
	for(i=0;i<n1;i++){
		left[i]=a[si+i];
	}
	for(j=0;j<n2;j++) {
		right[j]=a[mid+j+1];
	}
	left[n1]= INT_MAX;
	right[n2]= INT_MAX;
	i=j=0;
	int k;
	for(k=si;k<=li;k++){
		if(left[i]<=right[j]){
			a[k]=left[i];
			i++;
		}else{
			a[k]=right[j];
			j++;
		}
	}
}
void merge_sort(int* a,int si,int li){
	if(si<li){
		int mid= (si+li)/2;
		merge_sort(a,si,mid);
		merge_sort(a,mid+1, li);
		merge(a,si,mid,li);
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
	merge_sort(arr,0,len-1);
	printf("Sorted array: ");
	printarray(arr,len);
	return 0;
}
