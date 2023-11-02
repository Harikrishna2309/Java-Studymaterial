package Matrix;

public class addition {

	public static void main(String[] args) {
		int rows=3;
		int columns=3;
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int result[][]= {{0,0,0},
						 {0,0,0},
						 {0,0,0}};
				
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
		}
	



	}

}
