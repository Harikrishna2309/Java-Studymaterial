package problems_13;

import java.util.Scanner;

public class secondlargeSmall {

	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter  the number of elements");
		n=s1.nextInt();
		if(n>1) {
		int arr[]=new int[n];
		System.out.println("enter the elements ");
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		int temp=arr[0];
		for(int step=0;step<n;step++) {
			for(int i=0;i<n-step-1;i++) {
				if(arr[i]<arr[i+1]) {
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
			}
		}for(int i=0;i<n;i++) {
			if(arr[i]!=arr[i+1]) {
				System.out.println("second largest= "+arr[i+1]);
				break;
			}
			
		}
		System.out.println("smallest number= "+arr[n-1]);
		}else {
			System.out.println("enter minimum 2 elements");
		}

	}

}
