package Assessment;
import java.util.Scanner;
public class large_vs_small {

	public static void main(String[] args) {
			int n,sum=0,large=0,largeplc=0,small,smallplc=0;
			Scanner s1=new Scanner(System.in);
			System.out.print("enter num of elements ");
			n=s1.nextInt();
			int arr[]=new int[n];
			System.out.print("enter the arr num ");
			for (int i=0;i<n;i++) {
				arr[i]=s1.nextInt();
				
			}
			small=arr[1];
			for(int i=0;i<n;i++) {
				if(large<arr[i]) {
					large=arr[i];
					largeplc=i+1;
				}if(small>arr[i]) {
					small=arr[i];
					smallplc=i+1;
				}
				
			}//for(int i=0;i<n;i++) {
				
			//}
		System.out.println(largeplc-smallplc);

	}

}
