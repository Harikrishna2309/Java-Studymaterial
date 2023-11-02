package program;

import java.util.Scanner;

public class nonrepeatinArray {
	public static void printarray(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
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
		int flag =0,count=0;
		for(int i=0;i<n;i++) {
		   flag=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j] && i!=j){
					flag=1;
				}
			}if(flag==0) {
				System.out.println(arr[i]);
				count++;
			}
	
		}
		if(count==0) {
			System.out.println("no");
		}

	}

}
