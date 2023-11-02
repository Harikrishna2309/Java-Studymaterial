package problems_13;

import java.util.Scanner;

public class localmaxima {

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
		for(int i=0;i<n;i++) {
				if(i==0&&arr[i]>arr[i+1]) {
					System.out.println("local maximum is "+arr[i]);
				break;
			}
				if(i==(n-1)&&arr[i]>arr[i-1]) {
					System.out.println("local maximum is "+arr[i]);
					break;
				}
			
			if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]) {
				System.out.println("local maximum is "+arr[i]);
				break;
			}
		}

	}

}
