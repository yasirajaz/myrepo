#include<stdio.h>
#include"lib.h"
int main(int argc, char** argv){
	int a,b;
	printf("enter two numbers: ");
	scanf("%d%d",&a,&b);
	printf("sum=%d\n",sum(a,b));
	printf("product=%d\n",multiply(a,b));
	return 0;
}
