package interviewProblems;
import java.util.*;
public class ArrayStringSorting {
	
	public static void printarray(String arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void  sortedarr(String arr[],int n) {
		for(int i=0;i<n;i++) {
			char ch[]=arr[i].toCharArray();
			Arrays.sort(ch);
			arr[i]=new String(ch);
		}
		
		printarray(arr);
			
	}

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=s1.nextInt();
		s1.nextLine();
		String arr[]=new String[n];
		System.out.println("elements of arr");
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextLine();
			
		}
		printarray(arr);
		System.out.println();
		sortedarr(arr,n);
		
		

	}

}
