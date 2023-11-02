package basic;
class counter{
	static int count;

	counter(){
		count=count+1;
		System.out.println(count);
	}
}
public class static_variable {

	public static void main(String[] args) {
		counter c1=new counter();
		counter c2=new counter();
		counter c3=new counter();
		

	}

}
