package zoho;
import java.util.*;
public class pattern {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int n;
		System.out.println("input");
		n=s1.nextInt();
		
		for(int i=1;i<=n;i++) {
			int k=i;
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k=k+n-j;
			
				
			}
			System.out.println();
		}
		
	      
	}

}
