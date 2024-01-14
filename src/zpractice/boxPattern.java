package zpractice;
import java.util.*;
public class boxPattern {

	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number");
		n=s1.nextInt();
		for(int i=1;i<=n;i++) {
			if(i==1 || i==n) {
				System.out.println();
				for(int j=1;j<=n;j++) {
					System.out.print("*"+" ");
				}
				
			}
			else {
				System.out.println();
				for(int j=1;j<=n;j++) {
					if(j==1 || j==n) {
						System.out.print("*"+" ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
		}

	}

}
