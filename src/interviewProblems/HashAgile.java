package interviewProblems;
import java.util.*;
public class HashAgile {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);	
		int n;
		System.out.println("enter n");
     	n=s1.nextInt();
     	int fibcount=n*(n+1)/2;
     	int fib[]=new int[fibcount];
     	int x=1,y=1,z=x+y;
     	fib[0]=x;
     	fib[1]=y;
     	for(int i=2;i<fibcount;i++) {
     		fib[i]=z;
     		x=y;
     		y=z;
     		z=x+y;
     		
     	}
     	int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(fib[count]+" ");
				count++;
			}
			System.out.println();
			
		}

	}

}
