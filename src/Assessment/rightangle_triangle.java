package Assessment;
import java.util.Scanner;
public class rightangle_triangle {

	public static void main(String[] args) {
		int length,height,hypotenuse,sum1,sum2,result;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the length");
		length=s1.nextInt();
		System.out.print("enter the height");
		height=s1.nextInt();
		System.out.print("enter the hypotenuse");
		hypotenuse=s1.nextInt();
		length=length*length;
		height=height*height;
		sum1=length+height;
		sum2=hypotenuse*hypotenuse;
		if(sum1==sum2) {
			System.out.print("it is right angle triangle");
		}else {
			System.out.print("it is not a right angle triangle");
		}
		

	}

}
