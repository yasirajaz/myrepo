#include<stdio.h>
#include<stdlib.h>
int main(){
	int* p=(int*)calloc(4,sizeof(int));
	*p=10;
	*(p+1)=20;
	*(p+2)=30;
	*(p+3)=40;
	printf("%d\n",*p);
	printf("%d\n",*(p+1));
	printf("%d\n",*(p+2));
	printf("%d\n",*(p+3));
	return 0;
}
