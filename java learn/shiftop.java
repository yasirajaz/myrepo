class shiftop{
	public static void main(String[] args){
		byte x=-10;
		byte a=(byte) (x<<1);
		byte b=(byte) (x<<4);
		byte c=(byte) (x<<3);
		System.out.println(a+" "+b+" "+c);
		byte y=-10;
                byte d=(byte) (y>>>1);
                byte e=(byte) (y>>>2);
                byte f=(byte) (y>>>8);
                System.out.println(d+" "+e+" "+f);

	}
}
