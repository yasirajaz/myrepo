#include<stdio.h>
int maximum_subarray(int* a,int n){
	int maxsofar=0;
	int i,j,k,sum;
	for(i=0;i<n;i++){
		sum=0;
		for(j=i;j<n;j++){
			sum= sum+a[j];
			maxsofar= (sum>maxsofar)?sum:maxsofar;
		}
	}
	return maxsofar;
}
void printarray(int*a, int n){
	int i;
	for(i=0;i<n;i++){
		printf("%d ",a[i]);
	}
	printf("\n");
}
int main(){
	int arr[] = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
	int len = sizeof(arr) / sizeof(arr[0]);
	int i;
	printf("given array: ");
	printarray(arr,len);
	int max_sum= maximum_subarray(arr,len);
	printf("the sum of max subarray is %d\n",max_sum);
        return 0;
}
