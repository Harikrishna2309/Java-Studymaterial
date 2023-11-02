package Datatype;
import java.util.Scanner;

public class Student_info {

	public static void main(String[] args) {
		//long rollNo=101,contact=9080031847l,age=22;
		//String name= "hari";
		//char gender='m';
		//System.out.println("student information; ");
		//System.out.println("Roll no: "+rollNo);
		//System.out.println("Name: "+name);
		//System.out.println("contact number"+contact);
		//System.out.println("age: "+age);
		int rollNo,age;
		long contact;
		String name,gender;
		//char gender;
		Scanner S =new Scanner(System.in);
		System.out.print("enter the roll NO:  ");
		rollNo=S.nextInt();
		System.out.print("enter the name: ");
		name=S.next();
		System.out.print("enter the contact number: ");
		contact=S.nextLong();
		System.out.print("enter your age: ");
		age=S.nextInt();
		System.out.println("student information: ");
		System.out.println("roll number: "+rollNo);
		System.out.println("name: "+name);
		System.out.println("contact number: "+contact);
		System.out.println("age: "+age);
		
		
		

	}

}
