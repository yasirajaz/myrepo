#include<stdio.h>
int stringlenght(char*);
int main(){
	char * str="Lucknow";
	int  len= stringlength(str);
	printf("length=%d\n",len);
	return 0;
}
int stringlength(char* s){
	int i=0;		//int i=0			//int i=-1;
	while(s[i]!='\0')i++;	//while(s[i++]!=0)return i-1;	//while(s[++i]!=0)return i
	return i;
}
