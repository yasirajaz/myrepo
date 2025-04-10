#include<stdio.h>
int main(){
	printf("Beginning of main\n");
	goto ab;
	printf("Mid of main\n");
	ab:
	printf("End of main\n");
	return 0;
}
