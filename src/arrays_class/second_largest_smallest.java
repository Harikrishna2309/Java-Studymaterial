package arrays_class;
import java.util.Scanner;
public class second_largest_smallest {
	public static void printarray(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter  the number of elements");
		n=s1.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements ");
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		System.out.println("input array: ");
		printarray(arr,n);
		int temp=arr[0];
		for(int step=0;step<n;step++) {
			for(int i=0;i<n-step-1;i++) {
				if(arr[i]<arr[i+1]) {
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
			}
		}System.out.println();
		System.out.println("second largest= "+arr[1]);
		System.out.println("smallest number= "+arr[n-1]);

	}

}
