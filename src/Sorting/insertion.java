package Sorting;

import java.util.Scanner;

public class insertion {

	public static void main(String[] args) {
		int n,key ;
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
		//insertion sort
		int temp=a[0];
			for(int step=1;step<n;step++) {
			key=step;
			for(int j=step-1;j>=0;j--) {
				if(a[j]>a[key]) {
					temp=a[j];
					a[j]=a[key];
					a[key]=temp;
					key--;
				}
			}
		}
			//end
			System.out.println();
		System.out.println("after sorting");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
