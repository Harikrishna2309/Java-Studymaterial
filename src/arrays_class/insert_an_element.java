package arrays_class;

import java.util.Scanner;

public class insert_an_element {
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
		int arr[]=new int[n+1];
		System.out.println("enter the elements ");
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		System.out.println("input array: ");
		printarray(arr,n);
		System.out.println();
		System.out.println("enter the element to insert ");
		int elem=s1.nextInt();
		System.out.println("enter the position to insert");
		int index=s1.nextInt();
		index=index-1;
		for(int i=n;i>=index;i--) {
			arr[i]=arr[i-1];
		}arr[index]=elem;
		printarray(arr,n+1);

	}

}
