package arrays_class;

import java.util.Scanner;

public class even_and_odd {
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
		int j=0,x=0;
		int evenarr[]=new int[n];
		int oddarr[]=new int[n];
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				evenarr[j]=arr[i];
				j++;
			}else {
				oddarr[x]=arr[i];
				x++;
			}
		}
		System.out.println();
		System.out.println("even array");
		printarray(evenarr,j);
		System.out.println();
		System.out.println("odd array");
		printarray(oddarr,x);

	}

}
