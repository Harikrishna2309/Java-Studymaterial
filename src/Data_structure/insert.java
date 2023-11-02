package Data_structure;
import java.util.Scanner;
public class insert {
	public static void printarr(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		//int arr[]= {1,3,5,7,9};
		int ele,index,len,j,n;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the number of element ");
		n=s1.nextInt();
		int arr[]=new int[n+1];
		System.out.println("enter the elements ");
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		System.out.println("enter the insert element");
		ele=s1.nextInt();
		System.out.println("enter the index");
		index=s1.nextInt();
		j=n;
		System.out.println("original arr= ");
		printarr(arr,n);
		//for(int i=0;i<n;i++) {
			//System.out.print(arr[i]+" ");
		//}
	System.out.println();
		n=n+1;
		
		
		while(j>=index) {
			arr[j]=arr[j-1];
			j=j-1;
		}arr[index]=ele;
		System.out.println("inserted array= ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
