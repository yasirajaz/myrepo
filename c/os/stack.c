#include<stdio.h>
#include<stdlib.h>
int* stack=NULL;
int top=-1;
int size=0;
int createstack(int s) {
	size=s;
	top = -1;
	stack = (int*)malloc(size * sizeof(int));
	return 0;
}
void push(int value) {
	if (top == size - 1) {
		printf("Stack overflow\n");
	return;
	}
	stack[++top] = value;
}

int pop() {
	if (top == -1) {
		printf("Stack underflow, Cannot pop\n");
		return -1;
	}
	return stack[top--];
}
