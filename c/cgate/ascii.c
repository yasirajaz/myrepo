#include<stdio.h>
int main(){
	char a;
	a='A';
	printf("%c\n",a);
	printf("%d\n",a);
	a=98;
        printf("%c\n",a);
        printf("%d\n",a);
	if(a=='b'){
		printf("true\n");
	}else{
		printf("false\n");
	}
	return 0;
}
