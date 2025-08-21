#include<stdio.h>
#include<pthread.h>
#include<stdlib.h>
#define BUFFER_SIZE 10
int buffer[BUFFER_SIZE];
int count= 0;
void* producer(void* arg);
void* consumer(void* arg);
void* producer(void* arg){
	int next_produced=0;
	int in=0;
	while(1){
		while(count == BUFFER_SIZE);
		buffer[in]=next_produced;
	/*	printf("produced: %d\n",next_produced); */
		next_produced++;
		in = (in + 1) % BUFFER_SIZE;
		count ++;
	}
	pthread_exit(0);
}
void* consumer(void* arg){
	int out=0;
	while(1){
		int next_consumed=buffer[out];
		printf("consumed : %d\n",next_consumed);
		out = (out + 1)%BUFFER_SIZE;
		count --;
	}
	pthread_exit(0);
}
int main(int argc, char** argv){
	pthread_t t1,t2;
	pthread_attr_t attr;
	pthread_attr_init(&attr);
	pthread_create(&t1, &attr, producer, NULL);
	pthread_create(&t2,&attr,consumer,NULL);
	pthread_join(t1,NULL);
	pthread_join(t2,NULL);
	return 0;
}
