package Assessment;
import java.util.Scanner;
public class sum_ofSeries {

	public static void main(String[] args) {
		int n;
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the length ");
		n=s1.nextInt();
		float sum=1;
		float j=11;
		for(int i=0;i<n;i++) {
			sum=sum+(1/j);
			System.out.print("1/"+j+" ");
			j+=10;
		}
		System.out.println("sum of the series: "+sum);

	}

}
