package Assessment;
import java.util.Scanner;
public class spy_number {

	public static void main(String[] args) {
		int num,sum,product,split;
		split=0;
	    sum=0;
	    product=1;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number");
		num=s.nextInt();
		while(num>0) {
			split=num%10;
			sum=sum+split;
			product=product*split;
			num=num/10;
			
		}if(sum==product) {
			System.out.print("it is a spy number");

	} else {
		System.out.print("it is not a spy number");
	}
		
	}

}
