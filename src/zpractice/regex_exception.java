package zpractice;
import java.util.*;
import java.util.regex.*;

public class regex_exception {

	public static void main(String[] args) {
		
		String pattern="[AZ][a-z](a-z)";
		try {
            Pattern.compile(pattern);
            System.out.println("Valid");
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid");
            System.out.println(e);
        }

	}

}
