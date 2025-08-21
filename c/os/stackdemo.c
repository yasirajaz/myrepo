#include<stdio.h>
#include"stack.h"
int main(){
	createstack(2);
	push(20);
	push(30);
	push(40);
	printf("popped value is %d\n",pop());
	printf("popped value is %d\n",pop());
	return 0;
}
