package Assessment;

import java.util.Scanner;

public class Student_division {

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
		if(avg>90) {
			System.out.print("excellent");
			}
		else if(avg>80 & avg<90) {
			System.out.print("very good");
				
			}
		else if(avg>70 & avg<80) {
			System.out.print("good");
		}
		else if(avg>60 & avg<70) {
			System.out.print("workhard");
		}
		else {
			System.out.print("poor");
		}
	}

}
