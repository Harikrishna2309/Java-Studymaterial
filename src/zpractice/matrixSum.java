package zpractice;
import java.util.*;
public class matrixSum {

	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		int sum1=0,sum2=0;
		Scanner s1=new Scanner (System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=s1.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
					System.out.print(arr[i][j]+" ");
					sum1=sum1+arr[i][j];
				}else if(i+j==2) {
					System.out.print(arr[i][j]+" ");
					sum2=sum2+arr[i][j];
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println(sum1);
		System.out.println(sum2);
		

	}

}
