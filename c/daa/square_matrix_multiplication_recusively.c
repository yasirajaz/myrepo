#include<stdio.h>
#define N 3
void smmr(int i,int j,int k, int a[N][N],int b[N][N],int c[N][N]){
	if(i>=N) return;
	if(j>=N){
		smmr(i+1,0,0,a,b,c);
		return;
	}
	if(k<N){
		c[i][j] += a[i][k]*b[k][j];
		smmr(i,j,k+1,a,b,c);
	}else smmr(i,j+1,0,a,b,c);

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
        int td1[3][3]={{1,2,3},{6,7,8},{2,3,4}};
        int td2[3][3]={{3,4,5},{3,2,1},{7,6,1}};
        int row = sizeof(td1) / sizeof(td1[0]);
        int col = sizeof(td1[0]) / sizeof(td1[0][0]);
	int result[row][col];
	smmr(0,0,0,td1,td2,result);
        printmatrix(row,col,result);
        return 0;
}

