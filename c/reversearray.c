#include<stdio.h>
int main(){
	int a[]={1,2,3,4,5,6,7};
	int len=sizeof(a)/sizeof(a[0]);
	int i=0,j=len-1;
	int temp;
	for(int i=0;i<len;i++){
		printf("%d ",a[i]);
	}
	printf("\n");
	while(i<j){
		temp =a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	for(int i=0;i<len;i++){
		printf("%d ",a[i]);
	}
	printf("\n");
	return 0;
}
