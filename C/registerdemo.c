#include<stdio.h>
int main(){
	register int x=20;
	for(int i=0;i<1000;i++){
		printf("%d\n",x);
	}
	// int* p=&x;
	return 0;
}
