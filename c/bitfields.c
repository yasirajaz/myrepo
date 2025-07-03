#include<stdio.h>
int main(){
	struct protocol{
		unsigned int checksum :4;
		unsigned int flags :2;
		unsigned int lenght :8;
	}tcp;
	tcp.flags=3;
	printf("%u\n",tcp.flags);
	tcp.flags=4;
	printf("%u\n",tcp.flags);
	return 0;
}
