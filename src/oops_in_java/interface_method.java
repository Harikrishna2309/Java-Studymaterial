package oops_in_java;
interface demo5{
	public void method1();
	public void method2();
}class interface_method implements demo5{
	public void method1() {
		System.out.println("implement 1");
	}public void method2(){
		System.out.println("implement 2");
		
		
	}public static void main (String arg[]) {
		demo5 obj=new interface_method();
		obj.method1();
	}

	
	

	

}
