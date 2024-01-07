package zoho;
import java.util.*;
public class pattern123 {

	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the number");
		n=scan.nextInt();
		int y=2;
		int x=3;
		int num=1;
		System.out.println(num);
		for(int i=1;i<=2*n-3;i++) {
			if(i<n) {
				for(int j=0;j<i+y;j++) {
					System.out.print(num++);
				}
				System.out.println();
				y++;
				num=1;
			}else {
				for(int j=2*n-x;j>0;j--) {
					System.out.print(num++);
				}
				System.out.println();
				x=x+2;
				num=1;
			}
		}
		System.out.println(num);

	}

}
