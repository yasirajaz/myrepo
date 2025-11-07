#include<stdio.h>
void multiply(int r1,int c1,int a[r1][c1],int r2,int c2,int b[r2][c2],int res[r1][c2]){
	int i,j,k;
	for(i=0;i<r1;i++){
		for(j=0;j<c2;j++){
			res[i][j]=0;
			for(k=0;k<c1;k++){
				res[i][j] += a[i][k] * b[k][j];
			}
		}
	}
}
void printmatrix(int r,int c,int a[r][c]){
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
	int td2[4][4]={{12,3,4,5},{3,24,45,1},{7,6,8,9},{1,2,3,4}};
	int row1 = sizeof(td1) / sizeof(td1[0]);
	int col1 = sizeof(td1[0]) / sizeof(td1[0][0]);
	int row2 = sizeof(td2) / sizeof(td2[0]);
	int col2 = sizeof(td2[0]) / sizeof(td2[0][0]);
	if(col1==row2){
		int result[row1][col2];
		multiply(row1,col1,td1,row2,col2,td2,result);
		printmatrix(row1,col2,result);
	}else printf("claculation not possible\n");
	return 0;
}
