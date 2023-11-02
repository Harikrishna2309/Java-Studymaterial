
package Class_object;     //1 2 1 3 2 5 3 7 5 11 8 13 13 

public class recursion_mixedseries {
	static int n1=1,n2=0,n3,flag=0,primenum=2; //fibonacci 1 1 2 3 5 8 13
	static void fibo(int n) {                //prime 2 3 5 7 9 11 13
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
	}
	static int prime(int num) {
		for(int j=2;j<num;j++) {
			if(num%j==0) {
				num++;
				prime(num);
			}
		}return num;
	}
			
			
		
		
	

	public static void main(String[] args) {
		for(int i=1;i<=13;i++) {
			if(i%2!=0) {
				n3=n2+n1;
				fibo(n3);
			}else {
				primenum=prime(primenum);
				System.out.print(primenum+" ");
				primenum++;
			}
		}

	}

}
