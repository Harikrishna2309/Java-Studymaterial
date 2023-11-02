package problems_13;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayleader {

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
		
		//int count=0;
		int ldr[]=new int[n];
		int z=0;
		for(int i=0;i<n-1;i++) {
			int flag=0;
			for(int j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				ldr[z]=arr[i];
				z++;
				//System.out.print(arr[i]+" ");
				//count++;
			}
		}
		//System.out.print(arr[n-1]);
		ldr[z]=arr[n-1];
		Arrays.sort(ldr);
		for(int i=0;i<z+1;i++) {
			System.out.print(ldr[i]+" ");
		}

	}

}
