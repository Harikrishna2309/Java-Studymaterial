package Data_structure;

public class adjacency_matrix {
	private boolean adjmatrix[][];
	private int numvertices;
	public adjacency_matrix(int numvertices) {
		this.numvertices=numvertices;
		adjmatrix=new boolean[numvertices][numvertices];
		
	}
	public void addEdge(int i,int j) {
		adjmatrix[i][j]=true;
		adjmatrix[j][i]=true;
	}
	public void removeEdge(int i,int j) {
		adjmatrix[i][j]=false;
		adjmatrix[j][i]=false;
	}
	public String toString() {
		StringBuilder s=new StringBuilder();
		for(int i=0;i<numvertices;i++) {
			s.append(i+": ");
			for(boolean j:adjmatrix[i]) {
				s.append((j ? 1:0)+" ");
				
			}
			s.append("\n");
		}
		return s.toString();
	}
	public static void main(String[]args) {
		/*adjacency_matrix g=new adjacency_matrix(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		System.out.print(g.toString());*/
		adjacency_matrix g=new adjacency_matrix(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		System.out.print(g.toString());
	}

}
