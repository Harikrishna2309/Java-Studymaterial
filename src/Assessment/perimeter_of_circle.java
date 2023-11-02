package Assessment;
import java.util.Scanner;
public class perimeter_of_circle {

	public static void main(String[] args) {
		double num,p,perimeter;
		Scanner r=new Scanner(System.in);
		System.out.print("enter the radius; ");
		num=r.nextDouble();
		p=3.14;
		perimeter= 2*p*num;
		System.out.print("perimeter of circle: "+perimeter);
		
	}

}