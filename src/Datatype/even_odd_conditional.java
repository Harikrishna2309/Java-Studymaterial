package Datatype;
import java.util.Scanner;

public class even_odd_conditional {

	public static void main(String[] args) {
		double num;
		String result;
		Scanner s = new Scanner(System.in);
		System.out.print("enter the number;");
		num=s.nextDouble();
		result=(num%2==0)?"even number":"odd number";
		System.out.println(result);
		//s.close();

	}

}
