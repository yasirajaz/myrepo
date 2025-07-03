#include<stdio.h>
int main(){
	struct user{
		char gender;
		char* name;
		int age;
        }fbusr;
	printf("%d\n",(int)sizeof(fbusr));
	return 0;
}
