#include<stdio.h>
#include<unistd.h>
int main(int argc, char** argv){
	printf("PID=%d\n",(int)getpid());
	printf("PPID=%d\n",(int)getppid());
	printf("UID=%d\n",(int)getuid());
	printf("GID=%d\n",(int)getgid());
	return 0;
}
