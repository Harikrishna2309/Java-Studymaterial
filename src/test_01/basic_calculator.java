package test_01;

public class basic_calculator {
		int num1=10,num2=20,result;
		
		void add() {
			
			result=num1+num2;
			System.out.println(result);
		}
		void sub(){
			System.out.println(num1-num2);
		}
		void mul() {
			System.out.println(num1*num2);
		}void div() {
			System.out.println(num1/num2);
		}void mod() {
			System.out.println(num1%num2);
		}

	public static void main(String[] args) {
		basic_calculator f=new basic_calculator();
		f.sub();
		f.add();
		f.mul();
		f.div();
		f.mod();

	}

}
