package Assessment;
import java.util.Scanner;
public class neon_number {

	public static void main(String[] args) {
		int num,square,split,sum;
		Scanner s= new Scanner(System.in);
		System.out.print("enter the number");
		num=s.nextInt();
		split=0;
		sum=0;
		square=num*num;
		while(square>0) {
			split=square%10;
			sum=sum+split;
			square=square/10;
		}if(num==sum) {
			System.out.print("it is a neon number");
		}else {
			System.out.print("it is not a neon number");
		}

	}

}
