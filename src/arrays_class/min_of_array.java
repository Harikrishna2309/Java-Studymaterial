package arrays_class;

public class min_of_array {

	public static void main(String[] args) {
		int arr[]= {12,3,4,8,9,10,1};
		int min=arr[0];
		int n=arr.length;
		for(int i=1;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}System.out.println("smallest num is "+min);

	}

}
