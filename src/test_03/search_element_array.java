package test_03;

import java.util.Scanner;

public class search_element_array {
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
		System.out.println("enter the element you want to find ");
		int elem=s1.nextInt();
		int srch=1;
		int temp=0;
		for(int i=0;i<n;i++) {
			if(elem==arr[i]) {
				srch=i;
				temp=1;
				System.out.println("position of the element is: "+(i+1));
			}
		}if(temp==0) {
			System.out.println("element is not there");
		}

	}

}
