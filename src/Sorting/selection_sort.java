package Sorting;

import java.util.Scanner;

public class selection_sort {
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
		int temp=arr[0];
		for(int step=0;step<n-1;step++) {
			int min_index=step;
			for(int i=step+1;i<n;i++) {
				if(arr[min_index]>arr[i]) {
					min_index=i;
				}
			}
			temp=arr[step];
			arr[step]=arr[min_index];
			arr[min_index]=temp;
		}
		printarray(arr,n);

	}

}
