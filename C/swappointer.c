#include<stdio.h>
void swap(int*,int*);
int main(){
	int x=10,y=20;
	printf("x=%d\ty=%d\n",x,y);
	swap(&x,&y);
	printf("x=%d\ty=%d\n",x,y);
	return 0;
}
void swap (int* a,int* b){
	int temp;
	temp=*a; // a jisko point kar rha i uski value temp me rkho
	*a=*b;//b isko point kr rha h uski value a jisko point kr rha h usme rkh do
  	*b=temp;// temp ki value b jisko point kr rha usme rkh do
}
