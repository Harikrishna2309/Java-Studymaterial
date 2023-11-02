package oops_in_java;
class person1{
	public void role() {
		System.out.println("son or daughter");
	}
}
public class overriding extends person1 {
	public void role() {
		super.role();
		System.out.println("student");
	}

	public static void main(String[] args) {
		overriding or =new overriding();
		or.role();
		

	}

}
