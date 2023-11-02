package oops_practice;
class bird {
	void type1(String a) {
		System.out.println("type "+a);
	}void type1(int a){
		System.out.println("age "+a);
		
	}
}

public class overloading {

	public static void main(String[] args) {
		bird s1=new bird();
		s1.type1(5);
		s1.type1("bird");
		

	}

}
