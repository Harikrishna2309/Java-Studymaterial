package test_01;
import java.util.Scanner;
public class shinchan_and_kazama {

	public static void main(String[] args) {
		int a,b,s,dis,time;
		Scanner s1=new Scanner(System.in);
		System.out.print("a= ");
		a=s1.nextInt();
		System.out.print("b= ");
		b=s1.nextInt();
		System.out.print("s= ");
		s=s1.nextInt();
		dis=a-b;
		time=dis/s;
		System.out.println(time);
		}

}
