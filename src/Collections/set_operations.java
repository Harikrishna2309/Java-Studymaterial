package Collections;
import java.util.*;
public class set_operations {

	public static void main(String[] args) {
		Integer[] a= {22,45,33,66,55,34,77};
		Integer[] b= {33,2,83,45,3,12,55};
		Set<Integer>set1=new HashSet<Integer>();
		set1.addAll(Arrays.asList(a));
		Set<Integer>set2=new HashSet<Integer>();
		set2.addAll(Arrays.asList(b));
		Set<Integer>union=new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println("union of set1 and set2: ");
		System.out.println(union);
		Set<Integer>intersection=new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println("intersection of set1 and set2: ");
		System.out.println(intersection);
		Set<Integer>difference=new HashSet<Integer>(set1);
		difference.removeAll(set2);
		System.out.println("difference is: ");
		System.out.println(difference);
		}

}
