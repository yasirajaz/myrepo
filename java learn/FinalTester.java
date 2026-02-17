class FinalTester{
	public static void main(String[] args){
		FinalDemo fd= new FinalDemo(5);
		System.out.println(fd.x);
		//fd.x=6; variable h to update bhi nahi hoga kyuki final h
		//System.out.prinln(fd.x);
		fd.display();
	}
}
