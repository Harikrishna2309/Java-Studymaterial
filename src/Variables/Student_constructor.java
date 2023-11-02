package Variables;

public class Student_constructor {
	int stud_id;           //instance variable or global variable
	String stud_name;
	String college_name;
	public Student_constructor() { //default constructor
		stud_id=101;
		stud_name="hari";
		college_name="aurcc";
		System.out.println(stud_id);
		System.out.println(stud_name);
		System.out.println(college_name);
	}
	public Student_constructor(int id,String name,String col) {
		//parameterized constructor
		System.out.println(id);
		System.out.println(name);
		System.out.print(col);
	}

	public static void main(String[] args) {
		Student_constructor sc= new Student_constructor();
		Student_constructor sc1=new Student_constructor(102,"krish","rgm");

	}

}
