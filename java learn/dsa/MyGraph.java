import java.util.*;
class MyGraph{
	private List<Integer>[] g;
	public MyGraph(int v){
		g= (ArrayList<Integer>[])new ArrayList[v];
		for(int i=0;i<v;i++){
			g[i]=new ArrayList<>();
		}
	}
	public void addEdge(int v5,int v6){
		g[v5].add(v6);
		g[v6].add(v5);
	}
}
