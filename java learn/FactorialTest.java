class FactorialTest{
	public int fact(int n){
		if(n==0||n==1) return 1;
		return n*fact(n-1);
	}
	int fac(int n){
		int result=1;
		for(int i=1;i<=n;i++){
			result=result*i;
		}
		return result;
	}
}
