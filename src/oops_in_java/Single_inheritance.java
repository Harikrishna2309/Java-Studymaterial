package oops_in_java;
class person2{
	String name;
	int age;
	void getperinfo(String str,int ag) {
		name=str;
		age=ag;
	}void putperinfo(){
		System.out.println("name; "+name);
		System.out.println("age; "+age);
		
	}
}class student2 extends person2{
	int total;
	char grade;
	void getstuinfo(String n,int ag,int tot,char gr) {
		getperinfo(n,ag);
		total=tot;
		grade=gr;
	}void putstuinfo(){
		putperinfo();
		System.out.println("total; "+total);
		System.out.println("grade; "+grade);
	}
}
public class Single_inheritance {

	public static void main(String[] args) {
		student2 s=new student2();
		s.getstuinfo("hari",22,98, 'a');
		s.putstuinfo();
		
		

	}

}
