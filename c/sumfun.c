#include<stdio.h>
int sum(int);
int main(){
	int n;
	printf("enter the value of n:");
	scanf("%d",&n);
	int result= sum(n);
	printf("sum of 1 to %d is %d\n",n,result);
	return 0;
}
int sum (int n){
	if(n==0 || n==1) return n;
	return n+sum(n-1);
}
