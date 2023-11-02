package oops_practice;
interface moveable{
	public void run();
}
interface speakable{
	public void speak();
	public void show();
}
public class multiple_inheritance implements moveable,speakable {
	public void run() {
		System.out.println("it can run");
	}public void speak() {
		System.out.println("it can speak");
	}public void show() {
		System.out.println("it can speak and run");
	}

	public static void main(String[] args) {
		multiple_inheritance s1=new multiple_inheritance();
		s1.speak();
		s1.run();
		s1.show();
		

	}

}
