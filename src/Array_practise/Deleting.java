package Array_practise;
import java.util.*;
public class Deleting {
	
	public static int[] deleteElement(int arr[],int x) {
		int n=arr.length;
		int pos=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				pos=i;
				break;
			}
		}
		for(int i=pos;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		int[] newArray = new int[n-1];
	      System.arraycopy(arr, 0, newArray, 0, n-1);
		return newArray;
	}

	public static void main(String[] args) {
		//Sorting sort=new Sorting();
		Scanner scan=new Scanner(System.in);
		int n;
		System.out.println("size of array");
		n=scan.nextInt();
		System.out.println("enter the elements of array");
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("input array");
		Sorting.PrintArray(arr);
		System.out.println("enter element to delete");
		int x=scan.nextInt();
		arr=deleteElement(arr,x);
		Sorting.PrintArray(arr);

		

	}

}
