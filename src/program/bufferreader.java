package program;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bufferreader {

	public static void main(String[] args) throws IOException {
		//char m;
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		char m=(char)bf.read();
	//	Scanner s1=new Scanner(System.in);
	//	System.out.println("enter the character: ");
	//	m=s1.next().charAt(0);
		if(m>=97 && m<=123) {
			System.out.println("lower case");
			
		}
		else if(m>=65 && m<=96) {
			System.out.println("upper case");
		}
		else if(m>=48 && m<=57) {
			System.out.println("digit");
		}

	}

}
