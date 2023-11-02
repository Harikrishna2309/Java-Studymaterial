package test_03;

import java.util.Scanner;

public class sum_product_matrix {

	public static void main(String[] args) {
		int r;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter order of matrix : ");
		r=s1.nextInt();
		int[][] a=new int[r][r];
		System.out.println("Enter elements of the Matrix: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<r;j++) {
				a[i][j]=s1.nextInt();
			}
		}System.out.println(" sum "+" product");
		int sum=0;
		int product=1;
		for(int i=0;i<r;i++) {
			for(int j=0;j<r;j++) {
				sum=sum+a[i][j];
				product=product*a[i][j];
				System.out.println(sum+"   "+product);
			}
		}
	}
}
