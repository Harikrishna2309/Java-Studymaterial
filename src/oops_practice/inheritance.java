package oops_practice;
class friends{
	int age;
	String name;
	//friends(int age, String name){
	void getinfo(int age,String name) {
		
	}void putinfo(){
		System.out.println("enter the age");
		System.out.println("enter the name");
	}
}
class college  extends  friends{
	void getinfo(int rollNo) {
		
	}void putinfo(){
		System.out.println("enter the roll No");
	}
}
public class inheritance {

	public static void main(String[] args) {
		friends s1=new friends();
		s1.putinfo();
		s1.getinfo(15, "hari");
		

	}

}
