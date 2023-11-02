package oops_practice;
abstract class shape{
	abstract void draw();
}
	

class rectangle2 extends shape{
	void draw() {
		System.out.println("drawing rectangle");
	}
	
}class circle extends shape{
	void draw() {
		System.out.println("drawing circle");
	}
}

public class test_abstraction1 {

	public static void main(String[] args) {
		shape s1=new circle();
		s1.draw();
		
		
		

	}

}
