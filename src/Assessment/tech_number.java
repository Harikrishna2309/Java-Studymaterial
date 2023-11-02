package Assessment;
import java.util.Scanner;
public class tech_number {

	public static void main(String[] args) {
		int num,split,split2,sum,result;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the four digit num");
		num=s.nextInt();
		result=0;
		if(num>999 && num<10000) {
			split=num%100;
		    split2=num/100;
		    sum=split+split2;
		    result=sum*sum;
		    if(num==result) {
				System.out.print("it is tech number");
				
			}else {
				System.out.print("it is not a tech number");
			}
		}else {
			System.out.print("enter valid num");
		}
		

	}

}
