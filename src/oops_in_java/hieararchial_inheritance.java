package oops_in_java;
class parents2{
	void show() {
		System.out.println("parents");
	}
}class son2 extends parents2{
	void disp(){
		System.out.println("son");
	}
}class daughter2 extends parents2{
	void disp() {
		System.out.println("daughter");
	}
}
public class hieararchial_inheritance {

	public static void main(String[] args) {
		son2 s=new son2();
		daughter2 d=new daughter2();
		s.show();
		d.show();
		s.disp();
		d.disp();
		

	}

}
