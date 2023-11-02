package Assignment_2;
import java.util.*;
public class setUnionIntersection {
	static void displayunionandintersection(int[]arrayone,int[]arraytwo) {
		Set<Integer>obj=new HashSet<>();
		int i,j;
		for(i=0;i<arrayone.length;i++) {
			obj.add(arrayone[i]);
		}
		for(j=0;j<arraytwo.length;j++) {
			obj.add(arraytwo[j]);
		}
		System.out.println("the union of both the array is ");
		for(Integer I:obj) {
			System.out.print(I+" ");
		}
		System.out.println();
		obj.clear();
		System.out.println("intersection is: ");
		for(i=0;i<arrayone.length;i++) {
			obj.add(arrayone[i]);
		}
		for(j=0;j<arraytwo.length;j++) {
			if(obj.contains(arraytwo[j]))
				System.out.print(arraytwo[j]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int m,n;
		System.out.println("enter the sizes of two array: ");
		n=br.nextInt();
		m=br.nextInt();
		int[]arrayone=new int[n];
		int[]arraytwo=new int[m];
		System.out.println("enter the elements ");
		int i;
		for(i=0;i<n;i++) {
			arrayone[i]=br.nextInt();
		}
		System.out.println("enter the second array elements");
		for(i=0;i<m;i++) {
			arraytwo[i]=br.nextInt();
		}
		displayunionandintersection(arrayone,arraytwo);

	}

}
