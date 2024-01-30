package zpractice;
import java.util.*;
public class SetProblem {

	public static void main(String[] args) {
		HashSet<Character>h1=new HashSet<Character>();
		int n=112;
		char[]digit=String.valueOf(n).toCharArray();
		for(char c:digit) {
			if(h1.add(c)) {
				System.out.println("added="+c);
			}
			else {
				System.out.println("duplicate="+c);
			}

		}
		System.out.println(h1);
		
	}

}
