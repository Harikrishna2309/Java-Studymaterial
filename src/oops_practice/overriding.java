package oops_practice;
class animal {
	public void type() {
	System.out.println("land living");
	
   }
}
public class overriding extends animal {
	public void type() {
		//super.type();
		System.out.println("herbivorus");
	}

	public static void main(String[] args) {
		overriding s1=new overriding();
		s1.type();
		

	}

}
