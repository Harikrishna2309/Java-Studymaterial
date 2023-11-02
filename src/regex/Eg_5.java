package regex;
import java.util.regex.*;
import java.util.Scanner;
public class Eg_5 {

	public static void main(String[] args) {
		String s;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string ");
		s=s1.nextLine();
		System.out.println(Pattern.matches("[a-zA-Z0-9]{2,12}", s));
		

	}

}
