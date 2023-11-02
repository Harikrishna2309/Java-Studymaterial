package Assessment;
import java.util.Scanner;
public class num_great_or_not {

	public static void main(String[] args) {
		int n,split,total;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		n=s.nextInt();
		int sum=0;
		int product=1;
		int num=n;
		while(n>0) {
			split=n%10;
			sum=sum+split;
			product=product*split;
			n=n/10;
		}
		total=sum+product;
		if(total==num) {
			System.out.println("great");
		}else {
			System.out.println("no");
		}

	}

}
