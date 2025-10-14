#include<stdio.h>
void bubble_sort(int* a, int len){
	int flag=0;
	int i,j,temp;
	for(i=1;i<len;i++){
		flag=0;
		for(j=1;j<len-i+1;j++){
			if(a[j-1]>a[j]){
				flag++;
				temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
			}
		}
		if (flag==0) break;
	}
}
int main(int argc, char** argv){
	int arr[]={3,4,45,6,2,5,33,99,9};
	int length= sizeof(arr)/sizeof(arr[1]);
	int i;
	bubble_sort(arr,length);
	printf("sorted array: ");
	for (i = 0; i < length; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
	return 0;
}
