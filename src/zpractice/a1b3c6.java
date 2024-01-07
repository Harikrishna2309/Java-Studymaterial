package zpractice;
import java.util.*;
public class a1b3c6 {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		int x=1;
		int y=0;
		System.out.println("input");
		String n=s1.nextLine();
		int len=n.length();
		System.out.println(len);
		
		int count=0;
		for(int j=0;j<len/2;j++) {
			int z=Integer.parseInt(String.valueOf(n.charAt(x)));
			
			for(int i=0;i<z;i++) {
				System.out.print(n.charAt(y));
				
			}
			x=x+2;
			y=y+2;
			count++;
		}
		//System.out.println(count);
		

	}

}
