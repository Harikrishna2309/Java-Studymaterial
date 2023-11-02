package program;
import java.util.Scanner;
public class integer_to_byte {

	public static void main(String[] args) {
		int a;
		byte b;
		char c;
		float d;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter any integer: ");
		a=s1.nextInt();
		b=(byte)a;
		System.out.println("convertion into byte: "+b);
		c=(char)a;
		System.out.println("convertion into char: "+c);
		d=a;
		System.out.println("convertion into float: "+d);

	}

}
