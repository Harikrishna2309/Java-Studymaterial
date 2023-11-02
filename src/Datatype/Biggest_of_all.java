package Datatype;

import java.util.Scanner;

public class Biggest_of_all {

	public static void main(String[] args) {
		double num1,num2,num3;
		Scanner S =new Scanner(System.in);
		System.out.print("enter the number 1:  ");
	    num1=S.nextDouble();
		System.out.print("enter the number 2: ");
		num2=S.nextDouble();
		System.out.print("enter the number 3: ");
		num3=S.nextDouble();
		if(num1>num2 && num1>num3) {
			System.out.print("Number 1 is biggest");
		}
		else if (num2>num1 && num2>num3) {
			System.out.print("Number 2 is biggest");
		}
		else {
			System.out.print("number 3 is biggest");
		}
	}

}
