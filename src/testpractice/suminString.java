package testpractice;

import java.util.Scanner;

public class suminString {

	public static void main(String[] args) {
		String n;
		int b,sum=0;
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the string : ");
		n=s1.next();
		for(int i=0;i<n.length();i++) {
			if(Character.isDigit(n.charAt(i))) {
				b=Integer.parseInt(String.valueOf(n.charAt(i)));
				sum=sum+b;
			}
		}
		System.out.println(sum);
	}

}
