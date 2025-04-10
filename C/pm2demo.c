#include<stdio.h>
#define X 20
int main(){
	int a =X;
	printf("%d\n",a);
//	#undef X //if not undef then it gives warning
	#if !defined X
		#define X 40
	#endif
	int b=X;
	printf("%d\n",b);
	return 0;
}
