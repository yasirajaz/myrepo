class GraphTester{
	public static void main(String... args){
		MyGraph graph=new MyGraph(5);
		graph.addEdge(0,1);
		graph.addEdge(0,2);
		graph.addEdge(1,2);
		graph.addEdge(1,3);
                graph.addEdge(2,3);
                graph.addEdge(2,4);
		graph.addEdge(3,4);
		System.out.println("grapg created successfully");
	}
}
