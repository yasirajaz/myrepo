#include<stdio.h>
#include<limits.h>
#include<stdlib.h>
int* find_max_crossing_subarray(int* a,int low,int mid,int high){
	int* result=(int*)calloc(3,sizeof(int));
	int lsum=-INT_MAX;
	int rsum=-INT_MAX;
	int sum=0,i,j,mleft,mright;
	for(i=mid;i>=low;i--){
		sum +=a[i];
		if(sum>lsum){
			lsum=sum;
			mleft=i;
		}
	}
	sum=0;
	for(j=mid+1;j<=high;j++){
		sum +=a[j];
		if(sum>rsum){
			rsum=sum;
			mright=j;
		}
	}
	result[0]=mleft;
	result[1]=mright;
	result[2]=lsum+rsum;
	return result;
}
int* find_max_subarray(int* a,int low,int high){
	int* result=(int*)calloc(3,sizeof(int));
	if(high==low){
		result[0]=low;
		result[1]=high;
		result[2]=a[low];
		return result;
	}else{
		int mid=(low+high)/2;
		int* dl = find_max_subarray(a, low, mid);
		int* dr = find_max_subarray(a, mid + 1, high);
		int* c = find_max_crossing_subarray(a, low, mid, high);
		if (dl[2] >= dr[2] && dl[2] >= c[2]) return dl;
		else if (dr[2] >= dl[2] && dr[2] >= c[2]) return dr;
		else return c;
	}
}
void printarray(int*a, int n){
        int i;
        for(i=0;i<n;i++){
                printf("%d ",a[i]);
        }
        printf("\n");
}

int main() {
	int a[] = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
	int n = sizeof(a) / sizeof(a[0]);
	printf("given array: ");
	printarray(a,n);
	int* res = find_max_subarray(a, 0, n - 1);
	printf("Maximum subarray from index %d to %d with sum = %d\n", res[0], res[1], res[2]);
	free(res);
	return 0;
}
l
