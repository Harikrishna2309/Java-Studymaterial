package test_02;

public class duplicate_in_array {

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,3,4};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]){
					System.out.println("duplicate element is "+arr[i]);
				}
			}
		}

	}

}
