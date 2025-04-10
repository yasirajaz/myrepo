#include<stdio.h>
void printer();
extern int x=10;// for global
int main(){
	printf("x=%d\n",x);
	if(1){
		auto int x=20;//for local
		printf("x=%d\n",x);
	}
	printf("x=%d\n",x);
	printer();
	return 0;
}
void printer(){
	auto int x=90; // agr yha x dec lare nii hota to global x 10 print hota 
	printf("x=%d\n",x);
}
