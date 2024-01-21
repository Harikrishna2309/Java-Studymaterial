package zpractice;
import java.util.Scanner;
public class AddTwoWithoutplus {

	public static void main(String[] args) {
		int a,b;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number to add");
		a=s1.nextInt();
		b=s1.nextInt();
		for(int i=0;i<b;i++) {
			a++;
		}
		System.out.println(a);

	}

}
