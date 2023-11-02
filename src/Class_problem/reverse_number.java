package Class_problem;
import java.util.Scanner;
public class reverse_number {

	public static void main(String[] args) {
		int num,remaider,result;
		Scanner n1= new Scanner(System.in);
		System.out.print("enter the number");
		num=n1.nextInt();
		result=0;
		while(num>0) {
			remaider=num%10;
			result=result*10+remaider;
			num=num/10;
		}System.out.print("reverse of the number"+result);

	}

}
