package regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Eg4 {

	public static void main(String[] args) {
		String s;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string");
		s=s1.nextLine();
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher(s);
		boolean b=m.matches();
		System.out.println(b);
		boolean b2=Pattern.compile("\\d*").matcher(s).matches();
		System.out.println(b2);
		boolean b3=Pattern.matches("\\D+",s);
		System.out.println(b3);
		

	}

}
