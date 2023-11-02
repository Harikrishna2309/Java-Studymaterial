package Collections;
import java.util.*;
public class stack_eg1 {

	public static void main(String[] args) {
		Stack<Integer>s1=new Stack<>();
		boolean result=s1.empty();
		System.out.println("is stack is empty? "+result);
		
		s1.push(78);
		s1.push(113);
		s1.push(90);
		s1.push(23);
		s1.add(34);
		s1.pop();
		System.out.println("elements in the stack: "+s1);
		result=s1.empty();
		System.out.println("is stack is empty: "+result);
	}

}
