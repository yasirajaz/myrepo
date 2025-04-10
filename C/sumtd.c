#include<stdio.h>
int main(){
	int td[3][4]={{2,4,6,8},{3,5,7,9},{10,20,30,40}};
	int sum=0;
	for(int i=0;i<3;i++){
		for(int j=0;j<4;j++){
			printf("%d   ",td[i][j]);
			sum= sum+td[i][j];
		}
		printf("\n");
	}
	printf("the summof all element is %d\n",sum);
	return 0;
}
