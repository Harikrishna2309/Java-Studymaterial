package zpractice;
import java.util.*;
import java.util.regex.*;


class MyRegex {
    // The regular expression pattern for validating an IP address
    String pattern = "^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\." +
                     "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\." +
                     "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\." +
                     "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$";
}

public class ipCheckRegexpattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();

        System.out.println("Enter an IP address:");
        String ipAddress = scanner.nextLine();

        if (ipAddress.matches(myRegex.pattern)) {
            System.out.println("Valid IP Address");
        } else {
            System.out.println("Invalid IP Address");
        }
	}

}
