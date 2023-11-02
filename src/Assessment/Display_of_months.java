package Assessment;
import java.util.Scanner;
public class Display_of_months {

	public static void main(String[] args) {
		int m;
		Scanner m1=new Scanner(System.in);
		System.out.print("enter the month:");
		m=m1.nextInt();
		if(m==1){
			System.out.print("It is january");
			
		}else if(m==2) {
			System.out.print("it is febuary");
		}else if(m==3) {
			System.out.print("it is march");
		}else if(m==4) {
			System.out.print("it is april");
		}else if(m==5) {
			System.out.print("it is may");
		}else if(m==6) {
			System.out.print("it is june");
		}else if(m==7) {
			System.out.print("it is july");
		}else if(m==8) {
			System.out.print("it is august");
		}else if(m==9) {
			System.out.print("it is september");
		}else if(m==10) {
			System.out.print("it is october");
		}else if(m==11) {
			System.out.print("it is november");
		}else if(m==12) {
			System.out.print("it is december");
		}else {
			System.out.print("invalid number");
		}

	}

}
