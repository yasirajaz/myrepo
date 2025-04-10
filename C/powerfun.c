#include<stdio.h>
int power(int,int);
int main(){
	int x,n;
	printf("enter the value of x and n:\n");
	scanf("%d%d",&x,&n);
	int result=power(x,n);
	printf("%d to power %d is %d\n",x,n,result);
	return 0;
}
//int power(int x, int n){
//	if(n==0)return 1;
//	if (n==1) return x;
//	return x*power(x,n-1);

int power(int x, int n){
	int result =1;
	for(int i=1;i<=n;i++){
		result = result*x;
	}
	return result;
}
