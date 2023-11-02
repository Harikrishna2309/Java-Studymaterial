package program;
import java.util.*;
public class stackBinary {

	public static void main(String[] args) {
		Stack<Integer>stk=new Stack<Integer>();
		int n;
		Scanner s1=new Scanner (System.in);
		System.out.println("enter the number");
		n=s1.nextInt();
		while(n!=0) {
			stk.push(n%2);
			n=n/2;
		}while(!stk.isEmpty()) {
			System.out.print(stk.pop());
		}
	}

}
