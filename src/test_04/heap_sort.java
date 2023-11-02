package test_04;

import java.util.Scanner;

public class heap_sort {
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
		int temp=arr[n-1];
		
		for(int step=n-1;step>0;step--) {
			
			int max_index=step;	
			for(int i=step-1;i>=0;i--) {
				if(arr[max_index]<arr[i]) {
					max_index=i;
				}
			}
			temp=arr[step];
			arr[step]=arr[max_index];
			arr[max_index]=temp;
		}
		System.out.println("output");
		printarray(arr,n);
		s1.close();

	}

}
