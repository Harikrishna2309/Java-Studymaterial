package testpractice;

import java.util.Scanner;

public class mutate_array {
	public static void changearray(int a[],int n) {
		a[n]=a[n-1]+a[n]+a[n+1];	
	}
	public static void changearray0(int a[],int n) {
		a[n]=a[n]+a[n+1];
	}
	public static void changearrayn(int a[],int n) {
		a[n]=a[n]+a[n-1];
	}
	public static void printarray(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}System.out.println();
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
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				if(i==0) {
					changearray0(arr,i);
				}
				else if(i==n-1) {
					changearrayn(arr,i);
					
				}
				else {
					changearray(arr,i);	
				}
				
			}
		}
		System.out.println("output array:");
		printarray(arr,n);
		

	}

}
