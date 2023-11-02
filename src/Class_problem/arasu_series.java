package Class_problem;
import java.util.Scanner;
public class arasu_series {

	public static void main(String[] args) {
		int n,sum;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the total numbers");
		n=s.nextInt();
		
		for(int i=0;i<=n;i++) {
			sum=(i*i)+1;
			System.out.print(sum+" ");
		}

	}

}
