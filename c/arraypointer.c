#include<stdio.h>
int main(){
	int a[]={1,2,3,4,5};//a[] behaves like aptr but not a ptr
	printf("%d\n",*(a+4));
	printf("%d\n",2[a]);//agr hum a++ kre to nahi hoga kyuki a++ represent r vlue(value at location) but ptr is l value
	return 0;
}
