package Class_object;
 public class stud_infor{
	int stuid=101;
	String stuname="hari";
	 void display() {
		System.out.println("student id ;"+stuid);
		System.out.println("student name ;"+stuname);
	}
}

  class Student_info {

	public static void main(String[] args) {
		stud_infor d=new stud_infor();
		d.display();
		

	}

}
