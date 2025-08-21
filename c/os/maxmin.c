#include<stdio.h>
#include<pthread.h>
#include<stdlib.h>
int arr[] = {5, 2, 7, 15, 28, 9, 3,132,234,5465,214,46,21,54,67,68854,54,342,54,23254};
int size = sizeof(arr)/sizeof(arr[0]);
int maxim;
int minim;
void* maximum(void* args) {
	int size=*((int*)args);
	int max=arr[0];
	int i;
	for (i=0;i<size;i++) {
		if (arr[i]>max) {
			max= arr[i];
		}
	}
	maxim=max;
	pthread_exit(0);
}
void* minimum(void* args){
	int size=*((int*)args);
	int min= arr[0];
	int i;
	for (i=0;i<size; i++){
		if (arr[i]<min){
			min=arr[i];
		}
	}
	minim=min;
	pthread_exit(0);
}
int main(int argc, char** argv){
	pthread_t t1,t2;
	pthread_attr_t attr1,attr2;
        pthread_attr_init(&attr1);
	pthread_attr_init(&attr2);
	pthread_create(&t1,&attr1, maximum,&size);
	pthread_create(&t2,&attr2, minimum,&size);
	pthread_join(t1,NULL);
	pthread_join(t2,NULL);
	printf("maximum in array for t1 is %d\n",maxim);
	printf("minimum in array for t2 is %d\n",minim);
	return 0;
}
