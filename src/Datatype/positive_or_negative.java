package Datatype;
import java.util.Scanner;

public class positive_or_negative {

	public static void main(String[] args) {
		int num;
		Scanner n1=new Scanner(System.in);
		System.out.print("enter the number");
		num=n1.nextInt();
		if(num>0) {
			System.out.println("positive number: "+num);
		}
		else if (num<0) { 
			System.out.println("negative number:"+num);
		}else {
			System.out.println("number is zero :"+num);
		}
	}

}
