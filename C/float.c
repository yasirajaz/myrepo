#include<stdio.h>
int main(){
	float f1=3.18;
	float f2=356.347;
	printf("%f\n",f1);
	printf("%f\n",f2);
	printf("%10f\n",f2);
	printf("%15f\n",f2); 
	printf("%10.2f\n",f2); // round off if greater than 5 then it will increase by one
	return 0;
}
