#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<unistd.h>
#include<sys/wait.h>
int main(int args, char** argv){
	char indata[100];
	char* sa[10];
	char current_path[300];
	system("clear");
	while(1){
		int i=0,j;
		getcwd(current_path, sizeof(current_path));
		if(strcmp(current_path,"/home/ubuntu")==0){
			printf("~ alpha> ");
		}else{
			printf("%s alpha> ",current_path);
		}
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
				chdir(getenv("HOME"));
			}else if (strcmp(sa[1], "~") == 0) {
				chdir(getenv("HOME"));
			}else if(sa[1][0] == '~' && sa[1][1] == '/'){
				char home[]="/home/ubuntu";
				char path[200];
				char dir_name[50];
				int i,j;
				for(i=0; home[i] != '\0';i++){
					path[i]=home[i];
				}
				path[i]= '/';
				i++;
				for(j=0; sa[1][j+2] !='\0';j++){
					dir_name[j]= sa[1][j+2];
					path[i+j]= dir_name[j];
				}
				path[i+j]='\0';
				chdir(path);
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
			/*printf("child created succesfully\n");*/
			execvp(sa[0],sa);
		}else{
			/*printf("parent waiting for child\n");*/
			wait(NULL);
		}
	}
	return 0;
}
