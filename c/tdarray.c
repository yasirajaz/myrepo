#include<stdio.h>
int main(){
	int td[3][4]={{2,4,6,8},{3,5,7,9},{2,3,4,5}};
	for(int i=0;i<3;i++){
		for(int j=0;j<4;j++){
			printf("%d ",*(*(td+i)+j));//td[i][j]
		}
		printf("\n");
	}
	return 0;
}
