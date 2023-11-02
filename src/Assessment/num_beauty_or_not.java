package Assessment;
import java.util.Scanner;
public class num_beauty_or_not {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter num of elements ");
		n=s1.nextInt();
		int arr[]=new int[n];
		System.out.print("enter the arr num ");
		for (int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}if(sum%2==0 && sum%3==0 && sum%5==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}

	}

}
