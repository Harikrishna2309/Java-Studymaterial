package Collections;
import java.util.*;
public class queue_eg1 {

	public static void main(String[] args) {
		Queue<String>q=new LinkedList<String>();
	//	System.out.println(q.remove());
		System.out.println(q.poll());
		q.add("rick");
		q.add("maggie");
		q.add("glenn");
		q.add("negan");
		q.add("daryl");
		System.out.println("elements in the queue: "+q);
		System.out.println("remove element: "+q.remove());
		System.out.println("head: "+q.element());
		System.out.println("poll: "+q.poll());
		System.out.println(q);
		System.out.println("peek: "+q.peek());
		
		

	}

}
