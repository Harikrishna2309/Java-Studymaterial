package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class example1 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("abb");
		Matcher m=p.matcher("aabbabbabbaaa");
		while(m.find()) {
			System.out.println("start: "+m.start()+" end:"+m.end()+" group:"+m.group());
		}

	}

}
