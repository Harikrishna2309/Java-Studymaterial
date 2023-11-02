package Datatype;
import java.util.Scanner;

public class Add {
	public static void main(String[]args) {
		//int Num1;
		//int Num2;
		//int result;
		int Num1,Num2,result;
		Scanner S= new Scanner(System.in);
		//Num1=10;
		//Num2=20;
		System.out.print("Enter the first number: ");
		Num1=S.nextInt();
		System.out.print("Enter the second number: ");
		Num2=S.nextInt();
		result= Num1+Num2;
		System.out.println("adding two numbers: "+result);
	}

}