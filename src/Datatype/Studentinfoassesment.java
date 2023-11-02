package Datatype;

import java.util.Scanner;

public class Studentinfoassesment {

	public static void main(String[] args) {
		int idno,mark1,mark2,mark3;
		String name;
		float avg,total;
		Scanner S =new Scanner(System.in);
		System.out.print("enter the ID NO:  ");
		idno=S.nextInt();
		System.out.print("enter the name: ");
		name=S.next();
		System.out.print("enter the mark 1: ");
		mark1=S.nextInt();
		System.out.print("enter the mark 2: ");
		mark2=S.nextInt();
		System.out.print("enter the mark 3: ");
		mark3=S.nextInt();
		total=mark1+mark2+mark3;
		avg=total/3;
		System.out.println("ID No: "+idno);
		System.out.println("name: "+name);
		System.out.println("total: "+total);
		System.out.println("AVERAGE : "+avg);
		
		
		

	}

}
