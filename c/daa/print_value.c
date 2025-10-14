#include<stdio.h>
void printvalue(int n){
	int i;
	for(i=n;n>=1;n=n/2){
		printf("%d\n",n);
	}
}
int main(int argc, char** argv){
	int value;
	printf("enter a number: ");
	scanf("%d",&value);
	printf("values after halving: ");
	printvalue(value);
	return 0;
}
