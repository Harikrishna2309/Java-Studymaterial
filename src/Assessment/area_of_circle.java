package Assessment;
import java.util.Scanner;

public class area_of_circle {

	public static void main(String[] args) {
		double num;
		double area,p;
		Scanner r1=new Scanner(System.in);
		System.out.print("enter the radius: ");
		num=r1.nextFloat();
		p=3.14;
		area= p*num*num;
		System.out.printf("area of the circle: %.2f",area);
	
	}

}
