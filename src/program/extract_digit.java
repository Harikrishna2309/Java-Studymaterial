package program;
import java.util.Scanner;
public class extract_digit {

	public static void main(String[] args) {
		int n,m,count=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number");
		n=s1.nextInt();
		m=n;
		while(n>0) {
			n=n/10;
			count++;
		}
		while(m>0) {
			int a=m%10;
			System.out.println("digit at position "+count+":"+a);
			m=m/10;
			count--;
		}

	}

}
