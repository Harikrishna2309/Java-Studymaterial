package Collections;

import java.util.ArrayList;
import java.util.*;

public class iterator1 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("c");
		a1.add("a");
		a1.add("d");
		System.out.println("original content of a1 ");
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext()) {
			Object element=itr.next();
			System.out.println(element+" ");
			
		}
		
		System.out.println();
		ListIterator<String> litr=a1.listIterator();
		
		while(litr.hasNext()) {
			Object element=litr.next();
			litr.set(element+"+");
			
		}System.out.println("modified content of a1 ");
		itr=a1.iterator();
		while(itr.hasNext()) {
			Object element=itr.next();
			System.out.println(element+" ");
		}
		System.out.println();

	}

}
