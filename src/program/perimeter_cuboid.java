package program;
import java.util.Scanner;
public class perimeter_cuboid {

	public static void main(String[] args) {
		int length,breath,height,perimeter,sum;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the length " );
		length=s1.nextInt();
		System.out.print("enter the height ");
		height=s1.nextInt();
		System.out.print("enter the breath ");
		breath=s1.nextInt();
		sum=length+breath+height;
		perimeter=4*sum;
		System.out.print("perimeter= "+perimeter);

	}

}
