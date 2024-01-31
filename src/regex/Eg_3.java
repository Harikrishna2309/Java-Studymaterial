package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Eg_3 {

	public static void main(String[] args) {
		String line="this order was placed for QT3000*!OK?12";
		Pattern pattern=Pattern.compile("(.*?)(\\d+)(.*)");
		Matcher matcher=pattern.matcher(line);
		while(matcher.find()) {
			System.out.println("group1: "+matcher.group(1));
			System.out.println("group2: "+matcher.group(3));
			System.out.println("group3: "+matcher.group(2));
		}

	}

}
