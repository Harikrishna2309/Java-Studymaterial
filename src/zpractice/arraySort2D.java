package zpractice;
import java.util.*;
public class arraySort2D {

	public static void main(String[] args) {
		int m,n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter rows m");
		m=s1.nextInt();
		System.out.println("enter column n");
		n=s1.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("enter the elements");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s1.nextInt();
			}
		}
		System.out.println("input 2D array");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				int min=arr[i][j];
				for(int x=i;x<m;x++) {
					for(int y=j;y<n;y++) {
						if(arr[x][y]<min) {
							min=arr[x][y];
							arr[x][y]=arr[i][j];
							arr[i][j]=min;
						}
					}
				}
				
			   }
			}
		
		System.out.println("sorted 2D array");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
