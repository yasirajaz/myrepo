#include<stdio.h>
int main(){
	typedef struct{
		char* name;
		int age;
	}student;
	student istud;
	istud.name="yasir";
	istud.age=21;
	printf("%s\n",istud.name);
	printf("%d\n",istud.age);
	return 0;
}
