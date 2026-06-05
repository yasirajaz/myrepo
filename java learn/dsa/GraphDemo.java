class GraphDemo{
	private int Vcnt,Ecnt;
	private boolean digraph;
	private class Node{
		int v;
		Node next;
		Node(int x,Node t){
			v=x;
			next=t;
		}
	}
	private Node[] adj;
	GraphDemo(int V,boolean flag){
		Vcnt=V;
		Ecnt=0;
		digraph=flag;
		adj=new Node[V];
	}
	int V(){
		return Vcnt;
	}
	int E(){
		return Ecnt;
	}
	boolean directed(){
		return digraph;
	}
	void insert(int v,int w){
		adj[v]=new Node(w,adj[v]);
		if(!digraph){
			adj[w]=new Node(v,adj[w]);
		}
		Ecnt++;
	}
	AdjList getAdjList(int v){
		return new AdjLinkedList(v);
	}
	private class AdjLinkedList implements AdjList{
		private int v;
		private Node t;
		AdjLinkedList(int v){
			this.v=v;
			t=null;
		}
		public int beg(){
			t=adj[v];
			return t==null?-1:t.v;
		}
		public int nxt(){
			if(t!=null) t=t.next;
			return t==null?-1:t.v;
		}
		public boolean end(){
			return t==null;
		}
	}
	void randE(GraphDemo g,int e){
                for(int i=0;i<e;i++){
                        int v=(int)(g.V()*Math.random());
                        int w=(int)(g.V()*Math.random());
			g.insert(v,w);
		}
	}
}
