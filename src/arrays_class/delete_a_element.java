package arrays_class;

import java.util.Scanner;

public class delete_a_element {
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
		System.out.println("enter the element to delete ");
		int elem=s1.nextInt();
		int del=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]==elem) {
				del=i+1;
			}
		}while(del<n) {
			arr[del-1]=arr[del];
			del++;
		}
		System.out.println("after deletion");
		printarray(arr,n-1);

	}

}
