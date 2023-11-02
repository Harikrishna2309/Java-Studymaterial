package testpractice;

import java.util.Scanner;

public class stringreverse {
	public static  String reversestring(String str) {
		char ch[]=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];
		}
		return rev;
	}
	
	public static void main(String[] args) {
		String n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string: ");
		n=s1.next();
		System.out.println(reversestring(n));
		

	}

}
