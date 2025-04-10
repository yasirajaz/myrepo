#include<stdio.h>
void changetolower(char*);
int main(){
	char str[]="ALLAHABAD";
	printf("%s\n",str);
	changetolower(str);
	printf("%s\n",str);
	return 0;
}
void changetolower(char*s){
	for(int i=0;s[i]!='0';i++){
		if(s[i]>=65 && s[i]<=90){
			s[i]=s[i]+32;
		}
	}
}
