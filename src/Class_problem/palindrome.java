package Class_problem;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		long num,remaider,result,num1;
		Scanner n1= new Scanner(System.in);
		System.out.print("enter the number");
		num1=n1.nextLong();
		num=num1;
		result=0;
		/*for( num1=num;num!=0;num=num/10) {
			remaider=num%10;
			result=result*10+remaider;
		}
		System.out.println(result);*/
		while(num1>0) {
			remaider=num1%10;
			result=result*10+remaider;
			num1=num1/10;
		}
		if(num==result) {
			System.out.print("it is palindrome");
		}else {
			System.out.print("it is not palindrome");
		}


	}

}
