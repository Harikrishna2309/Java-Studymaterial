package oops_practice;
class person{
	void show() {
		System.out.println("person class");
	}
}class student extends person{
	void show1() {
		System.out.println("student class");
	}
}class engineeringstudent extends student{
	void show2() {
		System.out.println("engineering student class");
	}
}
public class multilevel_inheritance extends engineeringstudent {

	public static void main(String[] args) {
		multilevel_inheritance s1=new multilevel_inheritance();
		s1.show();
		s1.show1();
		s1.show2();

	}

}
