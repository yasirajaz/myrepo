#include<stdio.h>
int swap(int,int){
int main(){
	int x=10,y=20;
	x=swap(x,y);
	y=swap(y,x);
	printf("x=%d\ty=%d\n");
	return 0;
}
int swap(int a,int b){
	return b;
}
