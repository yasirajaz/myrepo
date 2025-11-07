#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
int x=10;
int main(int argc, char** argv){
	pid_t p = fork();
	printf("fork is running\n");
	if (p == 0) {
		x += 5;
		printf("Child (fork): x = %d\n",x);
	} else {
		printf("Parent (fork): x =%d\n",x);
	}
	return 0;
}

