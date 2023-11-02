package problems_13;
import java.util.Scanner;
public class elementoccurance {

	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the size of array ");
		n=s1.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		System.out.println("enter the element to search ");
		int ele=s1.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			if(ele==arr[i]) {
				count++;
			}
		}
		System.out.println("number of occurance: "+count);

	}

}
