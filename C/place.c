#include<stdio.h>
int main(){
	int x=10,y=20,z=30;
	printf("%d\t%d\t%d\n",x,y,z);
	printf("%d\t%d\n",x,y,z); // z will be skippped
	printf("%d\t%d\t%d\n",x,y); // garbage value
	return 0;
}
