#include<pthread.h>
#include<stdio.h>
#define NUM_THREADS 5
void* runner(void*);
int main(int argc, char** argv){
        int i, scope;
        pthread_t tid[NUM_THREADS];
        pthread_attr_t attr;
        pthread_attr_init(&attr);
        if (pthread_attr_getscope(&attr, &scope) != 0){
                printf("Unable to get scoped∖n");
        }else{
                if (scope == PTHREAD_SCOPE_PROCESS){
                        printf("PTHREAD_SCOPE_PROCESS\n");
                }else if (scope == PTHREAD_SCOPE_SYSTEM){
                        printf("PTHREAD_SCOPE_SYSTEM\n");
                }else{
                        printf("Illegal scope value.∖n");
                }
        }
        pthread_attr_setscope(&attr, PTHREAD_SCOPE_SYSTEM);
        for (i = 0; i < NUM_THREADS; i++) pthread_create(&tid[i],&attr,runner,NULL);
        for (i = 0; i < NUM_THREADS; i++) pthread_join(tid[i], NULL);
        return 0;
}
void* runner(void* param) {
        printf("Hello by thread\n");
        pthread_exit(0);
}

