package strings;

public class strings_1 {

	public static void main(String[] args) {
		String str="Hello world";
		String anotherstring="hello world";
		Object objstr=str;
		System.out.println(str.compareTo(anotherstring));
		System.out.println(str.compareToIgnoreCase(anotherstring));
		System.out.println(str.compareTo(objstr.toString()));
		String s1="google";
		String s2="google";
		String s3=new String("google");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		String h1="Hello world ,Hello Reader ";
		int lastIndex=h1.lastIndexOf("Hello");
		if(lastIndex==-1) {
			System.out.println("Hello is not found");
		}else {
			System.out.println("last occurance is"+lastIndex);
			
		}

	}

}
