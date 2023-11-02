package Assessment;

import java.util.Scanner;

public class Ticket_and_dob {

	public static void main(String[] args) {
		int n,dob;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the N value ");
		n=s1.nextInt();
		System.out.print("enter the dob value ");
		dob=s1.nextInt();
		int arr[]=new int[n];
		System.out.print("enter the tic num ");
		for (int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
			
		}
		
		for(int i=0;i<n;i++) {
		if(arr[i]%dob==0) {
				System.out.print(" 1 ");
			}else {
				System.out.print(" 0 ");
			}
		
		}
			
		

	}

}
