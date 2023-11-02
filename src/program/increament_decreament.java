package program;
import java.util.Scanner;
public class increament_decreament {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner s=new  Scanner(System.in);
		System.out.println("enter the value");
		a=s.nextInt();
		b=++a;
		System.out.println("pre increament a: "+a);
		System.out.println("after pre increament b: "+b);
		c=a++;
		System.out.println("pre increament a: "+a);
		System.out.println("after increament c: "+c);
		d=--a;
	}
	

}
