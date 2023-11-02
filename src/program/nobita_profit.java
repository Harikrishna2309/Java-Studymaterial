package program;
import java.util.Scanner;
public class nobita_profit {

	public static void main(String[] args) {
		int val1,val2,result;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value 1" );
		val1=s1.nextInt();
		System.out.println("enter the value 2");
		val2=s1.nextInt();
		System.out.print("profit"+Math.abs(val1-val2));
		
		

	}

}
