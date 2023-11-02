package test_02;

import java.util.Scanner;

public class insert_an_element {

	public static void main(String[] args) {
		int ele,index,j,n;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the element you want in array");
		n=s1.nextInt();
		int arr[]=new int[n+1];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		
		System.out.println("enter the position where you want to insert element");
		index=s1.nextInt();
		index=index-1;
		System.out.println("enter the element you want to insert");
		ele=s1.nextInt();
		j=n;
		System.out.println("original arr= ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		n=n+1;
		while(j>=index) {
			arr[j]=arr[j-1];
			j=j-1;
		}arr[index]=ele;
		System.out.println("after inserting= ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
