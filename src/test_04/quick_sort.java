package test_04;
import java.util.*;
public class quick_sort {
	public static void printarray(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}System.out.println();
	}
	class Quick{
		static int partition(int array[],int low, int high) {
			int pivot=array[high];
			int i=low;
			for(int j=low;j<high;j++) {
				if (array[j]<=pivot) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					i++;
				}
			}
			int temp=array[i];
			array[i]=array[high];
			array[high]=temp;
			return(i);
		}
		static void quick(int array[],int low,int high) {
			if(low<high) {
				int pi=partition(array,low,high);
				quick(array,low,pi-1);
				quick(array,pi+1,high);
			}
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the no of elements ");
		n=s1.nextInt();
		int arr[]=new int [n];
		System.out.println("enter the elements ");
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		System.out.println("input:");
		printarray(arr,n);
		Quick.quick(arr,0, n-1);
		System.out.println("output: ");
		printarray(arr,n);
		s1.close();

	}

}
