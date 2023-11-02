package zpractice;

public class arraysorting2D {

	public static void main(String[] args) {
		int arr[][]= {{9,8,7},{4,5,6},{1,2,3}};
		int n=arr.length;
		
		System.out.println(n);
		System.out.println("original array");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int count=0;
		int x=0,y=0;
		int min;
		outer:
		while(count<9) {
		min=arr[x][y];
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				if(min<arr[i][j]){
					min=arr[i][j];
					int temp=arr[x][y];
					arr[x][y]=min;
					min=temp;
				}
					
				}
		}
		if(y<2) {
		y++;
		count++;
		}else {
			x++;
			y=0;
			count++;
		}
		}
	
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
