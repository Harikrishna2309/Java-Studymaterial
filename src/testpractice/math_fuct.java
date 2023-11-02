package testpractice;

import java.util.Scanner;

public class math_fuct {

	public static void main(String[] args) {
		double d1;
		double d2;
		Scanner s1= new Scanner(System.in);
		d1=s1.nextDouble();
		d2=s1.nextDouble();
		System.out.println("ceiling of"+ d1+" ="+ Math.ceil(d1));
		System.out.println("floor of"+d1+"="+Math.floor(d1));
	}

}
