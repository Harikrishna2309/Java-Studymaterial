package HackerRank;
import java.util.*;
public class String_hashSet {
	public static void output(String arr[]){
		LinkedHashSet<String>h1=new LinkedHashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
        	h1.add(arr[i]);   
        }
        Iterator <String>i1=h1.iterator();
        while(i1.hasNext()) {
        	System.out.print(i1.next()+" ");
        }
        System.out.println();
    }

	public static void main(String[] args) {
		 Scanner s1=new Scanner (System.in);
	        int n=s1.nextInt();
	        s1.nextLine();
	        for(int i=0;i<n;i++){
	            String in=s1.nextLine();
	            String arr[]=in.split(" ");
	            output(arr);
	        }
	        

	}

}
