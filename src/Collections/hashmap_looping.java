package Collections;
import java.util.*;
public class hashmap_looping {

	public static void main(String[] args) {
		HashMap<Integer,String>s1=new HashMap<Integer,String>();
		TreeMap<Integer,String>s2=new TreeMap<Integer,String>();
		s1.put(11,"ab");
		s1.put(2,"cd");
		s1.put(33,"ef");
	    s1.put(9,"gh");
		s1.put(3,"aij");
		//System.out.println(s1.entrySet());
		System.out.println("for loop: ");
		for(Map.Entry me:s1.entrySet()) {
			System.out.println("key: "+me.getKey()+" (&) value: "+me.getValue());
			
		}
		System.out.println();
		System.out.println("while loop: ");
		Iterator iterator=s1.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry me2=(Map.Entry)iterator.next();
			System.out.println("key: "+me2.getKey()+" [&] value: "+me2.getValue());
			
		}
		s2.put(54,"hari");
		s2.put(15,"krish");
		s2.put(23,"hari krish");
		System.out.println("for loop: ");
		for(Map.Entry me:s2.entrySet()) {
			System.out.println("key: "+me.getKey()+" (&) value: "+me.getValue());
			
		}

	}

}
