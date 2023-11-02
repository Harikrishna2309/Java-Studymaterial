package Collections;
import java.util.*;
public class linked_list {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		list.add("hari");
		list.add("krish");
		list.add("car");
		list.addFirst("M");
		list.add("hari");
		list.addLast("muthusamy");
		list.add(2,"23");
		Object str=list.clone();
		System.out.println(str);
		Iterator<String>iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//list.remove(1);
		System.out.println("after removing ");
		System.out.println(list);
		//list.poll();
		//System.out.println(list);
	//	list.pollFirst();
		//System.out.println(list);
		list.pollLast();
		System.out.println(list);
		list.removeFirstOccurrence("hari");
		System.out.println(list);
		
	}

}
