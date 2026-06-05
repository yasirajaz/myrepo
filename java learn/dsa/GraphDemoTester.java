class GraphDemoTester{
	public static void main(String... args){
		GraphDemo gd=new GraphDemo(5,false);
		gd.insert(0,1);
		gd.insert(0,2);
		gd.insert(0,4);
		gd.insert(1,3);
		gd.insert(2,4);
		gd.insert(3,4);
		GraphPath gp=new GraphPath(gd,0,3);
		boolean result=gp.exists();
		System.out.println(result);
		gd.randE(gd,5);
		GraphDegree g=new GraphDegree(gd);
		for(int i=0;i < gd.V() ;i++){
			System.out.println("degree of vertx"+ i +"="+g.degree(i));
		}
	}
}
