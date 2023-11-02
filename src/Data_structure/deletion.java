package Data_structure;

import java.util.Scanner;

public class deletion {

	public static void main(String[] args) {
		int j,n;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the element");
		n=s1.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		System.out.println("enter the position");
		j=s1.nextInt();
		System.out.println("original array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		while(j<n) {
			arr[j-1]=arr[j];
			j++;
		}
		n=n-1;
		System.out.println("deleted array ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
