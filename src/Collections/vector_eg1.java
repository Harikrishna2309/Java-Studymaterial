package Collections;
import java.util.*;
public class vector_eg1 {

	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>(3);
		vec.addElement("apple");
		vec.addElement("orange");
		vec.addElement("mango");
		vec.addElement("fig");
		System.out.println("size is: "+vec.size());
		System.out.println("default capacity increament is: "+vec.capacity());
		vec.addElement("fruit 1");
		vec.addElement("fruit 2");
		vec.addElement("fruit 3");
		vec.add("hari");
		
		System.out.println(vec);
		System.out.println("size after addition is: "+vec.size());
		System.out.println("capacity after increament is: "+vec.capacity());
		Enumeration<String> en=vec.elements();
		System.out.println("\nElements are: ");
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
			
			
		}
	}

}
