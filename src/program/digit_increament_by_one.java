package program;
import java.util.Scanner;
public class digit_increament_by_one {

	public static void main(String[] args) {
		int m,n,x;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number ");
		m=s1.nextInt();
		x=m;
		String a="";
		while(m>0) {
			n=m%10;
			n++;
			a=n+a;
			m=m/10;
			
			
		}System.out.println(a);
		int remaider,result=0;
		while(x>0) {
			remaider=x%10;
			result=result*10+remaider;
			x=x/10;
		}System.out.println();
while(result>0) {
	remaider=result%10;
	System.out.print(remaider+1);
	result=result/10;
}
	}

}
