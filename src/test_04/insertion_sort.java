package test_04;

import java.util.Scanner;

public class insertion_sort {
	public static void printarray(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}System.out.println();
	}


	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the no of elements ");
		n=s1.nextInt();
		int arr[]=new int [n];
		System.out.println("enter the elements ");
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		System.out.println("input:");
		printarray(arr,n);
		int temp=arr[0];
		int key;
		for(int step=1;step<n;step++) {
		key=step;
		for(int j=step-1;j>=0;j--) {
			if(arr[j]>arr[key]) {
				temp=arr[j];
				arr[j]=arr[key];
				arr[key]=temp;
				key--;
			}
		}
	}
		System.out.println("output");
		printarray(arr,n);
		s1.close();

	}

}
