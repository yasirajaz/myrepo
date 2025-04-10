#include<stdio.h>
int main(){
	unsigned int x=10,y=12;
	unsigned int a=x&y,b=x|y,c=x^y;
	unsigned int d= ~x;
	printf("a=%u\tb=%u\tc=%u\n",a,b,c);
	printf("x=%u\tx=%u\n",x,y);
	printf("d=%d\n",d);
	int e=x<<1,f=x<<2,g=x<<3;
	printf("e=%d\tf=%d\tg=%d\n",e,f,g);
	int h=x>>1,i=x>>2,j=x>>3;
	printf("h=%d\ti=%d\tj=%d\n",h,i,j);
	return 0;
}
