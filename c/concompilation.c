#include<stdio.h>
#if !__STDC__
	#include<conio.h>
#endif
int main(){
	printf("hello\n");
	#if !__STDC__
		getch();
	#endif
	return 0;
}
