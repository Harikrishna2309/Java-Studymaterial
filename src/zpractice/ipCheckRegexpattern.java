package zpractice;
import java.util.*;
import java.util.regex.*;


class MyRegex {
    // The regular expression pattern for validating an IP address
   private String pattern = "^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\." +
                     "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\." +
                     "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\." +
                     "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$";

public String getPattern() {
	return pattern;
}

public void setPattern(String pattern) {
	this.pattern = pattern;
}
}
class patt extends MyRegex{
	String regexpat =getPattern();
	//this.pattern=regexpat;
}

public class ipCheckRegexpattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();

        System.out.println("Enter an IP address:");
        String ipAddress = scanner.nextLine();

        if (ipAddress.matches(myRegex.getPattern())) {
            System.out.println("Valid IP Address");
        } else {
            System.out.println("Invalid IP Address");
        }
	}

}
