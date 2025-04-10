#include<stdio.h>
int main(){
	int a[]={1,2,3,4,-1,-6,10};
	int len= sizeof(a)/sizeof(a[0]);
	int i=0,j= len-1;
	for(int i=0;i<len;i++){
		a[i]=a[i]+a[i-1];
	}
	for (int i=0;i<len;i++){
		printf("%d ",a[i]);
	}
	printf("\n");
	return 0;
}
