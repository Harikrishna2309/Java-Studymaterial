package Collections;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> alist=new ArrayList<Comparable>();
		alist.add("hari");
		alist.add("krish");
		System.out.println(alist);
		alist.add(0,"m");
		alist.add(3);
		System.out.println(alist);
		alist.remove("hari");
		System.out.println(alist);
		System.out.println(alist.size());
		

	}

}
