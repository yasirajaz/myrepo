#include<stdio.h>
int main(){
	int x;
	printf("enter a number: ");
	scanf("%d",&x);
	switch(x){
		default:
			printf("default case\n");
			break;
		case 10&2:
			printf("char B\n");
			break;
		case 1+3:
			printf("char A\n");
			break;
		}
		return 0;
}
