package Class_problem;
import java.util.Scanner;
public class Amstrong_num {

	public static void main(String[] args) {
		int num,digit,temp,remaider,result;
		Scanner n1=new Scanner(System.in);
		System.out.print("enter the number");
		num=n1.nextInt();
		digit=0;
		temp=num;
		result=0;
		while(num>0) {
			digit++;
			num=num/10;
		}
		num=temp;
		while(num!=0) {
			remaider=num%10;
			result=(int)(result+ Math.pow(remaider,digit));
			num=num/10;
		}
		if(temp==result) {
			System.out.println("armstrong number");
			
		}else {
			System.out.println("not a armstrong number");
		}n1.close();
		
		
	}

}
