package arrays_class;

import java.util.Scanner;

public class array_3 {

	public static void main(String[] args) {
		int arr[]= {0,0,0,0,0};
		Scanner s=new Scanner(System.in);
		System.out.print("enter the array elements; ");
		for(int i=0;i<5;i++) {
			arr[i]=s.nextInt();
			
		}System.out.print("array elements are; ");
        for (int a:arr) {
        	System.out.print(" "+a);
        }
	}

}
