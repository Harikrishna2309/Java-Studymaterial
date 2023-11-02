package Assignment_2;
import java.util.*;
public class parenthesismatching {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Stack<Integer>stk=new Stack<Integer>();
		System.out.println("parenthesis matching test\n");
		System.out.println("enter expression");
		String exp=scan.next();
		int len=exp.length();
		System.out.println("\nmatches and mismatches:\n");
		for(int i=0;i<len;i++) {
			char ch=exp.charAt(i);
			if(ch=='(')
				stk.push(i);
			else if(ch==')')
			{
				try
				{
					int p=stk.pop()+1;
					System.out.println("')' at position "+(i+1)+"  matches with "+"'(' at position "+p);
				}
				catch(Exception e)
				{
					System.out.println("')' at position "+(i+1)+" is unmatched");
				}
			}
		}
		while(!stk.isEmpty())
			System.out.println("'(' at position "+(stk.pop()+1)+" is unmatched");

	}

}
