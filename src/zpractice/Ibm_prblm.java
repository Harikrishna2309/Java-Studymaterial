package zpractice;
import java.util.*;
public class Ibm_prblm {
	public void countNumber(ArrayList<Integer>arr) {
		int n=arr.size();
		System.out.println("size= "+n);
		int count=0;
		for(int x:arr) {
			int y=x%10;
			x=x/10;
			if(x!=y) {
				count++;
			}
			
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int n,m;
		Scanner s1=new Scanner (System.in);
		System.out.println("enter n");
		n=s1.nextInt();
		System.out.println("enter m");
		m=s1.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=n;i<=m;i++) {
			arr.add(i);
		}
		
		Ibm_prblm z=new Ibm_prblm();
		z.countNumber(arr);

	}

}
