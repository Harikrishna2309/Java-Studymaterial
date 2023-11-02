package Assignment_2;
import java.util.Scanner;
public class stringpalindrome {

	public static void main(String[] args) {
		String string;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string");
		string=s1.next();
		String reverse=new StringBuffer(string).reverse().toString();
		if(string.equalsIgnoreCase(reverse)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		

	}

}
