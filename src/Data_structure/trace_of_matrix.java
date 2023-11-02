package Data_structure;

public class trace_of_matrix {

	public static void main(String[] args) {
		int rows=2;
		int columns=2;
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{10,20},{30,40}};
		int result[][]= new int[2][2];
		int trace=0;		
		System.out.println("Elements of Matrix A : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Elements of Matrix B : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Addition of Two Matrices : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				result[i][j]=(a[i][j] + b[i][j]);
				System.out.print( result[i][j] +" ");
			}
			System.out.println();
		}System.out.print("trace of matrix : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(i==j){
				trace=trace+a[i][j]+b[i][j];
				}
		

	}
		}System.out.println(trace);
		
	}
}
