package test_03;

import java.util.Scanner;

public class matrix_addition {

	public static void main(String[] args) {
		int r1,r2,c1,c2;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter no. of rows in matrix A : ");
		r1=s1.nextInt();
		System.out.println("Enter no. of columns in matrix A : ");
		c1=s1.nextInt();
		int[][] a=new int[r1][c1];
		System.out.println("Enter no. of rows in matrix B : ");
		r2=s1.nextInt();
		System.out.println("Enter no. of columns in matrix B : ");
		c2=s1.nextInt();
		int[][] b=new int[r2][c2];
		if(r1==r2 && c1==c2) {
		System.out.println("Enter elements of the Matrix A : ");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				a[i][j]=s1.nextInt();
			}
		}
		System.out.println("Enter elements of the Matrix B : ");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				b[i][j]=s1.nextInt();
			}
		}
		System.out.println("Elements of the Matrix A: ");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			}
		
		System.out.println("Elements of the Matrix B: ");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
			}
		int result[][]=new int[r1][c1];
		System.out.println("Addition of Two Matrices : ");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				result[i][j]=(a[i][j] + b[i][j]);
				System.out.print( result[i][j] +" ");
			}
			System.out.println();
			}
		}else {
			System.out.println("invalid matrix addition form");
		}
	}
}