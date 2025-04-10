#include<stdio.h>
void printer();
int main(){
	printer();
	printer();
	printer();
	return 0;
}
void printer(){
	static int x=10;
	printf("%d\n",x);
	x++;
}
