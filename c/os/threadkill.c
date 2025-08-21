#include<stdio.h>
#include<pthread.h>
#include<stdlib.h>
int total=0;
void* sum(void*);
int main(int argc, char** argv){
	pthread_t tid;
	pthread_attr_t attr;
	pthread_attr_init(&attr);
	pthread_create(&tid, &attr, sum, &tid);
	pthread_join(tid,NULL);
	pthread_kill(tid,15);
	printf("total = %d∖n",total);
	return 0;
}
void* sum(void* param){
	pthread_t tid= *((pthread_t*)param);
	int i;
	total = 0;
	for (i = 1; i <10; i++){
		total += i;
	}
	pthread_exit(0);
}

