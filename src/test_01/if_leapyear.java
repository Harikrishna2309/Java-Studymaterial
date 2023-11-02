package test_01;
import java.util.Scanner;
public class if_leapyear {

	public static void main(String[] args) {
		int year;
		Scanner s1=new Scanner(System.in);
	    System.out.println("enter the year");
	    year=s1.nextInt();
	    if(year%4==0) {
	    	System.out.println("yes");
	    }else {
	    	System.out.println("no");
	    }
		

	}

}
