#include<stdio.h>
int main(){
	int a=55,b=66;
	int x=++a;
	int y=b++;
	printf("x=%d\ta=%d\n",x,a);
	printf("y=%d\tb=%d\n",y,b);
	return 0;
}
