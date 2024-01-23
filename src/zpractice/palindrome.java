package zpractice;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		String s;
		ArrayList<Character> arr=new ArrayList<Character>();
		Scanner s1=new Scanner(System.in);
		StringBuilder s2=new StringBuilder();
		System.out.println("enter the input string");
		s=s1.nextLine();
		s=s.replaceAll("\\s", "");
		for(int i=0;i<s.length();i++) {
			arr.add(s.charAt(i));
		}
		for(int i=s.length()-1;i>=0;i--) {
			s2.append(arr.get(i));
		}
//		System.out.println("input String= "+s);
//		System.out.println(s2);
		if(s.equals(s2.toString())) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
