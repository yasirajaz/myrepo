#include<stdio.h>
int main(){
	int a[]={-8,-2,-3,-4,-5};
	int len = sizeof(a)/sizeof (a[0]);
	int b=a[0];
	int c=a[0];
	for(int i=0;i<len;i++){
		if(a[i]>b){
			c=b;
			b=a[i];
		}else if(a[i]>c){
			c=a[i];
		}
	}
	printf("maximum element in array =%d\n",b);
	printf("second max=%d\n",c);
	return 0;
}
