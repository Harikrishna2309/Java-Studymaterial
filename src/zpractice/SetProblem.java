package zpractice;
import java.util.*;
public class SetProblem {

	public static void main(String[] args) {
		HashSet<Character>h1=new HashSet<Character>();
		int n=112;
		String x=String.valueOf(n);
		char[]digit=String.valueOf(x).toCharArray();
		for(char c:digit) {
			if(h1.add(c)) {
				System.out.println("added="+c);
			}
			else {
				System.out.println("duplicate digit="+c);
			}

		}
		System.out.println(x+12);
		
	}

}
