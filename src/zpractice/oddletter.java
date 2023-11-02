package zpractice;
import java.util.*;
public class oddletter {

	public static void main(String[] args) {
		String s;
		Scanner s1=new Scanner(System.in);
		s=s1.nextLine();
		int n=s.length();
		char arr[][]=new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					arr[i][j]=s.charAt(i);
				}
				if(i+j==n-1) {
					arr[i][j]=s.charAt(n-1-i);
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			   }
			System.out.println();
			}
		

	}

}
