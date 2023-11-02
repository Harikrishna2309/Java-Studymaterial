package Assignment_2;

import java.util.Scanner;
import java.util.Stack;

public class count1inbinary {

	public static void main(String[] args) {
		Stack<Integer>stk=new Stack<Integer>();
		int n;
		Scanner s1=new Scanner (System.in);
		System.out.println("enter the number");
		n=s1.nextInt();
		int count=0;
		while(n!=0) {
			stk.push(n%2);
			if(n%2==1) {
				count++;
			}
			n=n/2;
		}
	System.out.println(count);

	}

}
