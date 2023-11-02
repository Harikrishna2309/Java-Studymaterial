package regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class eg_2 {

	public static void main(String[] args) {
		String n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the pattern ");
		n=s1.nextLine();
		Pattern pattern=Pattern.compile("javaTraining",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(n);
		boolean matchfound=matcher.find();
		if(matchfound) {
			System.out.println("match found");
		}
		else {
			System.out.println("match not found");
		}
		

	}

}
