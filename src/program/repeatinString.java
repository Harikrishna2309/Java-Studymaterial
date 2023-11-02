package program;
import java.util.Scanner;

public class repeatinString {

	public static void main(String[] args) {
		String n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string: ");
		n=s1.next();
		//n.toLowerCase();
		int flag=0;
		int n1=n.length();
		for(int i=0;i<n1-1;i++) {
			for(int j=i+1;j<n1;j++) {
				if(n.charAt(i)==(n.charAt(j))) {
					System.out.println(n.charAt(i));
					flag=1;
					break;
				}
			
			}
		}if(flag==0) {
			System.out.println("no repeated char");
		}
		

	}

}
