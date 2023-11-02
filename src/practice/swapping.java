package practice;
import java.util.Scanner; 
public class swapping {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("a= ");
		int a=s1.nextInt();
		System.out.print("b= ");
		int b=s1.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b= "+b);
	}

}
