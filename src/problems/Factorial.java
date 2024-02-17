package problems;
import java.util.*;
public class Factorial {
private static int fact(int n) {
	if(n>1) {
		return n*fact(n-1);
	}
	else {
		return n;
	}
}
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the input");
		int n=s1.nextInt();
		int ans=fact(n);
		System.out.println("answer= "+ans);

	}

}
