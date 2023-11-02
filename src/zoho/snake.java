package zoho;
import java.util.Scanner;
public class snake {

	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("input");
		n=s1.nextInt();
		int y=n;
		int x=(2*n)-1;
		int num;
		for(int i=0;i<n;i++) {
			num=n;
			for(int j=0;j<y-1;j++) {
				System.out.print("  ");
			}
			y--;
			for(int z=y;z<x;z++) {
				while(num>0) {
				System.out.print(num--+" ");
				}
			}
			System.out.println();
		}
		
		

	}

}
