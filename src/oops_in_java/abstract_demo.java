package oops_in_java;
abstract class sum{
	public abstract int sumoftwo(int n1,int n2);
	public abstract int sumofthree(int n1,int n2,int n3);
	public void disp() {
		System.out.println("method class sum");
	}
	
}class abstract_demo extends sum{
	public static void main(String[] args) {
		sum obj=new abstract_demo();
		System.out.println(obj.sumoftwo(3,7));
		System.out.println(obj.sumofthree(4, 3, 23));
		obj.disp();
		

	}
	public int sumoftwo(int num1,int num2) {
		return num1+num2;
		
	}public int sumofthree(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	
}



	


