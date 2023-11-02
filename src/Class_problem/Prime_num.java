package Class_problem;
import java.util.Scanner;
public class Prime_num {

	public static void main(String[] args) {
		int num,notprime=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number;");
		num=s.nextInt();
		for(int i=2;i<num;i++) {
			if (num%i==0) {
				notprime=1;
				
				
			    break;
		
			}
		 
		}if(notprime==1) {
			System.out.print("not a prime number");
		}else {
			System.out.print("prime number");
		}
	}

}
