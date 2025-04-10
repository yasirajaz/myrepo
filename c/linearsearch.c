#include<stdio.h>
int linearSearch(int*,int,int);
int main(){
	int arr[]={1,2,3,4,5,6};
	int len = sizeof(arr)/sizeof(arr[0]);
	int data;
	printf("enter the data:\n");
	scanf("%d",&data);
	int index= linearSearch(arr,len,data);
	if (index ==-1){
		printf("data not found\n");
	}else{
		printf("data is found at %d\n",index);
	}
	return 0;
}
int linearSearch(int*a,int len,int data){
	for(int i=0;i<len;i++){
		if(a[i]==data){
			return i;
		}
	}
	return -1;
}
