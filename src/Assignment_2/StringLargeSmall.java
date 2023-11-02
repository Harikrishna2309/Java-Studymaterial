package Assignment_2;

import java.util.Scanner;

public class StringLargeSmall {
	static void largesmall(String str) {
		String[]arr=str.split(" ");
		String min=arr[0];
		String max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()<min.length()) {
				min=arr[i];
				
			}if(arr[i].length()>max.length()) {
				max=arr[i];
			}
			
		}
		System.out.println("smallest word is: "+min );
		System.out.println("largest word is: "+max);
	}

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String str;
		System.out.println("enter the string: ");
		str=s1.nextLine();
		largesmall(str);

	}

}
