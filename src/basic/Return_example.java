package basic;

public class Return_example {
	int result;
	void add(int num1,int num2) {
		result=num1+num2;
		System.out.println("add: "+result);
	}
	int sub(int num1,int num2){
		result=num1-num2;
		return result;
	}

	public static void main(String[] args) {
		Return_example s=new Return_example();
		s.add(23, 10);
		System.out.println("sub: "+s.sub(23, 10));
		
		

	}

}
