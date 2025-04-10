#include<stdio.h>
int main(){
	int a=20;
	static int b;//agr yha int b=a krenge to wo error dega kyuki main ka stack frame load nii h jo ki b ko value assign kre
	b=a;// b jb data me jaeg atb usko value chahiye lkn a uss time exist nii krega to error aega.
	printf("a=%d\n",a);
	printf("b=%d\n",b);
	return 0;
}
