#include<stdio.h>
int main(){
	int x=10,y=20,z=30;
	if(x<y)
		printf("inside if\n");

	else{
		printf("inside else\n");
		printf("leaving else block\n");
	}
	printf("out of if else blocks\n");
	return 0;
}
