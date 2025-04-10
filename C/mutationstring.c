#include<stdio.h>
int main(){
	char str[]="Lucknow";
	char* s="Kanpur";
	printf("%s\n",str);
	printf("%s\n",s);
	str[0]='T';
//	s[0]='J'; //*s='j',*(s+0)='j'
	printf("%s\n",str);
	printf("%s\n",s);
 	return 0;
}
