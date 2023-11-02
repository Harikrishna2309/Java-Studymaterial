package Assessment;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int num,f1,f2,f3,i;
		Scanner n1=new Scanner(System.in);
		System.out.print("enter the total number to generate: ");
		num=n1.nextInt();
		f1=0;f2=1;
		System.out.print(f1+" "+f2);
		for(i=3;i<=num;i++) {
			f3=f2+f1;
			f1=f2;
			f2=f3;
			System.out.print(" "+f3);
		}

	}

}
