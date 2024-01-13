package zpractice;
import java.util.Scanner;
public class pattern_diamond {

	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
		int n;
		System.out.println("enter the number");
		n=s1.nextInt();
		int x=n/2;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				for(int j=0;j<x;j++) {
					System.out.print(" ");
				}
				x--;
				for(int j=0;j<i;j++) {
					 System.out.print("*");
				}
				
				System.out.println();
			}
			
		}
		int y=1;
		for(int i=n-1;i>0;i--) {
			if(i%2!=0) {
				for(int j=0;j<y;j++) {
					System.out.print(" ");
				}
				y++;
				for(int j=0;j<i;j++) {
					 System.out.print("*");
				}

				System.out.println();
			}
			
		}

	}

}
