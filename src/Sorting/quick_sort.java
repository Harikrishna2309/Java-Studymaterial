package Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class quick_sort {
	public static void printarray(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	class Quick{
		static int partition(int array[],int low, int high) {
			int pivot=array[high];
			int i=low;
			for(int j=low;j<high;j++) {
				if (array[j]<=pivot){
					//i++;
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
		int[]data= {8,7,2,1,0,9,6};
		System.out.println("unsorted array");
		//printarray(data,data.length);
		System.out.println(Arrays.toString(data));
		int size=data.length;
		Quick.quick(data,0, size-1);
		System.out.println("sorted array ");
		System.out.println(Arrays.toString(data));
		
	
	}

}
