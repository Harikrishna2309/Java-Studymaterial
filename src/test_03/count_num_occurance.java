package test_03;

import java.util.Scanner;

public class count_num_occurance {
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
		System.out.println("enter the element which you want to count : ");
		int k=s1.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==k) {
				count++;
			}
		}if(count>0) {
			System.out.println("number of occurance is: "+count);
		}else {
			System.out.println("no occurance");
		}

	}

}
