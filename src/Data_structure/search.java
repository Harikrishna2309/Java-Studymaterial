package Data_structure;

import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		int ele,n,pos;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the element");
		n=s1.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		System.out.println("original arr= ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}System.err.println();
		System.out.println("enter the search element");
		ele=s1.nextInt();
		int digit=0;
		 for(int i=0;i<n;i++) {
			if (arr[i]==ele) {
				System.out.println("position of the element= "+(i+1));
				digit=1;
			
			}
			
			}if(digit==0) {
				System.out.println("element not found");
				
		}
		
		
		

	}

}
