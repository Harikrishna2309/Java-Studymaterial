package interviewProblems;

public class listofSubarray {

	public static void main(String[] args) {
		int arr[]= {-2,-3,4,-1,-2,1,5,-3};
		int n=arr.length;
		int maxSum=arr[0];
		int minSum=arr[0];
		for (int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
					sum=sum+arr[k];
				}
				if(sum>maxSum) {
					maxSum=sum;
				}
				if(sum<minSum) {
					minSum=sum;
				}
				System.out.println("sum= "+sum);
			
			}
			System.out.println();
		}
		
		System.out.println("MAX sum= "+maxSum);
		System.out.println("Min sum= "+minSum);

	}

}
