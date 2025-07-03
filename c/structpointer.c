#include<stdio.h>
int main(){
	struct student {
		char* name;
		int age;
	};
	struct student stu;
	stu.name="yasir";
	stu.age=21;
	struct student* sp;
	sp = &stu;
	printf("name: %s\n", sp->name);
	printf("age: %d\n", sp->age);
	return 0;
}
