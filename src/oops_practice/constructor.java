package oops_practice;
class student2{
	int id;
	String name;
	student2(int i,String nam){
		id=i;
		name=nam;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
public class constructor {

	public static void main(String[] args) {
		student2 s1=new student2(15,"hari");
		student2 s2=new student2(14,"krish");
		s1.display();
		s2.display();

	}

}
