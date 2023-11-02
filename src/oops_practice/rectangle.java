package oops_practice;
class recta{
	int length;
	int width;
	void insert(int l,int w) {
		length=l;
		width=w;
	}
	void calculatearea(){
		System.out.println(length*width);
	}
}
public class rectangle {

	public static void main(String[] args) {
		recta r1= new recta();
		recta r2=new recta();
		r1.insert(11, 5);
		r2.insert(3, 15);
		r1.calculatearea();
		r2.calculatearea();
	}

}
