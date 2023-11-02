package Assessment;
import java.util.Scanner;

public class Generation_Prime {
	static int number=2,count;
	static int isprime(int number1) {
		for(int j=2;j<=number1/2;j++) {
			if(number1%j==0) {
				number1++;
				isprime(number1);
			}
		}
		if(count==0) {
			System.out.print(number1+" ");
			count++;
		}
		return number1;
	}
	static void primenumber(int num) {
		count=0;
		if(num==0)
			return;
		else {
			if (number==2) {
				System.out.print(number+" ");
				number++;
			}
			else {
				number=isprime(number);
				number++;
			}
		}
		primenumber(--num);
			

			}
			
		
		
	
	public static void main(String ar[]) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the length: ");
		int n=s.nextInt();
	
			primenumber(n);
		
		
	}

}
