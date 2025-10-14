#include<stdio.h>
int ls(int* a, int len,int data){
	int flag = -1;
	int i;
	for(i=0;i<len;i++){
		if(a[i]== data){
			flag=i;
			break;
		}
	}
	return flag;
}
int main(int argc, char** argv){
	int arr[]={3,23,43,5,45,2,88,4};
	int length= sizeof(arr)/sizeof(arr[0]);
	int data;
	printf("Enter the data to be searched: ");
	scanf("%d",&data);
	int result=ls(arr,length,data);
	printf("The searched data is at %d",result);
	return 0;
}
