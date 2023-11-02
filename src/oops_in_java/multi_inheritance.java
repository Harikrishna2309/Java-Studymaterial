package oops_in_java;
class grand_father{
	void show1() {
		System.out.println("grand father class");
	}
}class father extends grand_father{
	void show2() {
		System.out.println("father class");
	}
}class son extends father{
	void show3() {
		System.out.println("son class");
	}
}class grand_son extends son{
	void show4() {
		System.out.println("grandson class");
	}
}

public class multi_inheritance {

	public static void main(String[] args) {
		grand_son gs=new grand_son();
		gs.show1();
		gs.show2();
		gs.show3();
		gs.show4();
		
		

	}

}
