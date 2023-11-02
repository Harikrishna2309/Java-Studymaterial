package program;
import java.util.Scanner;
public class count_the_number_of_bits_settoone {

	public static void main(String[] args) {
		int n,count=0;
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
		int l=x.length();
		for(int i=0;i<l;i++) {
			if(x.charAt(i)=='1') {
				count++;
			}
		}
System.out.println("no of 1's are "+count);
	}

}
