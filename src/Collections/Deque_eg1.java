package Collections;

import java.util.*;


public class Deque_eg1 {

	public static void main(String[] args) {
		Deque<String>dq=new LinkedList<String>();
			dq.add("glenn");
			dq.add("negan");
			dq.add("maggie");
			dq.add("rick");
			dq.add("daryl");
			System.out.println("elements are: "+dq);
			System.out.println("remove element: "+dq.removeLast());
			System.out.println("now elements: "+dq);
			dq.addFirst("charles");
			System.out.println("elemets are: "+dq);
			System.out.println("head: "+dq.element());
			System.out.println("polllast: "+dq.pollLast());
			System.out.println("peek: "+dq.peek());
			System.out.println("elements: "+dq);
			System.out.println("elements is empty: "+dq.isEmpty());

	}

}
