package Data_structure;
import java.util.Arrays;
import java.util.Scanner;
public class Floodfill {
	private void fillgrid(char[][]arr,int r,int c) {
		if(arr[r][c]=='p') {
			arr[r][c]='w';
			display(arr);
			fillgrid(arr,r+1,c);//right
			fillgrid(arr,r-1,c);//left
			fillgrid(arr,r,c+1);//top
			fillgrid(arr,r,c-1);//bottom
			
		}
	}
	private void display(char[][]arr) {
		System.out.println("\ngrid : ");
		for(int i=1;i<arr.length-1;i++) {
			for(int j=1;j<arr[i].length-1;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("flood fill test\n");
		System.out.println("enter dimension of grid");
		int M=scan.nextInt();
		int N=scan.nextInt();
		char[][]arr=new char[M+2][N+2];
		for(int i=0;i<M+2;i++)
			Arrays.fill(arr[i], '0');
		System.out.println("enter grid with 'p' for passage and '0' for obstacle");
		for(int i=1;i<M+1;i++)
			for(int j=1;j<N+1;j++)
				arr[i][j]=scan.next().charAt(0);
		System.out.println("enter the coordinates to start");
		int sr=scan.nextInt();
		int sc=scan.nextInt();
		if(arr[sr][sc]!='p') {
			System.out.println("invalid coordinates");
			System.exit(0);
		}
		Floodfill ff=new Floodfill();
		ff.fillgrid(arr, sr, sc);
		

	}

}
