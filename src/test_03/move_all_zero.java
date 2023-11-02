package test_03;

import java.util.Scanner;

public class move_all_zero {
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
			if(arr[i]==0) {
				count++;
			}
		}
		int h=count;
	int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr1[h]=arr[i];
				h=h+1;
			}
		}for(int i=0;i<count;i++) {
			arr1[i]=0;
		}
		printarray(arr1,n);

	}

}
