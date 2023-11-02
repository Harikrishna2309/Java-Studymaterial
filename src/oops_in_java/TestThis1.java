package oops_in_java;
class Student5{
	int rollno;
	String name;
	float fee;
	Student5(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}void display(){
		System.out.println(rollno+" "+name+" "+fee);
	}
}

public class TestThis1 {

	public static void main(String[] args) {
		Student5 s1=new Student5(111,"hari",5000f);
		Student5 s2=new Student5(112,"krish",6000f);
		s1.display();
		s2.display();
		

	}

}
