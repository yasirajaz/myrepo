#include<stdio.h>
int binary_search(int* a,int start,int end,int data){
	if(start<=end){
		int mid=(start+end)/2;
		if(a[mid]==data) return mid;
		else if(a[mid]<data) return binary_search(a,mid+1,end,data);
		else return binary_search(a,start,mid-1,data);
	}else return -1;
}
int bs(int* b,int left,int right, int data){
	int mid;
	while(left<= right){
		mid=(left+right)/2;
		if(data== b[mid]) return mid;
		else if(data< b[mid]) right=mid-1;
		else left= mid+1;
	}
	return -1;
}
int main(int argc,char** argv){
	int arr[]={1,2,3,4,5,6,7,8};
	int len = sizeof(arr)/sizeof(arr[0]);
	int value;
	printf("enter the value to be searched: ");
	scanf("%d",&value);
	int index = binary_search(arr,0,len-1,value);
	int index2= bs(arr,0,len-1,value);
	if(index == -1){
		printf("value is not in array\n");
	}else{
		printf("%d is found at %d\n",value,index);
	}
	if(index2 ==-1) printf("value is not in array\n");
	else printf("value is found at %d\n",index2);
	return 0;
}
