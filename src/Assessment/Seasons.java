package Assessment;
import java.util.Scanner;
public class Seasons {

	public static void main(String[] args) {
		int m;
		Scanner m1=new Scanner(System.in);
		System.out.print("enter the month: " );
		m=m1.nextInt();
		if(m==1|m==2) {
			System.out.print("It is summer");
		}else if(m==3|m==4) {
			System.out.print("it is summer");
		}else if(m==5|m==6) {
			System.out.print("It is rainy");
		}else if(m==7|m==8){
			System.out.print("it is rainy");
		}else if (m==9|m==10) {
			System.out.print("it is winter");
		}else if(m==11|m==12) {
			System.out.print("It is winter");
		}else {
			System.out.print("invalid month");
		}
		
	}
}