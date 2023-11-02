package Assignment_2;


public class Constructor_overloading {
	int id;
	String name;
	float price;
	Constructor_overloading(int i,String n){
		id=i;
		name=n;
	}
	Constructor_overloading(int i,String n,float p){
		id=i;
		name=n;
		price=p;
	}
	void display(){
		System.out.println("product id:"+id+" product name:"+name+" price: "+price);
	}

	public static void main(String[] args) {
		Constructor_overloading s1=new Constructor_overloading(12,"sampoo");
		Constructor_overloading s2=new Constructor_overloading(10,"soap",100);
		s1.display();
		s2.display();

	}

}
