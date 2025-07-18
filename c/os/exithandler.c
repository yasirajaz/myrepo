#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
void f1();
void f2();
int main(){
	atexit(f1);
	atexit(f2);
	atexit(f2);
	printf("start of main\n");
	printf("hello\n");
	printf("end of main\n");
	_exit(0);
}
void f1(){
	printf("f1 is called\n");
}
void f2(){
	printf("f2 is called\n");
}
