package problems_13;
import java.util.Scanner;

public class Bitposition {

	public static void main(String[] args) {
		int n;
		String x="";
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the decimal num");
		n=s1.nextInt();
		while(n>0) {
			int a=n%2;
			x=a+x;
			n=n/2;
		}
		System.out.println(x);
		System.out.println("enter the position you want to check");
		int pos=s1.nextInt();
		if(x.charAt(pos-1)=='1') {
			System.out.println("1 is present at given position");
		}
		else {
			System.out.println("0 is present at given position");
		}

	}

}
