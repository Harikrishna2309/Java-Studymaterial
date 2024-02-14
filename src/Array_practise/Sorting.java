package Array_practise;
import java.util.*;
public class Sorting {
	public static void PrintArray(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void sortArray(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int min=arr[i];
			for(int j=i+1;j<n;j++) {
				if(min>arr[j]) {
					min=arr[j];
					arr[j]=arr[i];
					arr[i]=min;
				}
			}
		}
		System.out.println("sorted array");
		PrintArray(arr);
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n;
		System.out.println("enter the size of the array ");
		n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("input array");
		PrintArray(arr);
		sortArray(arr);

	}

}
