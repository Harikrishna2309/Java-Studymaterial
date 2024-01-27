package zpractice;
import java.util.*;
import java.io.*;
public class ReverseString {

	public static void main(String[] args) {
		String input;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string to reverse");
		input=s1.nextLine();
		input=input.replaceAll("\\s","");
		int num=input.length();
		Stack <Character> stack=new Stack<Character>();
		for(int i=0;i<num;i++) {
			stack.push(input.charAt(i));
		}
		for(int i=0;i<num;i++) {
			System.out.print(stack.pop()+" ");
		}
		System.out.println();
		
		Queue <Character> q1=new ArrayDeque <Character>();
		for(int i=0;i<num;i++) {
			q1.add(input.charAt(i));
		}
		//System.out.println(q1.poll());
		Iterator <Character>i1=q1.iterator();
		System.out.println("by arrayqueue");
		while(i1.hasNext()) {
			System.out.print(i1.next()+" ");
		}
		System.out.println();
		Queue <Character> q2=new PriorityQueue <Character>();
		for(int i=0;i<num;i++) {
			q2.add(input.charAt(i));
		}
		//System.out.println(q1.poll());
		Iterator <Character>i2=q2.iterator();
		System.out.println("by priorityqueue");
		while(i2.hasNext()) {
			System.out.print(i2.next()+" ");
		}
		System.out.println();
		
		System.out.println("by array list");
		
		ArrayList<Character>array=new ArrayList<Character>();
		for(int i=0;i<num;i++) {
			array.add(input.charAt(i));
		}
		for(int i=num-1;i>=0;i--) {
			System.out.print(array.get(i)+" ");
		}
		System.out.println("size= "+array.size());
		System.out.println();
		System.out.println("by array");
		char arr[]=new char[num];
		for(int i=0;i<num;i++) {
			arr[i]=input.charAt(i);
		}
		
		for(int i=num-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	
	}

}
