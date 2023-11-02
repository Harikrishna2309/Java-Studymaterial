package program;
import java.util.Scanner;
public class vowel_consonant {

	public static void main(String[] args) {
		char ch;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the charater: ");
		ch=s1.next().charAt(0);
		switch(ch) {
			case'a':
			case'A':
			case'e':
			case'E':
			case'i':
			case'I':
			case'o':
			case'O':
			case'u':
			case'U':
				System.out.println("vowel: "+ch);
				break;
			default:
				System.out.println("consonant: "+ch);
			
		}
		

	}

}
