package test_02;

class constructordemo{
	double height,width,depth;
	constructordemo(){
		
	}
	
	constructordemo(double h,double w,double d){
		height=h;
		width=w;
		depth=d;
	}
	void volume() {
		System.out.println("volume is; "+ (width*height*depth));
	}
}
public class constructor_in_java {

	public static void main(String[] args) {
		constructordemo s1=new constructordemo();
		constructordemo s2=new constructordemo(50,48,10);
		s1.volume();
		s2.volume();
		

	}

}
