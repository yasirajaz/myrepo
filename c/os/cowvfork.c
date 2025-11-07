#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
int x = 10;
int main(int argc,char** argv){
	pid_t q= vfork();
	printf("vfork is running\n");
	if(q == 0) {
		x+=5;
		printf("Child (vfork): x=%d\n", x);
	}else if(q>0){
		wait(NULL);
		printf("Parent (vfork): x=%d\n",x);
	}else{
		return -1;
	}
	return 0;
}
