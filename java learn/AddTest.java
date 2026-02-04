class AddTest{
        public int add(int n){
                if(n==0) return 0;
		if(n==1) return 1;
                return n+add(n-1);
        }
}
