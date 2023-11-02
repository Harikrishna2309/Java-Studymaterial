package test_04;
import java.util.*;
public class stack {
	static void pushelement(Stack<Integer>s1,int x) {
		s1.push(x);
		//System.out.println("stack: "+s1);
	}
	static void popelement(Stack<Integer>s1) {
		if(s1.isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
		
		Integer x=(Integer)s1.pop();
		
		}
	}

	public static void main(String[] args) {
		int n;
		Stack<Integer>s1=new Stack <Integer>();
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size");
		n=s.nextInt();
		
		System.out.println("eneter num of elements to push");
		int num_push=s.nextInt();
		System.out.println("enter the element to push");
		for(int i=0;i<num_push;i++) {
		pushelement(s1,s.nextInt());
		}
		System.out.println("enter number of times to pop");
		int num_pop=s.nextInt();
		for(int i=0;i<num_pop;i++) {
		popelement(s1);
		}
		
		boolean result=s1.empty();
		System.out.println("is stack is empty? "+result);
		int size=(s1.size());
		if(size>n) {
			System.out.println("stack over flow");
		}else {
			System.out.println("stack underflow ");
			System.out.println("elements of the stack are: "+s1);
		}

	}

}
