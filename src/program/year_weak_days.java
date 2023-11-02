package program;
import java.util.Scanner;
public class year_weak_days {

	public static void main(String[] args) {
		int input,year = 0,days=0,week=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number of days");
		input=s1.nextInt();
		if(input>=365) {
		year=input/365;
		System.out.print(year+" year ");
		input=input%365;
		}
		if(input>7) {
			 week=input/7;
			 System.out.print(week+" week ");
			 input=input%7;
			 }
	    if(input>0) {
				 days=input;
				 System.out.println(days+" days ");
				 }
		 System.out.println();
		 System.out.println(year+" year "+week+" weeks "+days+" days ");
	}

}
