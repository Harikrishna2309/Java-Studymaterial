package Collections;
import java.util.*;
import java.util.Map.Entry;
public class mapping_eg1 {

	public static void main(String[] args) {
		Map<String,Integer>m1=new HashMap<String,Integer>();
		m1.put("zara",8);
		m1.put("mahan",31);
		m1.put("ayan",12);
		m1.put("daisy",14);
		//m1.put("ayan",15);
		System.out.println("map elements");
		System.out.println(m1);
		System.out.println(m1.get("ayan"));
		Set<?> set=m1.entrySet();
		Iterator<?> iterator=set.iterator();
		while(iterator.hasNext()) {
			Map.Entry<?, ?> mentry=(Map.Entry<?, ?>)iterator.next();
			System.out.print("key is: "+mentry.getKey()+"&value is: ");
			System.out.println(mentry.getValue());
		}
		Integer var=m1.get("ayan");
		System.out.println();
		System.out.println("value at index 2 is: "+var);
		System.out.println();
		m1.remove("ayan");
		System.out.println("map and key after removal: ");
		Set set2=m1.entrySet();
		Iterator iterator2=set2.iterator();
		while(iterator2.hasNext()) {
			Map.Entry<?, ?>mentry2=(Map.Entry<?, ?>)iterator2.next();
			System.out.print("key is: "+mentry2.getKey()+"value is: ");
			System.out.println(mentry2.getValue());
		}
	}

}
