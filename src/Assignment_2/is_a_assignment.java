package Assignment_2;
class teacher{
	float salary=35000;
}

public class is_a_assignment extends teacher  {
	String language="English,french,tamil";
	String certificate="CELTA,TEFL";
	int exp=8;

	public static void main(String[] args) {
		is_a_assignment s1=new is_a_assignment();
		System.out.println("languages known; "+s1.language);
		System.out.println("certification; "+s1.certificate);
		System.out.println("years of experience; "+s1.exp);
		System.out.println("salary; "+s1.salary);

	}

}
