package Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Arraylist_2 {

	public static void main(String[] args) {
		ArrayList<String>arr=new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of elements: ");
		int n=s.nextInt();
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			arr.add(s.next());
		}
		arr.add("hari");
		arr.add("krish");
		arr.add("m");
		arr.add("hai");
		System.out.println("arraylist printing: ");
		System.out.println(arr);
		Collections.sort(arr);
		arr.set(0, "hello");
		System.out.println("get method "+arr.get(2));
		System.out.println("index method "+arr.indexOf("hari"));
		//for(String strl:arr) {
		//	System.out.println(strl);
		//}
		System.out.println(arr.contains("hari"));
		arr.clear();
		System.out.println(arr);
		

	}

}
