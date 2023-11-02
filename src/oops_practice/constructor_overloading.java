package oops_practice;
class student3{
	int id;
	String name;
	int age;
	student3(int i,String n){
		id=i;
		name=n;
		//System.out.println(id+" "+name);
	}student3(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}void display(){
		System.out.println(id+" "+name+" "+age);
	}
}

public class constructor_overloading {

	public static void main(String[] args) {
		student3 s1=new student3(15, "hari");
		student3 s2=new student3(15,"krish",22);
		s1.display();
		s2.display();

	}

}
