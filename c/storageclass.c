#include<stdio.h>
int a=10;
int b;
int main(){
	int c=20;
	int x=50;
	if (1){
		int x=45;
		printf("x=%d\n",x);
	}
	printf("x=%d\n",x);
	printf("a=%d\tb=%d\tc=%d\n",a,b,c);
	return 0;
}
