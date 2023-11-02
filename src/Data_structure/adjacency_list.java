package Data_structure;

import java.util.ArrayList;

public class adjacency_list {
	static void addedge(ArrayList<ArrayList<Integer>>am,int s,int d) {
		am.get(s).add(d);
		am.get(d).add(s);
	}

	public static void main(String[] args) {
		 int v=5;
		 ArrayList<ArrayList<Integer>>am=new ArrayList<ArrayList<Integer>>(v);
		 for(int i=0;i<v;i++) {
			 am.add(new ArrayList<Integer>());
		 }
			 addedge(am,0,1);
			 addedge(am,0,2);
			 addedge(am,0,3);
			 addedge(am,1,2);
			 
			 printgraph(am);
		 

	}

	 static void printgraph(ArrayList<ArrayList<Integer>> am) {
		for(int i=0;i<am.size();i++) {
			System.out.println("\nvertex "+i+":");
			for(int j=0;j<am.get(i).size();j++) {
				System.out.print("-->"+am.get(i).get(j));
			}
			System.out.println();
		}
		
	}

}
