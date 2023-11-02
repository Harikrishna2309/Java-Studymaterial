package Assessment;
import java.util.Scanner;
public class Nprimenumber {

	public static void main(String[] args) {
		int n;
		int count=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the length: ");
		n=s1.nextInt();
			for(int i=3;i<100;i++) {
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						break;
					}else {
						
					}
						
				}
				while(count<n) {
				    System.out.println(i+" ");
				    break;
			}
			
			}
		
	

	}

}
