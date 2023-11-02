package Sorting;

import java.util.Scanner;

public class bubble_decending {

	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the no of elements ");
		n=s1.nextInt();
		int a[]=new int [n];
		System.out.println("enter the elements ");
		for(int i=0;i<n;i++) {
			a[i]=s1.nextInt();
		}System.out.println("before sorting");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		int temp=a[0];
		for(int step=0;step<n;step++) {
			for(int i=0;i<n-step-1;i++) {
				if(a[i]<a[i+1]) {
					temp=a[i+1];
					a[i+1]=a[i];
					a[i]=temp;
				}
			}
		}System.out.println();
		System.out.println("after sorting");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
