package Assignment_2;
import java.util.Scanner;
public class arrayunion {

	public static void main(String[] args) {
		int n1,n2;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number of elements in the array 1: " );
		n1=s1.nextInt();
		int arr1[]=new int[n1];
		System.out.println("enter the elements of array 1: ");
		for(int i=0;i<n1;i++) {
			arr1[i]=s1.nextInt();
		}
		System.out.println("enter the number of element in the array 2: ");
		n2=s1.nextInt();
		int arr2[]=new int[n2];
		System.out.println("enter the elements of array 2: ");
		for(int i=0;i<n2;i++) {
			arr2[i]=s1.nextInt();
		}
		int union[]=new int[n1+n2+2];
		int intersection[]=new int[n1];
		int itr=0;
		int count=0;
		int z=0;
		for(z=0;z<n1;z++) {
			union[z]=arr1[z];
		}
		
		for(int j=0;j<n2;j++) {
			int flag=0;
			for(int i=0;i<n1;i++) {
				if(arr2[j]==arr1[i]) {
					flag=1;
				}
			}
			if(flag==0) {
				union[z]=arr2[j];
				//System.out.println("**"+arr2[j]);
				z++;
				count++;
			}
			if(flag==1) {
				intersection[itr]=arr2[j];
				itr++;
			}
		}
		//System.out.println(n1+count);
		for(int j=0;j<n1+count;j++) {
			System.out.print(union[j]+" ");
		}
		System.out.println("\nintersection: ");
		for(int j=0;j<itr;j++) {
			System.out.print(intersection[j]+" ");
		}
		

	}

}
