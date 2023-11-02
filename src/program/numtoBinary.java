package program;
import java.util.Scanner;
public class numtoBinary {

	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number: ");
		n=s1.nextInt();
		int result=0;
		int count=0;
		
		while(n!=0) {
			result=n%2;
			n=n/2;
			System.out.print(result);
			count++;
		}
		int binary[]=new int[count+2];
		while(n!=0) {
			result=n%2;
			n=n/2;
		for(int i=0;i<count;i++) {
			binary[i]=result;
			break;
		}
		}
		System.out.println();
		for(int i=count;i>0;i--) {
			System.out.print(binary[i]);
		}
		
	}

}
