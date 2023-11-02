package test_02;
class area{
	float length,breadth;
	double radius;
	area(float l){
		length=l;
		System.out.println("area of square is "+(length*length) );
	}area(float l,float b){
		length=l;
		breadth=b;
		System.out.println("area of rectance is "+(length*breadth));
	}area(double r){
		radius=r;
		System.out.println("arae of circle is "+(3.14*radius*radius));
	}
}
public class overloading {

	public static void main(String[] args) {
		area s1=new area(5);
		area s2=new area(4,5);
		area s3=new area(2.2);
		
		

	}

}
