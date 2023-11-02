package practice;
import java.util.Scanner;
public class Season {

	public static void main(String[] args) {
		int m;
		Scanner m1=new Scanner(System.in);
		System.out.print("Enter the month: ");
		m=m1.nextInt();
		if(m>0 && m<5) {
			System.out.print("it is summer");
		}else if (m>4 && m<9) {
			System.out.print("it is rainy");
		}else if (m>8 && m<13) {
			System.out.print("it is winter");
		}else {
			System.out.print("invalid month");
		}
		


	}

}
