package test_01;
import java.util.Scanner;
public class pokemon_master {

	public static void main(String[] args) {
		int a,b;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the pokeball a");
		a=s1.nextInt();
		System.out.println("enter the pokemon b");
		b=s1.nextInt();
		if(a>=1 && b<=8) {
			if(a>b) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
		else {
			System.out.println("invalid input");
		}
	}

}
