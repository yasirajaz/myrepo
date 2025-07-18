#include<stdio.h>
#include<setjmp.h>
jmp_buf jumpbuffer;
int main(int args, char** argv){
	printf("hello\n");
	if(setjmp(jumpbuffer) !=0){
		printf("end of main\n");
		return 0;
	}
	printer();
	return 0;
}
void printer(){
	printf("printer\n");
	longjmp(jumpbuffer,1);
	printf("end printer\n");
}
