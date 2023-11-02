package zoho;
import java.util.Scanner;

public class minimum_num_note {

	public static void main(String[] args) {
		int fhundred=0,hundred=0,fifty=0,twenty=0,ten=0,five=0,two=0,one=0;
		int num;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the amount: ");
		num=s1.nextInt();
		while(num>0) {
			if(num>=500) {
				num=num-500;
				fhundred++;
				continue;
			}
			if(num>=100) {
				num=num-100;
				hundred++;
				continue;
			}
			if(num>=50) {
				num=num-50;
				fifty++;
				continue;
			}
			if(num>=20) {
				num=num-20;
				twenty++;
				continue;
			}
			if(num>=10) {
				num=num-10;
				ten++;
				continue;
			}
			if(num>=5) {
				num=num-5;
				five++;
				continue;
			}
			if(num>=2) {
				num=num-2;
				two++;
				continue;
			}
			if(num>=1) {
				num=num-1;
				one++;
				continue;
			}
		}
		System.out.print("500: "+fhundred+"\n"+"100: "+hundred+"\n"+"50: "+
		fifty+"\n"+"20: "+twenty+"\n"+"10: "+ten+"\n"+"5: "+five+"\n"+"2: "+two+"\n"
		+"1: "+one);

	}

}
