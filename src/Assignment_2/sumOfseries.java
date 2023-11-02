package Assignment_2;
import java.util.Scanner; 
public class sumOfseries {

	public static void main(String[] args) {
		// 1/1+>1/4+1/9
		int n;
		Scanner s1=new Scanner (System.in);
		System.out.println("enter the size");
		n=s1.nextInt();
		float sum=0;
		//float j=1;
		for(float i=1;i<=n;i++) {
			sum=sum+(1/(i*i));
			System.out.printf("1/%.0f",i*i);
			System.out.print("+");
			
			
		}
		System.out.printf("\nsum of the series is: %.2f",sum);
	
	}

}
