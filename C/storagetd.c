#include<stdio.h>
int main(){
	int td[4][4]={{1,2,3,4},{2,4,6,8},{3,5,7,9},{10,20,30,40}};
	printf("%d\n",*(td[0]+2));
	printf("%d\n",*(td[2]+1)); //*(*(td+2)+1) ==td[2][1]
	printf("%d\n",*(*(td+3)+3));// td[3][3]
	return 0;
}

