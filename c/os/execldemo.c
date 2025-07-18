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
                /*printf("enter your file name which has tobe open:");
                scanf("%s\n",file);*/
                execl(path,"cat",file,NULL,NULL);
        }else{
                printf("didnt fork\n");
        }
        printf("end of main\n");
        return 0;
}

