package test_03;

import java.util.Scanner;

public class array_increasing_orNot {
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
		int count=0;
		for(int i=0;i<n;i++) {
			for (int j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
					count=0;
				}else {
					count=1;
				}
				
			}
		}
		if(count==1) {
			System.out.println("array is not strictly increasing");
		}else {
			System.out.println("array is strictly increasing");
		}

	}

}
