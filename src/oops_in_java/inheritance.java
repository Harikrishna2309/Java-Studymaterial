package oops_in_java;
class Base{
	int emp_id;
	String emp_name;
	void getInfo(int id,String name) {
		emp_id=id;
		emp_name=name;
	}void putInfo(){
		System.out.println("employee ID: "+emp_id);
		System.out.println("employee name: "+emp_name);
	}
}class Derived extends Base{
	String designation;
	int salary;
	void getInfo1(String desig,int sal) {
		getInfo(101,"malar");
		designation=desig;
		salary=sal;
	}
	void putInfo1() {
		putInfo();
		System.out.println("designation: "+designation);
		System.out.println("salary: "+salary);
	}
	
}

public class inheritance {

	public static void main(String[] args) {
		Derived d=new Derived();
		d.getInfo1("hr", 20000);
		d.putInfo1();
		

	}

}
