package Data_structure;

import java.util.Scanner;

public class update {

	public static void main(String[] args) {
		int ele,index,n,pos;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the element");
		n=s1.nextInt();
		int arr[]=new int[n+1];
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		System.out.println("enter the update element");
		ele=s1.nextInt();
		System.out.println("enter the position to update");
		pos=s1.nextInt();
		index=pos-1;
		arr[index]=ele;
		System.out.println("updated array ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
