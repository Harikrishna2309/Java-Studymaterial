package test_03;

import java.util.Scanner;

public class frequency_oddeven {

	public static void main(String[] args) {
		int r,c;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter no. of rows in matrix : ");
		r=s1.nextInt();
		System.out.println("Enter no. of columns in matrix: ");
		c=s1.nextInt();
		int[][] a=new int[r][c];
		System.out.println("Enter elements of the Matrix: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s1.nextInt();
			}
		}
		System.out.println("Elements of the Matrix A: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			}
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j]%2==0) {
					evencount++;
				}else {
					oddcount++;
				}

			}
		}
		System.out.println("even count= "+evencount);
		System.out.println("odd count= "+oddcount);
	}

}
