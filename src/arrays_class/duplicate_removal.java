package arrays_class;

import java.util.Scanner;

public class duplicate_removal {
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
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					if(j!=n-1) {
						arr[j]=arr[j+1];
					}
					n=n-1;
					j--;
				}
			}
		}
		System.out.println();
		printarray(arr,n);

	}

}
