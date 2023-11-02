package Assessment;
import java.util.Scanner;
public class peterson_number {

	public static void main(String[] args) {
		int num,split,fact,sum,num1;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number" );
		num=s.nextInt();
		num1=num;
		fact=1;
		sum=0;
		while(num>0) {
			fact=1;
			split=num%10;
			System.out.println(split);
			for(int i=split;i>0;i--) {
				fact=fact*i;
				}
				sum=sum+fact;
				System.out.println(fact);
				System.out.println(sum);
		
		num=num/10;
			
		}if(num1==sum) {
			System.out.print("it is peterson number");
		}else {
			System.out.print("it is not a peterson number");
		}

	}

}
