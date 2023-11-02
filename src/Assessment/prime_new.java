package Assessment;
import java.util.Scanner;
public class prime_new {
	public static int prime(int n) {
		int notprime=0;
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				notprime=1;
			    break;
		
			}
	    }if(notprime==0) {
	    	return n;
	    }
	    return 0;
	}

	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the total numbers: ");
		n=s1.nextInt();
		int count=0;
		int num=0;
		for(int i=2;i<(n*10);i++) {
				num=prime(i);
				if(num!=0 && count<n) {
				System.out.print(num+" ");
				count++;
				}
		}
		s1.close();

	}

}
