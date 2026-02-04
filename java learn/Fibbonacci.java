class Fibbonacci{
        public int fib(int n){
                if(n==2||n==1) return 1;
                return fib(n-1)+fib(n-2);
        }
}
