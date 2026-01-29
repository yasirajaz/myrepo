class logical{
	public static void main(String[] args){
                int x=10,y=20,z=30;
                boolean b=(++x<++y)||(++y<++z);
		boolean c=(++x<++y)&&(++y>++z);
                System.out.println("the value of x is "+x);
                System.out.println("the value of y is "+y);
                System.out.println("the value of z is "+z);
                System.out.println("the value of b is "+b);
		System.out.println("the value of c is "+c);
        }
}
