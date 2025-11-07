#include<stdio.h>
int maxsumarray(int* a,int n){
	int maxsofar=0,maxendinghere=0;
	int i,temp;
	for(i=0;i<n;i++){
		temp=maxendinghere+a[i];
		maxendinghere=(temp>0)?temp:0;
		maxsofar=(maxendinghere>maxsofar)?maxendinghere:maxsofar;
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
        //int arr[] = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        int arr[]={-5,-3,-1,-2,-9};
	int len = sizeof(arr) / sizeof(arr[0]);
        printf("given array: ");
        printarray(arr,len);
        int max_sum= maxsumarray(arr,len);
        printf("the sum of max subarray is %d\n",max_sum);
        return 0;
}


