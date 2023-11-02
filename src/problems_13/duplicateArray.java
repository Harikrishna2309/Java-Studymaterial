package problems_13;
import java.util.Scanner;
public class duplicateArray {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int n;
		System.out.println("enter the size of array: ");
		n=s1.nextInt();
		int arr[]=new int[n+2];
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]&&i!=j) {
					count++;
					for(int z=j;z<n;z++) {
					arr[z]=arr[z+1];
					}
				}
			}
		}
		System.out.println(n);
		n=(int) (n-(Math.sqrt(count)));
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
