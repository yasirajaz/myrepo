#include<stdio.h>
int main(){
	int x=10;
	int* p=&x;
	char ch ='A';
	char* cp= &ch;
	printf("%d\n",(int) sizeof(p));
	printf("%d\n",(int)sizeof(cp));
	return 0;
}
