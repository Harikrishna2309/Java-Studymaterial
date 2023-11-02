package Class_problem;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact,num;
		fact=1;
		Scanner n1=new Scanner(System.in);
		System.out.print("enter the number: ");
		num=n1.nextInt();
		for(int i=num;i>0;i--) {
			fact=fact*i;
		}System.out.print("factorial is; "+fact); //System.out.printf("factorial is %d,fact);

	}

}
