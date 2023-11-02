package Data_structure;
import java.util.*;
public class undirected_graph {
	private int v;
	private LinkedList<Integer>adj[];
	@SuppressWarnings("unchecked")
	undirected_graph(int v){
		this.v=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i]=new LinkedList<Integer>();
	}
	void addedge(int v,int w) {
		adj[v].add(w);
		adj[w].add(v);
	}
	boolean iscyclicutil(int v,boolean visited[],int parent) {
		visited[v]=true;
		Integer i;
		Iterator<Integer>it=adj[v].iterator();
		while(it.hasNext()) {
			i=it.next();
			if(!visited[i]) {
				if(iscyclicutil(i,visited,v))
					return true;
			}
			else if(i!=parent)
				return true;
		}
		return false;
	}
	boolean iscyclic() {
		boolean visited[]=new boolean[v];
		for(int i=0;i<v;i++)
			visited[i]=false;
		for (int u=0;u<v;u++) {
			if(!visited[u])
				if(iscyclicutil(u,visited,-1))
					return true;
		}
		return false;
	}

	public static void main(String[] args) {
		undirected_graph graph=new undirected_graph(5);
		graph.addedge(1, 0);
		graph.addedge(0, 2);
		graph.addedge(2, 1);
		graph.addedge(0, 3);
		graph.addedge(3, 4);
		
		if(graph.iscyclic()) {
			System.out.println("graph contains cycle");
		}
		else {
			System.out.println("graph doesn't contain cycle");
		}
		
		

	}

}
