package oops_in_java;
class encapsulationdemo{
	private int ssn;
	private String empname;
	private int empage;
	public int getempssn() {
		return ssn;
		
	}public String getempname() {
		return empname;
	}public int getempage() {
		return empage;
	}public void setempage(int newvalue) {
		empage=newvalue;
	}public void setempname(String newvalue) {
		empname=newvalue;
	}public void setempssn(int newvalue) {
		ssn=newvalue;
	}
}
public class EncapsTest {

	public static void main(String[] args) {
		encapsulationdemo obj=new encapsulationdemo();
		obj.setempname("hari");
		obj.setempage(22);
		obj.setempssn(4015);
		System.out.println("employee name: "+obj.getempname());
		System.out.println("employee ssn: "+obj.getempssn());
		System.out.println("employee age: "+obj.getempage());
		

	}

}
