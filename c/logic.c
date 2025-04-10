#include<stdio.h>
int main(){
	int x=10,y=20,z=30;
//	int result=(++x<++y)&&(++y<++z);
	int result=(++x<++y)||(++y<++z); // second statement ko evaluate nii krega skip ho jaega 
//sort circuitting ki wajah se or m agr 1st true h to true hoga and and me 1st false h to false hi hoga dusere ko evaluate nahi krega

	printf("result=%d\n",result);
	printf("x=%d\ty=%d\tz=%d\n",x,y,z);
	return 0;
}
