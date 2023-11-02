package Collections;
import java.util.*;
public class stack_eg2 {
	static void pushelemnt(Stack<Integer>s1,int x) {
		s1.push(x);
		System.out.println("push---"+x);
		System.out.println("stack: "+s1);
	}
	static void popelemnt(Stack<Integer>s1) {
		if(s1.isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
		System.out.print("pop---");
		Integer x=(Integer)s1.pop();
		System.out.println(x);
		System.out.println("stack: "+s1);
		}
	}

	public static void main(String[] args) {
		Stack<Integer>s1=new Stack<Integer>();
		System.out.println("stack: "+s1);
		//try {
			popelemnt(s1);
		/*}
		catch(EmptyStackException e) {
			System.out.println("empty stack");
		}*/
		pushelemnt(s1,10);
		pushelemnt(s1,12);
		pushelemnt(s1,23);
		pushelemnt(s1,9);
		pushelemnt(s1,2000);
		pushelemnt(s1,1012);
		pushelemnt(s1,2309);
		
		popelemnt(s1);
		popelemnt(s1);
		popelemnt(s1);
		popelemnt(s1);
		
		System.out.println("peek element: "+s1.peek());
		int loc=s1.search(10);
		System.out.println("search from top: "+loc);

	}

}
