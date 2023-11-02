package Variables;


public class local_variable {
	int a;//global variable
	public void diplay() {
		a=10;
		int b=50;
		System.out.println(a);
		System.out.println(b);
	}
	public void display1() {
		//a=20;
		System.out.println(a);
	}

	public static void main(String[] args) {
		
local_variable lv=new local_variable();
lv.diplay();
lv.display1();

	}

}
