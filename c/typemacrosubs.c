#include<stdio.h>
#define AGE 30 //object like macro
#define MUX(X,Y) ((X)*(Y)) //function like macro
int main(){
	int x=MUX(2,3);
	float y=MUX(2+5,7+2);
	printf("x=%d\n",x);
	printf("y=%f\n",y);
	return 0;
}
