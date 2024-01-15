package zpractice;
import java.util.*;
public class PatternX {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int n;
		System.out.println("input");
		n=s1.nextInt();
		int x=n-1;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if((j==i || j==x) && i!=x) {
					System.out.print("*");
				}
				
				else if(j==i && j==x){
					System.out.print("$");
				}
				else {
					System.out.print(" ");
				}
				
			}
			x--;
			System.out.println();
		}

	}

}
