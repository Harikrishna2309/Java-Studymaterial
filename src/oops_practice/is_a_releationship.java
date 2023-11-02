package oops_practice;
class employee8{
	float salary=40000;
}//class programmer extends employee8{
	//int bonus=10000;
	
//}

public class is_a_releationship extends employee8 {
	int bonus=10000;

	public static void main(String[] args) {
		is_a_releationship s=new is_a_releationship();
		System.out.println("programmer salary is: "+s.salary);
		System.out.println("bonus of programmer is; "+s.bonus);
		

	}

}
