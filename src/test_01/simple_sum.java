package test_01;
import java.util.Scanner;
public class simple_sum {

	public static void main(String[] args) {
		int a,b,c,sum;
		Scanner s1= new Scanner(System.in);
		System.out.print("enter the numbers: ");
		a=s1.nextInt();
		b=s1.nextInt();
		c=s1.nextInt();
		sum=a+b+c;
		System.out.println(sum);

	}

}
