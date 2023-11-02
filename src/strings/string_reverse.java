package strings;

public class string_reverse {

	public static void main(String[] args) {
		String string="abcdef";
		String reverse=new StringBuffer(string).reverse().toString();
		System.out.println("string before reverse "+string);
		System.out.println("string after reverse "+reverse);
		
		
		String input="abcdef";
		char[]try1=input.toCharArray();
		for (int i=try1.length-1;i>=0;i--) {
			System.out.print(try1[i]);
		}

	}

}
