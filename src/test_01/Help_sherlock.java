package test_01;

public class Help_sherlock {

	public static void main(String[] args) {
		int n=3,m=4;
		if(n>=1 && n<=1000 && m>=1 && m<=1000) {
			if(n%m==0) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}else {
			System.out.println("invalid");
		}

	}

}
