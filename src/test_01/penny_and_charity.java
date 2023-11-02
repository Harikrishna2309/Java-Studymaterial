package test_01;
import java.util.Scanner;
public class penny_and_charity {

	public static void main(String[] args) {
		int m,n,split=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the n people");
		n=s1.nextInt();
		System.out.println("enter the m clothes");
		m=s1.nextInt();
		if(m>=1 && n<=1000) {
			if(m>n) {
				split=m/n;
				System.out.println(split);
			}else {
				System.out.println("-1");
			}
			
		}else {
			System.out.println("invalid");
		}

	}

}
