package zpractice;
import java.util.*;
public class TrianglePatter {
	public static void main(String[]args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number");
		n=s1.nextInt();
		for(int i=0;i<n;i++) {
			if(i==0) {
				for(int j=n-1;j>=i;j--) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
			else if(i!=0 && i!=n-1) {
				for(int j=n-1;j>=i;j--) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=0;j<i;j++) {
					if(j>0) {
						System.out.print("  ");
					}
					else {
						System.out.print(" ");
					}
					
				}
				System.out.print("*");
				System.out.println();
			}
			else {
				for(int j=0;j<i+1;j++) {
					System.out.print(" *");
				}
			}
			
		}
	}

}
