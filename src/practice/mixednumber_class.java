package practice;

public class mixednumber_class{

	public static void main(String[] args) {
		int n1=0,n2=1;
		System.out.print(n1+" "+n2+" ");
		for(int i=3;i<=12;i++) {
			if(i%2!=0) {
				for(int x=2;x<=i;x++) {
					if(x%2==0) {
					System.out.print(x+" ");
					x++;
					}
					else {
						for(int j=0;j<=i;j++) {
							i=i*j;
							System.out.print(i+" ");
						}
							
						}
					break;
							
						}
				}
			}
	}
}	
				
			
			
		

