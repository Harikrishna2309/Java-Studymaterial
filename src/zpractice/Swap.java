package zpractice;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
//		int a=15,b=6;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		a=(a^b)^a;
	
//		System.out.println(a);
//		System.out.println(b);
//		
//		
//		int c=a;
//		a=b;
//		b=c;
		
		
//		System.out.println(a);
//		System.out.println(b);
		String s="hari krish";
		String []x=(s.split("\\ "));
		System.out.println(Arrays.toString(x));
		for(String i:x) {
			System.out.println(i);
		}
		StringBuffer s1= new StringBuffer(s);
		System.out.println(s1);
		s1.append(" M");
		System.out.println(s1);

	}

}
