package zpractice;
import java.util.*;
public class anagram {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=s1.nextInt();
		
		String arr[]=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=s1.next();
		}
		
		for(int i=0;i<n;i++) {
			char [] chararr=arr[i].toCharArray();
			Arrays.sort(chararr);
			arr[i]= new String(chararr);
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
