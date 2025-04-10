#include<stdio.h>
int main(){
	void* vp;
	int x=10;
	vp=&x;
	float f=3.24;
	vp=&f;// jo last me rhega uska address hi aega
//	printf("%f\n",*vp); //ye derefrence nahi hoga 
	printf("%f\n",*((float*)vp));
	return 0;
}
