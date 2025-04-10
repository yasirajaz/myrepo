#include"stdio.h"
#include"stdlib.h"
int main(){
	char* p= (char*) malloc(sizeof(int));//yha casting phle hi hui h taki printf ya fir har jgh na krna pde
	*p ='a';
	*(p+1)='Z';
	*(p+2)='K';
	printf("%c\n",*p);
	printf("%c\n",*(p+1));
	printf("%c\n",*(p+2));
	return 0;
}
