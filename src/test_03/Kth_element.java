package test_03;

import java.util.Scanner;

public class Kth_element {
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
		System.out.println();
		System.out.println("enter the K th position you want to check: ");
		int k=s1.nextInt();
		if(k<n) {
		System.out.println("number: "+arr[k-1]);
		}
		else {
			System.out.println("enter the correct position");
		}

	}

}
