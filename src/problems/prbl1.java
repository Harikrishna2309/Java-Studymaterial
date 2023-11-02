package problems;
import java.util.Scanner;
public class prbl1 {

	public static void main(String[] args) {
		int m,n;
		Scanner s1=new Scanner(System.in);
		System.out.println("number of toys ");
		m=s1.nextInt();
		System.out.println("amount have");
		n=s1.nextInt();
		int pricesum=0;
		int magicpricesum=0;
		int price[]=new int[m];
		System.out.println("enter the prices");
		for(int i=0;i<m;i++) {
			price[i]=s1.nextInt();
			pricesum=pricesum+price[i];
		}
		int magic_price[]=new int[m];
		System.out.println("enter the magic price");
		for(int i=0;i<m;i++) {
			magic_price[i]=s1.nextInt();
			magicpricesum=magicpricesum+magic_price[i];
			}
		if(magicpricesum>n) {
			System.out.println("-1");
		}
		int count=0;
		int j=0;
		while(pricesum>n) {
			for(int i=j;i<m;) {
				count++;
				pricesum=(pricesum-price[i])+magic_price[i];
				//System.out.println("pri"+price[i]);
				//System.out.println("mag"+magic_price[i]);
				System.out.println(pricesum);
				break;	
			}j=j+1;
			
		}System.out.println("answer"+count);
		
		

	}

}
