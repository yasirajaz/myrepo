#include<stdio.h>
int getmax(int,int);// prototype declarartion of fumction
int main(){
	int x,y;
	printf("enter two nnumbers:\n");
	scanf("%d%d",&x,&y);
	int a = getmax(x,y);// calling of getmax function
	printf("max = %d\n",a);
	return 0;
}
//definition of function
int getmax(int a, int b){
	if(a>=b) return a;
	return b;
}
