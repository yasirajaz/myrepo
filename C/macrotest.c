#include<stdio.h>
#define MAX 10 //object like macro
#define SUM(X,Y) X+Y//function like macro
int main(){
	int a=MAX;
	float b=SUM(2.3,3.2);
	printf("a=%d\n",a);
	printf("b=%f\n",b);
	return 0;
}
