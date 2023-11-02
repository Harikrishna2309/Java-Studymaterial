package Sorting;
import java.util.Scanner;
public class bubble_sort_algorthim {
	
	static void bubblesort(int a[],int n) {
		int temp;
		for(int step=0;step<n-1;step++) {
			for(int i=0;i<n-1;i++) {
				if(a[i]>a[i+1]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
	
	}
	static void printarray(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the number of elements: ");
		n=s1.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements ");
		for(int i=0;i<n;i++) {
			a[i]=s1.nextInt();
		}
		bubblesort(a,n);
		System.out.println("elements after bubblesort");
		printarray(a,n);

	}

}
