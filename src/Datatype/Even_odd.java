package Datatype;
import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		int num;
		Scanner N=new Scanner(System.in);
		System.out.print("enter the number N: ");
		num=N.nextInt();
		if(num%2==0) {
			System.out.println("even number; "+num);
		}
		else {
			System.out.println("odd number: "+num);
		}
	}

}
