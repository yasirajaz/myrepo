#include<stdio.h>
int main(){
	int a=10;
	long b=20;
	long long c=30;
	printf("%d\n",(int)sizeof(a)); // size will be 4
	printf("%d\n",(int)sizeof(b));// size will be 8
	printf("%d\n",(int)sizeof(c));// koshish krega ki size 16 ho lkn iski koi guarantee nahi h 8 bhi ho skta  h
	return 0;
}

