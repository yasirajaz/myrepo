class GraphDegree{
	private GraphDemo g;
	private int[] deg;
	GraphDegree(GraphDemo g){
		this.g=g;
		deg=new int[g.V()];
		for(int i=0;i<g.V();i++){
			AdjList a=g.getAdjList(i);
			for(int j=a.beg();!a.end();j=a.nxt()){
				deg[i]++;
			}
		}
	}
	int degree(int i){
		return deg[i];
	}
}
