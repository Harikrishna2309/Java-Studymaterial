package regex;
import java.util.regex.*;
public class password_check {
	public static boolean isvalidpassword(String password) {
		String regex="^(?=.*[0-9])"+
					 "(?=.*[a-z])(?=.*[A-Z])"+
					 "(?=.*[!+-"
					 + "@#$%^&])"+
					 "(?=\\S+$).{8,20}$";
		Pattern p=Pattern.compile(regex);
		if(password==null) {
			return false;
		}
		Matcher m=p.matcher(password) ;
		return m.matches();		
	}

	public static void main(String[] args) {
		String str1="pass@Portal20";
		System.out.println(isvalidpassword(str1));
		String str2="passwordcheck";
		System.out.println(isvalidpassword(str2));
		String str3="Hari@23#9";
		System.out.println(isvalidpassword(str3));

	}

}

