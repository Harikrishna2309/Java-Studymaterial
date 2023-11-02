package program;

import java.util.Scanner;

public class xor_assesment {
	static int countsetbit(int n) {
		int count=0;
		while(n>0) {
			n=(n&(n-1));
			count++;
		  }
		return count;
		}
	static int minvalue(int a,int b) {
		int setbit=countsetbit(b);
		int ans=0;
		for(int i=31;i>=0;i--) {
			int mask=(1<<i);
			if((mask&a)>0 && (setbit>0)) {
			ans=ans | mask;
			setbit--;
			}
		}
	
	int i=0;
	while(setbit>0) {
		int mask=(1<<i);
		if((mask & ans)==0) {
			ans=ans|mask;
			setbit--;
		}
		i++;
	}
	return ans;
	}
	public static void main(String[] args) {
		int a,b;
		Scanner s1= new Scanner(System.in);
		System.out.println("enter a");
		a=s1.nextInt();
		System.out.println("enter b");
		b=s1.nextInt();
		System.out.println("answer: "+minvalue(a,b));
		
	}
}
