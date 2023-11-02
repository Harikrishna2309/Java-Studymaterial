package Assessment;
import java.util.Scanner;
public class natural_number {

	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number: ");
		n=s1.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}

	}

}
