package oops_practice;
class about{
	void about1() {
		System.out.println("welcome to the my learning ");
	}
}class product extends about{
	void product1() {
		System.out.println("full stack development\npython");
	}
}class contact extends product{
	public void contact1() {
		System.out.println("learning@gmail.com");
	}
}
public class webapplication extends contact {

	public static void main(String[] args) {
		webapplication s1=new webapplication();
		s1.about1();
		s1.contact1();
		s1.product1();
		

	}

}
