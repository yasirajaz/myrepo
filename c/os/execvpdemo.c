#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<wait.h>
int main(int argc, char** argv){
        printf("main process\n");
        pid_t p=fork();
        if (p>0){
                wait(NULL);
                printf("parent terminated\n");
        }else if(p==0){
                char* path="/bin/cat";
                char* file="processloaddemo.c";
		char* args[]={"cat",file,NULL};
                execvp("cat",args);
        }else{
                printf("didnt fork\n");
        }
        printf("end of main\n");
        return 0;
}
