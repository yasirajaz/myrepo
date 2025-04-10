#include<stdio.h>
int add(int,int);
int main(){
	int a,b,c;
	printf("enter two numbers:");
	scanf("%d%d",&a,&b);
	c = add(a,b);
	printf("sum=%d\n",c);
	return 0;
}
int add(int x,int y){
// yha jo return h vo value ko return nahi kra rha bs sum kr k accumulator m bhej rha
	return x+y;//assignment operataor accumulator m jo last m value aaegi usko c  me bhej dega
}
