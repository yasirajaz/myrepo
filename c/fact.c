#include<stdio.h>
long fact(unsigned int);
int main(){
	unsigned int data;
	printf("enter a positive number:");
	scanf("%u",&data);
	long result= fact(data);
	printf("factorial of %u is %ld\n",data,result);
	return 0;
}
//long fact(unsigned int x){
//	if(x==1||x==0) return 1;
//	return x*fact(x-1);
long fact(unsigned int n){
	int result =1;
	for(int i=1;i<=n;i++){
	result =result *i;
	}
	return result;
}
