package Array_practise;
import java.util.Scanner;
public class Searching {
	public static boolean search(int arr[],int x) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the elements of array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("input array");
		Sorting.PrintArray(arr);
		System.out.println("enter the element to search");
		int x=scan.nextInt();
		if(search(arr,x)) {
			System.out.println("element present");
		}
		else {
			System.out.println("element not present");
		}

	}

}
