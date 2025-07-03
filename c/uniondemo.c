#include<stdio.h>
int main(){
	union student{
		char* name;
		int age;
	}stu;
	printf("%d\n",(int)sizeof(stu));
	stu.name="yasir ajaz";
	printf("%s\n",stu.name);
	stu.age=21;
	printf("%d\n",stu.age);
	return 0;
}
