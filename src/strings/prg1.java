package strings;

public class prg1 {

	public static void main(String[] args) {
		String str1;
		String str2=new String();
		String str3=new String("welcome");
		String str4;
		str1="india";
		str2="japan";
		str3="hari";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		str4="today is monday and yesterday is sunday";
		System.out.println(str4.length());
		System.out.println("hari".length());
		System.out.println(str4.charAt(4));
		System.out.println("india".equals("INDIA"));
		System.out.println("india".equalsIgnoreCase("INDIA"));
		System.out.println(str4.substring(8));
		System.out.println(str4.substring(8,15));
		System.out.println(str4.concat(str2));
		System.out.println(str4.replace('a','*'));
		System.out.println(str4.toUpperCase());
		String str5=" hello ";
		System.out.println(str5);
		System.out.println(str5.trim());
		

	}

}
