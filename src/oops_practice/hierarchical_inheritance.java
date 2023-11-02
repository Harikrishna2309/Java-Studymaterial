package oops_practice;
class person4{
	void show() {
		System.out.println("base class");
	}
}class teacher extends person4 {
	void show1() {
		System.out.println("teacher class");
	}
}class student4 extends person4{
	void show2() {
		System.out.println("student class");
	}
}class doctor extends person4{
	void show3() {
		System.out.println("doctor class");
	}
}
public class hierarchical_inheritance extends person4{

	public static void main(String[] args) {
		hierarchical_inheritance s1=new hierarchical_inheritance();
		s1.show();
		teacher s2=new teacher();
		s2.show1();
		student4 s3=new student4();
		s3.show2();
		doctor s4=new doctor();
		s4.show3();
		
		

	}

}
