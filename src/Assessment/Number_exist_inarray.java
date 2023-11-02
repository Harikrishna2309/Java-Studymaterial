package Assessment;
import java.util.Scanner;

public class Number_exist_inarray {

	public static void main(String[] args) {
		int n,k,temp;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the N value ");
		n=s1.nextInt();
		System.out.print("enter the K value ");
		k=s1.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++) {
			System.out.print("enter the element "+i+" ");
			arr[i]=s1.nextInt();
		}temp=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==k) {
				temp=1;
				//System.out.println("yes");
				break;
			}else {
				temp=0;
				//System.out.println("no");
		}
			
		}if(temp==1) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
