#include<stdio.h>
int main(){
	char str[]="Lucknow";
	char *s="Lucknow";
	char sa[]={'L','u','c','k','n','o','w','\0'};
	printf("%s\n",str);//first
	printf("%s\n",&str[0]);//first
	printf("%s\n",s);//second
	printf("%s\n",sa);//third
	return 0;
}
