package Assessment;

import java.util.Scanner;

public class firstposition {
	static int count1,count2,count3,count4,count5,count6,count7=0;
	
	public static void smallletter(int i) {
		if(count1==0) {
			System.out.println("first small letter: "+(i+1));
			count1++;
		}
	}
	public static void captialletter(int i) {
		if(count2==0) {
			System.out.println("first captial letter: "+(i+1));
			count2++;
		}
		
	}
	public static void digit(int i) {
		if(count3==0) {
			System.out.println("first digit: "+(i+1));
			count3++;
		}
	}
	public static void isspace(int i) {
		if(count4==0) {
			System.out.println("first space: "+(i+1));
			count4++;
		}
	}
	public static void vowel(int i) {
		if(count5==0) {
			System.out.println("first vowel: "+(i+1));
			count5++;
		}
	}
	public static void consonant(int i) {
		if(count6==0) {
			System.out.println("first consonant: "+(i+1));
			count6++;
		}
	}
	public static void special(int i) {
		if (count7==0) {
			System.out.println("first special char: "+(i+1));
			count7++;
		}
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String str,str1;
		System.out.println("enter the string: ");
		str=s1.nextLine();
		int len=str.length();
		String arr[]=str.split("");
		
		for(int i=0;i<len;i++) {
			char z=arr[i].charAt(0);
			
			if(Character.isLowerCase(arr[i].charAt(0))) {
				smallletter(i);
				if(z=='A'||z=='E'||z=='I'||z=='O'||z=='U'||z=='a'||z=='e'||z=='i'||z=='o'||z=='u') {
					vowel(i);
				}
				 else if(z!='A'||z!='E'||z!='I'||z!='O'||z!='U'||z!='a'||z!='e'||z!='i'||z!='o'||z!='u') {
					consonant(i);
					
				}
				
				
			}
			else if(Character.isUpperCase(arr[i].charAt(0))) {
				captialletter(i);
				if(z=='A'||z=='E'||z=='I'||z=='O'||z=='U'||z=='a'||z=='e'||z=='i'||z=='o'||z=='u') {
					vowel(i);
				}
				 else if(z!='A'||z!='E'||z!='I'||z!='O'||z!='U'||z!='a'||z!='e'||z!='i'||z!='o'||z!='u') {
					consonant(i);
					
				}
				
			}
			else if(Character.isDigit(arr[i].charAt(0))) {
				digit(i);
			}
			else if(Character.isSpace(arr[i].charAt(0))) {
				isspace(i);
			}
			 else {
				 special(i);
			 }
		}

	}

}
