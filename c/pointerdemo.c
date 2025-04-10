#include<stdio.h>
int main(){
	int x=10;
	int* p;
	p=&x;
	printf("x=%d\n",x);
	printf("x=%d\n",*p);
	*p=20;
	printf("x=%p\n",&x);
	printf("x=%d\n",*p);
	return 0;
}
