#include<stdio.h>
int main(){
	int td[3][4];
	printf("%d\n",(int ) sizeof(td));
	printf("%d\n",(int ) sizeof(td[0]));
	printf("%d\n",(int ) sizeof(td[0][1]));
	int rows=sizeof (td)/sizeof (td[0]);
	int column= sizeof(td[0])/sizeof(td[0][0]);
	printf("%d\n",rows);
	printf("%d\n",column);
	return 0;
}
