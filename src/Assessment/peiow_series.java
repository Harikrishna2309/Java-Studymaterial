package Assessment;

import java.util.Scanner;

public class peiow_series {
	public static int prime(int n) {
		int notprime=0;
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				notprime=1;
			    break;
		
			}
	    }if(notprime==0) {
	    	return n;
	    }
	    return 0;
	}

	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the numbers: ");
		n=s1.nextInt();
		int arr[]=new int[n+1];
		int prime[]=new int[n/2];
		int count=0;
		int z=0;
		int num=0;
		for(int j=2;j<(n*10);j++) {
				num=prime(j);
				if(num!=0 && count<n/2 ) {
				 prime[z]=num;
				count++;
				z++;
				}
		}
		int f=0;
		int a=1,b=1,c;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				if(i==1 || i==3) {
					arr[i-1]=1;
					//System.out.println("1");
					continue;
				}else {
					c=a+b;
					a=b;
					b=c;
					arr[i-1]=c;
					//System.out.println(c);
					continue;
				}

			}else {
				arr[i-1]=prime[f];
				f++;
				continue;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nnumper at the position "+n+" is: "+arr[n-1]);


	}

}
