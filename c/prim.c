#include<stdio.h>
int main(){
	int td[4][4]={{2,4,6,8},{3,5,7,9},{10,20,30,40},{8,3,9,1}};
	int sum =0;
	for(int i=0;i<4;i++){
			sum =sum+td[i][3-i];
	}
	printf("sum of primary is %d\n",sum);
	return 0;
}
