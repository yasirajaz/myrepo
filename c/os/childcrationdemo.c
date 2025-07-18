#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
int main( int argc, char** argv){
	printf("startting of main function\n");
	pid_t p=fork();
	if (p>0){
		//int i=0;
		//while(i<50000000000000) i++; this is for getting parent after child
		waitpid(p,NULL);
		printf("parent process\n");
		//printf("PID=%d\n",(int)getpid());
	}else if(p==0){
		printf("child process\n");
		printf("PPID=%d\n",(int)getppid());
	}else{
		printf("fork didnt worked\n");
	}
	printf("end of main\n");
	return 0;
}

