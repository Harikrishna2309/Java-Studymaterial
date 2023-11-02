package Class_problem;
import java.util.*;
public class shipping_problem {
	public static int check(int minsum,int arr[],int n) {
		int sum2=arr[0];
		int x=1;
		find:
		for(int i=0;i<n;i++) {
			if(sum2<=minsum) {
				sum2=sum2+arr[i];
			}else {
				i--;
				x++;
				//System.out.println(i);
				sum2=arr[i];
				continue find;
				
			}
		}
		return x;
	}

	public static void main(String[] args) {
		int n,d;
		Scanner s1=new Scanner(System.in);
		n=s1.nextInt();
		d=s1.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		int minsum=sum/d;
		int x;
		int sum2=0;
		x=check(minsum,arr,n);
		
		//System.out.println(minsum);
		//System.out.println(x);
		
		while(x>=d) {
			minsum++;
			x=check(minsum,arr,n);
			System.out.println("x="+x);
		}
		System.out.println(minsum);
		

	}

}
