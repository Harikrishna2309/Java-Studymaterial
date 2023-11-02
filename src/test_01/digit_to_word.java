package test_01;
import java.util.Scanner;
public class digit_to_word {

	public static void main(String[] args) {
		int n,split=0,result,remaider;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number");
		n=s1.nextInt();
		result=0;
		while(n>0) {
			remaider=n%10;
			result=result*10+remaider;
			n=n/10;
		}
		while (result>0) {
			split=result%10;
			if(split==0) {
				System.out.print("zero ");
			}else if(split==1) {
				System.out.print("one ");
			}else if(split==2) {
				System.out.print("two ");
			}else if(split==3) {
				System.out.print("three ");
			}else if(split==4) {
				System.out.print("four ");
			}else if(split==5) {
				System.out.print("five ");
			}else if(split==6) {
				System.out.print("six ");
			}else if(split==7) {
				System.out.print("seven ");
			}else if(split==8) {
				System.out.print("eight ");
			}else {
				System.out.print("nine ");
			}result=result/10;
			
		}
	}

}
