#include<stdio.h>
int main(){
	for(int i=0;i<5;i++){
	for(int j=0;j<5;j++){
	if (j==2)continue;
	printf("i=%d\tj=%d\n",i,j);
	}
   }
	return 0;
}
