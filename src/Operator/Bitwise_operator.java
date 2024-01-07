package Operator;

public class Bitwise_operator {

	public static void main(String[] args) {
		int a=160;
		int b=13;
		int c=0;
		c=a&b;
		System.out.println("a&b="+c);
		c=a|b;
		System.out.println("a|b="+c);
		c=a^b;
		System.out.println("a^b="+c);
		c=~a;
		System.out.println("~a="+c);
		c=a>>2;
		System.out.println("a>>"+c);
		c=a<<2;
		System.out.println("a<<="+c);
		c=a>>>2;
		System.out.println("a>>>="+c);
		System.out.println(Integer.toBinaryString(c));
		//System.out.print(a&b);
	}

}
