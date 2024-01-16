package zpractice;
import java.util.*;
public class OneDarraySort {

	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter size of array");
		n=s1.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		System.out.println("input array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<n;i++) {
			int min=arr[i];
			for(int j=i;j<n;j++) {
				if(arr[j]<min) {
					min=arr[j];
					arr[j]=arr[i];
					arr[i]=min;
					
				}
			}
		}
		System.out.println();
		System.out.println("sorted array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
