package arrays_class;
import java.util.Scanner;
public class array_rotation {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		int rot;
		Scanner s=new Scanner(System.in);
		System.out.println("number of rotations ");
		rot=s.nextInt();
		for(int r=1;r<=rot;r++) {
		int x=arr[arr.length-1];
		for( int i=n-2;i>=0;i--) {
			arr[i+1]=arr[i];
		}arr[0]=x;}
		
		for(int a:arr) {
			System.out.print(a+",");
		}

	}

}
