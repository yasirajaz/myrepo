#include<stdio.h>
int main(){
	extern int x;// yha local h lkn initialize nahi kr skte
	printer();
	printf("x=%d\n",x);
	return 0;
}
