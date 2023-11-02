package Assessment;
import java.util.Scanner;
public class array_interchanging {

	public static void main(String[] args) {
		int m;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the number of elements");
		m=s1.nextInt();
		int arr[]=new int[m];
		System.out.println("enter the elements of array");
		for(int j=0;j<m;j++) {
			arr[j]=s1.nextInt();

		}for(int z:arr) {
			
		System.out.print(z+" ");}
		System.out.println();
		
		//int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n=arr.length;
        int Arr1[] = new int[n];
        int left=0,right=n-1; 
        for (int i=0;i<n;i++){
            if(i==0 || i%2==0){
            Arr1[i]= arr[right];     
            right--;
            }else{
                Arr1[i] = arr[left];    
                left++;
            }
        }for (int n1:Arr1) {
            System.out.print(n1 + " ");
        }
	}

}
