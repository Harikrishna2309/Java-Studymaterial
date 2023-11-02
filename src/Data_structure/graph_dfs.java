package Data_structure;

import java.util.LinkedList;
import java.util.Stack;

public class graph_dfs {
	int v;
	LinkedList<Integer>[]adj;
	@SuppressWarnings("unchecked")
	graph_dfs(int v){
		this.v=v;
		adj=new LinkedList[v];
		for(int i=0;i<adj.length;i++)
			adj[i]=new LinkedList<Integer>();
		
	}
	void addedge(int v,int w) {
		adj[v].add(w);
	}
	void dfs(int n) {
		boolean nodes[]=new boolean[v];
		Stack<Integer>stack=new Stack<>();
		stack.push(n);
		int a=0;
		while(!stack.empty()) {
			n=stack.peek();
			stack.pop();
			if(nodes[n]==false) {
				System.out.print(n+" ");
				nodes[n]=true;
			}
			for(int i=0;i<adj[n].size();i++) {
				a=adj[n].get(i);
				if(!nodes[a]) {
					stack.push(a);
				}
			  }

		}
	}

	public static void main(String[] args) {
	      graph_dfs g=new graph_dfs(6);
	      g.addedge(0, 1);
	      g.addedge(0, 2);
	      g.addedge(1, 0);
	      g.addedge(1, 3);
	      g.addedge(2, 0);
	      g.addedge(2, 3);
	      g.addedge(3, 4);
	      g.addedge(3, 5);
	     // g.addedge(4, 3);
	     // g.addedge(5, 3);
		
	      System.out.println("following is the depth first traversal");
	      g.dfs(0);

	}

}
