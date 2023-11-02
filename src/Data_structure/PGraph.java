package Data_structure;
import java.util.*;
public class PGraph {
	public void prim(int g[][],int v) {
		int inf=9999999;
		int no_edge;
		boolean[]selected=new boolean[v];
		Arrays.fill(selected,false);
		no_edge=0;
		selected[0]=true;
		System.out.println("edge:weight");
		while(no_edge<v-1) {
			int min=inf;
			int x=0;
			int y=0;
			for(int i=0;i<v;i++) {
				if(selected[i]==true) {
					for(int j=0;j<v;j++) {
						if(!selected[j] && g[i][j]!=0) {
							if(min>g[i][j]) {
								min=g[i][j];
								x=i;
								y=j;
							}
						}
					}
				}
			}
			System.out.println(x+"- "+y+" : "+g[x][y]);
			selected[y]=true;
			no_edge++;
		}
		}

	public static void main(String[] args) {
		PGraph G=new PGraph();
		int v=5;
		int[][]g= {{0,9,75,0,0},
				  {9,0,95,19,42},
		          {75,95,0,51,66},
		          {0,19,51,0,31},
		          {0,42,66,31,0}};
		G.prim(g, v);
		          
		

	}

}
