 package oops_in_java;



class base1{
	int std_id;
	String std_name;
	void getInfo(int id,String name) {
		std_id=id;
		std_name=name;
	}void putInfo(){
		System.out.println("employee ID: "+std_id);
		System.out.println("employee name: "+std_name);
	}
}
class derived1 extends base1{
	int mark1,mark2,mark3,tot,avg;
	void getInfo1(int m1,int m2,int m3) {
		getInfo(15,"hari");
		mark1=m1;
		mark2=m2;
		mark3=m3;
		tot=m1+m2+m3;
		avg=tot/3;
	}void putInfo1(){
		putInfo();
		System.out.println("mark1 :"+mark1);
		System.out.println("mark2 :"+mark2);
		System.out.println("mark3 :"+mark3);
		System.out.println("total :"+tot);
		System.out.println("avgerage :"+avg);
		
		
	}
}
public class inheritance_problem {

	public static void main(String[] args) {
		derived1 d=new derived1();
		d.getInfo1(20,30,40);
		d.putInfo1();		

	}

}
