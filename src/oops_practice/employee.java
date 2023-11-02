package oops_practice;
import java.util.Scanner;
class emplye{
	int empid;
	String empname;
	int salary;
	int bonus;
	int netsal;
	void insert(int e_id,int sal,int bon,String e_name) {
		empid=e_id;
		empname=e_name;
		salary=sal;
		bonus=bon;
	}
	void calcu() {
		netsal=salary+bonus;
		System.out.println("employee id="+empid);
		System.out.println("employee name="+empname);
		System.out.println("net salary="+netsal);
	}
}
public class employee {

	public static void main(String[] args) {
		emplye a1=new emplye();
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number of employee ");
	int n=s.nextInt();
	int id[]=new int[n];
	String name[]=new String[n];
	int sal[]=new int[n];
	int bonus[]=new int[n];
	for(int i=0;i<n;i++) {
		System.out.println("enter the employee id ; "+i);
		id[i]=s.nextInt();
		System.out.println("enter the employee name ; ");
		name[i]=s.next();
		System.out.println("enter the salary ; ");
		sal[i]=s.nextInt();
		System.out.println("enter the bonus ; ");
		bonus[i]=s.nextInt();
	}for(int i=0;i<n;i++) {
		a1.insert(id[i],sal[i],bonus[i],name[i]);
		a1.calcu();
		
	}
		//emplye a1=new emplye();
		//a1.insert(5000, 80000,500, "hari");
		//a1.calcu();
		

	}

}
