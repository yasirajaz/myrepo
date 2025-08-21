#include<stdio.h>
#include<pthread.h>
#include<stdlib.h>
int sum=0;
void* adder(void*);
int main(int argc, char** argv){
	pthread_t tid;
	pthread_attr_t attr;
	pthread_attr_init(&attr);
	pthread_create(&tid, &attr, adder, argv[1]);
	pthread_join(tid,NULL);
	printf("sum = %d∖n",sum);
	return 0;
}
void* adder(void* param){
	int i, j = atoi(param);
	sum = 0;
	for (i = 1; i <= j; i++){
		sum += i;
	}
	pthread_exit(0);
}
