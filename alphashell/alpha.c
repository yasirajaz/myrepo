#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<unistd.h>
#include<sys/wait.h>
int main(int args, char** argv){
	char indata[100];
	char* sa[10];
	system("clear");
	while(1){
		int i=0,j;
		printf("~alpha> ");
		scanf(" %[^\n]",indata);
		char* tokens=strtok(indata," ");
		while(tokens !=NULL){
			sa[i] = tokens;
			tokens = strtok(NULL, " ");
			i++;
        	}
		sa[i] = NULL;
		if(strcmp(sa[0],"cd")==0){
			if(sa[1] == NULL){
				printf("argument in cd is missing\n");
			} else if(chdir(sa[1])!=0) {
				printf("cd failed and directory not changed \n");
			}
			continue;
		}
		if(strcmp(indata,"exit")==0) return 0;
		pid_t pid=fork();
		if (pid<0){
			printf("fork not called\n");
		}else if(pid == 0){
			printf("child created succesfully\n");
			execvp(sa[0],sa);
		}else{
			printf("parent waiting for child\n");
			wait(NULL);
			printf("parent finished after child\n");
		}
	}
	return 0;
}
