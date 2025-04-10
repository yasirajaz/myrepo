#include<stdio.h>
int binarySearch(int*,int,int,int);
int main(){
	int arr[]={1,2,3,4,5,6,7,8};
	int len = sizeof(arr)/sizeof(arr[0]);
	int data;
	printf("enter the data to be searched\n");
	scanf("%d",&data);
	int index=binarySearch(arr,0,len-1,data);
	if(index==-1){
		printf("data not found\n");
	}else{
		printf("%d is found at %d\n",data,index);
	}
	return 0;
}
int binarySearch(int* a,int si,int li,int data){
	if(si<=li){
		int mid=(si+li)/2;
		if(a[mid]==data) return mid;
		else if(a[mid]<data){
			return binarySearch(a,mid+1,li,data);
		}else{
		return binarySearch(a,si,mid-1,data);
		}
	}else{
		return -1;
	}
}
