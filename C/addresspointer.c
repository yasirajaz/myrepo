#include<stdio.h>
int main(){
	int x=10;
	printf("address of x is %p\n",&x);
	int a=&x;
	int* p=&x;
	printf("address of x is %p\n",a);
	printf("address of x is %p\n",p);
	a++;
	p++;
	printf("address of x is %p\n",a);
	printf("address of p is %p\n",p);
	return 0;
}
