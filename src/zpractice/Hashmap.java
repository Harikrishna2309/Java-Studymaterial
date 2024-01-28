package zpractice;
import java.util.*;
public class Hashmap {
	public void findduplicate(int arr[]) {
		Map<Integer,Integer>h1=new HashMap<Integer,Integer>();
		for(int x:arr) {
			if(!h1.containsKey(x)) {
				h1.put(x, 1);
			}
			else {
				h1.put(x,h1.get(x)+1);
			}
		}
		int count=0;
		ArrayList<Integer> dup=new ArrayList<Integer>();
		for(int x:h1.keySet()) {
			if(h1.get(x)>1) {
				dup.add(x);
				count=1;
			}
		}
		if(count==0) {
			System.out.println("no duplicate elements");
		}
		else {
			System.out.println("duplicate elements are: "+dup);

		}
		
	}

	public static void main(String[] args) {
		int n;
		Scanner s1= new Scanner(System.in);
		System.out.println("number of elements");
		n=s1.nextInt();
		
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		Hashmap d=new Hashmap();
		d.findduplicate(arr);
	}

}
