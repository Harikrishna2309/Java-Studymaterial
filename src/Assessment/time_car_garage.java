package Assessment;
import java.util.Scanner;
public class time_car_garage {

	public static void main(String[] args) {
		int n,x,a,result;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter num of cars ");
		n=s1.nextInt();
		System.out.println("enter the minutes for each car ");
		x=s1.nextInt();
		a=n-1;
		result=a*x;
		System.out.println(result+" min");
			
		

	}

}
