package Assignment_2;
import java.util.Scanner;
public class NextgreatestArray {

	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number of elements in array: ");
		n=s1.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		int flag=0;
		for(int i=0;i<n;i++) {
			if(i==n-1) {
				System.out.println(arr[i]+"=>-1");
			}
			for(int j=i+1;j<n;j++) {
				if(arr[j]>arr[i]) {
					System.out.println(arr[i]+"=>"+arr[j]);
					flag=1;
					break;
				}
				
				
			}
			if(flag==0) {
				System.out.println(arr[i]+"=>-1");
			}
			flag=0;
		}
		

	}

}
