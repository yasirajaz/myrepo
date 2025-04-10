#include<stdio.h>
#include<string.h>
int main(){
	char str[]="Lucknow";
	int len=strlen(str);
	for(len=strlen(str)-1;len>=0;len--)
		printf("reverse string=%s\n",str);
	return 0;
}
