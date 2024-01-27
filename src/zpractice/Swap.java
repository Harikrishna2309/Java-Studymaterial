package zpractice;
import java.util.*;
import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
//		int a=15,b=6;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		a=(a^b)^a;
	
//		System.out.println(a);
//		System.out.println(b);
//		
//		
//		int c=a;
//		a=b;
//		b=c;
		
		
//		System.out.println(a);
//		System.out.println(b);
		/*String s="hari krish";
		String []x=(s.split("\\ "));
		System.out.println(Arrays.toString(x));
		for(String i:x) {
			System.out.println(i);
		}
		StringBuffer s1= new StringBuffer(s);
		System.out.println(s1);
		s1.append(" M");
		System.out.println(s1);*/
		/*for(int i=0;i<1;i++) {
			System.out.println(i+' ');
			//ans 32 ASCII value of space is 32 because java concate charcter with number it change charcter to ascii
			//if" "using double quotes its value is 0
		}*/
		
		Queue<Integer>q1=new PriorityQueue<Integer>();
		q1.add(50);
		q1.add(1);
		q1.add(55);
		q1.add(45);
		System.out.println(q1.poll());
		System.out.println(q1.poll());
		
		Queue<Character>q2=new PriorityQueue<Character>();
		q2.add('h');
		q2.add('a');
		q2.add('r');
		q2.add('i');
		
		System.out.println(q2.poll());
		System.out.println(q2.peek());
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		
		
		Deque<Character>q3=new ArrayDeque<Character>();
		q3.push('h');
		q3.add('a');
		q3.add('r');
		q3.add('i');
		System.out.println("Array");
		System.out.println(q3.pop());
		System.out.println(q3.poll());
		System.out.println(q3.poll());
		System.out.println(q3.poll());


	}

}
