package Class_object;

public class operation {
	int data=50;
	void change(int data) {
		this.data=data+100;
	}

	public static void main(String[] args) {
		operation op=new operation();
		System.out.println("before"+op.data);
		op.change(500);
		System.out.println("after"+op.data);
		

	}

}
