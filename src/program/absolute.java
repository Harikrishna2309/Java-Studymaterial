package program;

public class absolute {
	int first=4,second=8;
	public void add() {
		System.out.println("additional:"+(first+second));
	}public void difference() {
		System.out.println("difference:"+Math.abs(first-second));
	}

	public static void main(String[] args) {
		absolute a=new absolute();
		a.add();
		a.difference();
		

	}

}
