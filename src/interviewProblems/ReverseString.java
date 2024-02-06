package interviewProblems;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		String s="harikrish";
		int n=s.length();
		
		
		Stack<Character>sta=new Stack<Character>();
		
		
		for(int i=0;i<n;i++) {
			sta.push(s.charAt(i));
		}
		
		Object[] arr1=sta.toArray();
		
		for(int i=arr1.length-1;i>=0;i--) {
			System.out.print(arr1[i]);
		}
		
		
        StringBuilder reversedString = new StringBuilder();

		
		Iterator<Character>i1=sta.iterator();
		System.out.println("-------By iterator-----");
		while(i1.hasNext()) {
            reversedString.append(i1.next());
		}
        System.out.println("Reversed String: " + reversedString.toString());

		
		System.out.println("\n\n------By for each------");
		for (Character c : sta) {
	             System.out.print(c);
	         }
		
		System.out.println("\n\n----------Stack---------");
		System.out.println(sta);
		System.out.println("\n----------By pop-----------");
		for(int i=0;i<n;i++) {
			System.out.print(sta.pop());
		}

	}

}
