#include<stdio.h>
int main(){
	int x=10;
	printf("%d\n",sizeof(x));
	printf("%ld\n",sizeof(x));
	printf("%ld\n",(long)sizeof(x));
	printf("%d\n",(int)sizeof(x));
	return 0;
}
