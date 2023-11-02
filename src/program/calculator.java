package program;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		double first,second,result;
		result=1;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter first number ;");
		first=s1.nextDouble();
		System.out.print("enter second number ;"
				+ "");
		second=s1.nextDouble();
		System.out.print("enter an operator(+,-,*,/)");
		char operator=s1.next().charAt(0);
		switch(operator) {
		case'+':
			result=first+second;
			break;
		case'-':
			result=first-second;
			break;
		case'*':
			result=first*second;
			break;
		case'/':
			result=first/second;
			break;
		default:
			System.out.println("error operator is not correct");
		}System.out.printf("%.1f %c %.1f=%.1f",first,operator,second,result );
		
		
		

	}

}
