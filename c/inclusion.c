//#define head #include<stdio.h> it will not work bcz inclusion lies before the macro not after it
// head
#define head <stdio.h>
#include head

int main(){
	printf("hello\n");
	return 0;
}
