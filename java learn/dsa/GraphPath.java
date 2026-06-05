class GraphPath{
	private GraphDemo g;
	private boolean found;
	private boolean[] visited;
	private boolean searchR(int v,int w){
		if(v==w) return true;
		visited[v]=true;
		AdjList a=g.getAdjList(v);
		for(int i=a.beg();!a.end();i=a.nxt()){
			if(!visited[i]){
				if(searchR(i,w)) return true;
			}
		}
		return false;
	}
	GraphPath(GraphDemo g,int v,int w){
		this.g=g;
		found=false;
		visited=new boolean[g.V()];
		found=searchR(v,w);
	}
	boolean exists(){return found;}
}
