#include<stdio.h>
#define AGE 30 
#define STD 7
int main(){
	char* name="amit kumar";
	int nextage= AGE+1;
	int standard=STD +1;
	printf("age of %s is %d and his stanadrd is %d\n",name,nextage,standard);

	#ifndef AGE
		#define AGE 50
	#endif
	int ag= AGE;
	printf("%d\n",ag);
	return 0;
}
