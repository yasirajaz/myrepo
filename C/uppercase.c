#include<stdio.h>
#include<string.h>
void changetoupper(char*);
int main(){
	char str[]="allahabad";
	printf("%s\n",str);
	changetoupper(str);
	printf("%s\n",str);
	return 0;
}
void changetoupper(char* s){
	int len=strlen(s);
	for(int i=0;s[i]!=0;i++){
		if(s[i]<96 && s[i]>123){
			printf("%s\n",s);
		}else{
			s[i]=s[i]-32;
		}
	}
}
