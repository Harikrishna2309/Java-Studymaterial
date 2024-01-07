package zoho;
import java.util.Scanner;
public class snake {

	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("input");
		n=s1.nextInt();
		int y=n-1;
		int x=(2*n)-1;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<y;j++) {
				System.out.print("  ");
			}
			y--;
			for(int z=n;z>0;z--) {
				System.out.print(z+" ");
			}
			System.out.println();
		}
		
		

	}

}
