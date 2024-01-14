package zpractice;
import java.util.*;

public class collection_practise {

	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner (System.in);
		System.out.println("enter the number");
		n=s1.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
