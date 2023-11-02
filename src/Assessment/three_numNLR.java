package Assessment;
import java.util.Scanner;
public class three_numNLR {

	public static void main(String[] args) {
		int N,L,R;
		Scanner s1 =new Scanner(System.in);
		System.out.print("enter the N value; " );
		N=s1.nextInt();
		System.out.print("enter the L value; ");
		L=s1.nextInt();
		System.out.print("enter the R value; ");
		R=s1.nextInt();
		if((N>L) && (N<R)) {
			System.out.print("the number 'N' is between L&R");
		}else {
			System.out.print("the number 'N' is not between L&R");
		}

	}

}
