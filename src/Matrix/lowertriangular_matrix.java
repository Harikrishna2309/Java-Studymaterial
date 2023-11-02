package Matrix;

import java.util.Scanner;

public class lowertriangular_matrix {

	public static void main(String[] args) {
		int count=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no. of rows : ");
		int rows=scn.nextInt();
		System.out.println("Enter no. of columns : ");
		int columns=scn.nextInt();
		if(rows==columns) {
		int[][] a=new int[rows][columns];
		System.out.println("Enter elements of the Matrix : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				a[i][j]=scn.nextInt();
			}
		}System.out.println("Elements of the Matrix : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}for(int i=0;i<rows-2;i++) {
			for(int j=i+1;j<rows;j++) {
				if(a[i][j]!=0) {
					count=1;
				}
				
			}
		}if(count==1){
			System.out.println("no");
		
		}
			else {
				System.out.println("yes");
		}
		}else {
			System.out.println("mismatch row and columns");
		}

	}

}
