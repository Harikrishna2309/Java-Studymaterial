package test_02;

import java.util.Scanner;

public class array_rotation {

	public static void main(String[] args) {
		int m;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the number of elements");
		m=s1.nextInt();
		int arr[]=new int[m];
		System.out.println("enter the elements of array");
		for(int j=0;j<m;j++) {
			arr[j]=s1.nextInt();

		}System.out.println("elemets of array are");
		for(int z:arr) {
			
		System.out.print(z+" ");}
		System.out.println();
		int rot;
		System.out.println("enter the times by which the array to rotate ");
		rot=s1.nextInt();
		for(int r=1;r<=rot;r++) {
		int x=arr[arr.length-1];
		for( int i=m-2;i>=0;i--) {
			arr[i+1]=arr[i];
		}arr[0]=x;}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}


	}

}
