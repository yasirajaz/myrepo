#include<stdio.h>
int main(int argc, char** argv){
	//if (argc==1){
	if (argv[1] ==NULL){
		printf("no argument passed\n");
		return 0;
	}
	int i=1;
	//for (i=0;i<argc;i++){
	while(argv[i] != NULL){
		printf("%d argument =%s\n",i,argv[i]);
		i++;
	}
	return 0;
}
