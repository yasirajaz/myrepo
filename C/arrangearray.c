#include<stdio.h>
int main(){
	int a[]={2,4,-3,6,-8,-9,10};
	int len = sizeof(a)/sizeof (a[0]);
	int i=0,j=len-1;
	int temp;
	while(i<j){
		while(a[i]<0)i++;
		while(a[j]>0)j--;
		if(i<j){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	for(int i=0;i<len;i++){
		printf("%d ",a[i]);
	}
	printf("\n");
	return 0;
}
