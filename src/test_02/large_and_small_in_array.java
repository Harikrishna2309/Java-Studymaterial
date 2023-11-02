package test_02;

import java.util.Scanner;

public class large_and_small_in_array {

	public static void main(String[] args) {
		int m,large,small;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the number of elements");
		m=s1.nextInt();
		int arr[]=new int[m];
		System.out.println("enter the elements of array");
		for(int j=0;j<m;j++) {
			arr[j]=s1.nextInt();

		}for(int z:arr) {
			
		System.out.print(z+" ");}
		System.out.println();
		large=arr[0];
		small=arr[0];
		for (int i=0;i<m;i++) {
			if(arr[i]>large) {
				large=arr[i];
			}
		}	System.out.println("maximum value: "+large);
		for (int i=0;i<m;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}	System.out.println("minimum value: "+small);
		
	}

}
