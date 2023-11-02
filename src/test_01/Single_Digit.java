package test_01;
import java.util.Scanner;

public class Single_Digit {
	int n1;
	static int split;
	  static int add=0;
	  
	static int splitnum(int n1) {
		add=0;
	while(n1>0) {
		split=n1%10;
		add=add+split;
		n1=n1/10;
		
	}//System.out.println(add);
	return add;
 }

	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the n value");
		n=s1.nextInt();
	    n=splitnum(n);
		if(n>9) {
			splitnum(n);
			if(splitnum(n)<10) {
				System.out.println(splitnum(n));
			}
		}
		

	}

}
