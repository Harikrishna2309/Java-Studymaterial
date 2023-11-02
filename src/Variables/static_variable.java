package Variables;

public class static_variable {
	public static int stud_id=101;
	String name="rahul"; 

	public static void main(String[] args) {
		static_variable sv = new static_variable();
		System.out.println(static_variable.stud_id);
		System.out.println(sv.name);

	}

}
