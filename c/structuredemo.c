#include<stdio.h>
int main(){
	struct student {char* name; int age;}stu = {"yasir ajaz", 21};
	printf( "Name: %s\n", stu.name);
	printf("Age : %d\n", stu.age);
	struct student1{
		char* name;
		int age;
	};
	struct student1 stu1;
	stu1.name="amir";
	stu1.age =19;
	printf("name : %s\n",stu1.name);
	printf("age : %d\n",stu1.age);
	printf("%d\n",(int)sizeof(stu1));


	struct family{
		char* name;
		int age;
	}sarray[2]={{"yasir",21},{"amir",19}};
	for(int i=0;i<2;i++){
		printf("%s\n",sarray[i].name);
		printf("%d\n",sarray[i].age);
	}


	return 0;



}
