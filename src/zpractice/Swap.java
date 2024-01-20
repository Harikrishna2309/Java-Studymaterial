package zpractice;

public class Swap {

	public static void main(String[] args) {
		int a=15,b=6;
//		a=a+b;
//		b=a-b;
//		a=a-b;
		a=a^b;
		b=a^b;
		a=a^b;
//		a=(a^b)^a;
	
		System.out.println(a);
		System.out.println(b);
		
		
		int c=a;
		a=b;
		b=c;
		
		
		System.out.println(a);
		System.out.println(b);

	}

}
