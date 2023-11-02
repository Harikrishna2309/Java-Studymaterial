package oops_in_java;
interface base6{
	public void fun1();
}interface base7{
	public void fun2();
}
class interimple implements base6,base7{
	public void fun2() {
		System.out.println("fun2");
	}public void fun1() {
		System.out.println("fun1");
		
	}
}

public class mainclassforinterface {

	public static void main(String[] args) {
		interimple obj=new interimple();
		obj.fun1();
		obj.fun2();
		

	}

}
