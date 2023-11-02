package program;
import java.util.Scanner;
public class long_to_bite {

	public static void main(String[] args) {
		long a;
		byte b;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the long value: ");
		a=s1.nextLong();
		b=(byte)a;
		System.out.println("convertion to byte: "+b);
	}

}
