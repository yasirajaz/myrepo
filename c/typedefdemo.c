#include<stdio.h>
void show(){
	typedef int number;
	number x=10;
	printf("x=%d\n",x);
}
int main(){
	// numbe y=20 yha use nahi kr skte kyuki wo local h global nii agr globaal hota to kr skte th
	show();
	int y=20;
	printf("y=%d\n",y);
	return 0;
}
