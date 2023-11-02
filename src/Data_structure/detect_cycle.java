package Data_structure;
import java.util.*;
public class detect_cycle {
	private final int v;
	private final List<List<Integer>>adj;
	public detect_cycle(int v) {
		this.v=v;
		adj=new ArrayList<>(v);
		for (int i=0;i<v;i++)
			adj.add(new LinkedList<>());
	}
	
	private boolean iscyclicutil(int i,boolean[]visited,boolean[]recstack) {
		if(recstack[i])
			return true;
		if(visited[i])
			return false;
		visited[i]=true;
		recstack[i]=true;
		List<Integer>children=adj.get(i);
		for(Integer c:children) {
			if(iscyclicutil(c,visited,recstack))
				return true;
		}
		recstack[i]=false;
		return false;
	}
	private void addedge(int source,int dest) {
		adj.get(source).add(dest);
	}
	private boolean iscyclic() {
		boolean[]visited=new boolean[v];
		boolean[]recstack=new boolean[v];
		for(int i=0;i<v;i++)
			if(iscyclicutil(i,visited,recstack))
				return true;
		
		return false;
	}

	public static void main(String[] args) {
		detect_cycle graph=new detect_cycle(4);
		graph.addedge(0, 1);
		graph.addedge(0, 2);
		graph.addedge(1, 2);
		graph.addedge(2, 0);
		graph.addedge(2, 3);
		//graph.addedge(3, 3);
		
		if(graph.iscyclic()) {
			System.out.println("graph contains cycle");
		}
		else {
			System.out.println("graph doesn't contain cycle");
		}
		
		

	}

}
