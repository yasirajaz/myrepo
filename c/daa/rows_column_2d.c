#include<stdio.h>
void sumarray(int r,int c,int a[r][c],int b[r][c],int res[r][c]){
	int i,j;
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			res[i][j]=a[i][j]+b[i][j];
		}
	}
}
void printarray(int r,int c,int a[r][c]){
	int i,j;
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			printf("%d   ",a[i][j]);
		}
		printf("\n");
	}
}
int main(int argc,char** argv){
	int td1[3][4]={{1,2,3,4},{6,7,8,9},{10,2,3,4}};
	int td2[3][4]={{12,3,4,5},{3,24,45,1},{7,6,8,9}};
	int row = sizeof(td1) / sizeof(td1[0]);
	int col = sizeof(td1[0]) / sizeof(td1[0][0]);

	int result[3][4];
	sumarray(row,col,td1,td2,result);
	printarray(row,col,result);
	return 0;
}
