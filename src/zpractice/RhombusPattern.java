package zpractice;
import java.util.Scanner;

public class RhombusPattern {

	public static void main(String[] args) {
		int num;
		Scanner s1= new Scanner(System.in);
		System.out.println("input");
		num=s1.nextInt();
		int x=2*num;
		int y=num;
		for(int i=0;i<num;i++) {
			for(int j=0;j<x-i;j++) {
				if(j<y) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			y--;
			System.out.println();
		}
		

	}

}
