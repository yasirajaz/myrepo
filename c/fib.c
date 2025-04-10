#include<stdio.h>
long fib(int);
int main(){
	int n;
	printf("enter nth term:");
	scanf("%d",&n);
	long result= fib(n);
	printf("fibonacci of %d is %ld\n",n,result);
	return 0;
}
long fib(int n){
	long first=1,second=1,result;
	for(int i=3;i<=n;i++){
		result= first+second;
		first = second;
		second = result;
	}
	return result;
}
