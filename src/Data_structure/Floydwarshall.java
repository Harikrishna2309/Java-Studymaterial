package Data_structure;

public class Floydwarshall {
	final static int inf=99999,nv=4;
	void floydwarshall(int graph[][]) {
		int matrix[][]=new int [nv][nv];
		int i,j,k;
		for(i=0;i<nv;i++) {
			for(j=0;j<nv;j++) {
				matrix[i][j]=graph[i][j];
			}
		}
		for(k=0;k<nv;k++) {
			for(i=0;i<nv;i++) {
				for(j=0;j<nv;j++) {
					if(matrix[i][k]+matrix[k][j]<matrix[i][j])
						matrix[i][j]=matrix[i][k]+matrix[k][j];
				}
			}
		}
		printmatrix(matrix);
	}
	void printmatrix(int matrix[][]) {
		for(int i=0;i<nv;++i) {
			for(int j=0;j<nv;++j) {
				if(matrix[i][j]==inf)
					System.out.print("inf ");
				else 
					System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int graph[][]= {{0,3,inf,5},
				        {2,0,inf,4},
				        {inf,1,0,inf},
				        {inf,inf,2,0}};
		Floydwarshall a= new Floydwarshall();
		a.floydwarshall(graph);
				        
	
		

	}

}
