#include<stdio.h>
void printer();
int main(){
	printer();
	printer();
	printer();
	return 0;
}
void printer(){
	int x=10;
	printf("x=%d\n",x);
	x++;
}
