package problems_13;

import java.util.Scanner;

public class largestinArray {

	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the size of array ");
		n=s1.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("maximum value is: "+max);

	}

}
