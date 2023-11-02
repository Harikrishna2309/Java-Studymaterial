package Assessment;
import java.util.Scanner;

public class buzz_number {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number");
		num=s.nextInt();
		if (num%7==0) {
		System.out.print("it is a buzz number");
		}else if(num%10==7) {
			System.out.print("it is a buzz number");
		}else {
			System.out.print("it is not a buzz number");
			
		}

	}

}
