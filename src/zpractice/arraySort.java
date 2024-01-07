package zpractice;
import java.util.*;
public class arraySort {

	    public static void main(String[] args) {
	        int n;
	        Scanner s1=new Scanner(System.in);
	        System.out.println("enter the size");
	        n=s1.nextInt();
	        int arr[]=new int [n];
	        for(int i=0;i<n;i++) {
	        	arr[i]=s1.nextInt();
	        }
	        System.out.println("input array");
	        for(int i=0;i<n;i++) {
	        	System.out.print(arr[i]+" ");
	        }
	        for(int i=0;i<n;i++) {
	        	if(arr[i]%2==0) {
	        		int min=arr[i];
	        		for(int j=i;j<n;j++) {
	        			if(arr[j]%2==0) {
	        				if(arr[j]<min) {
		        				int temp=min;
		        				arr[i]=arr[j];
		        				arr[j]=temp;
		        			}
	        			}
	        			
	        		}
	        	}
	        	else {
	        		int max=arr[i];
	        		for(int j=i;j<n;j++) {
	        			if(arr[j]%2!=0) {
	        				if(arr[j]>max) {
		        				int temp=max;
		        				arr[i]=arr[j];
		        				arr[j]=temp;
		        			}
	        			}
	        			
	        		}
	        	}
	        }
	        System.out.println();
	        System.out.println("output array");
	        for(int i=0;i<n;i++) {
	        	System.out.print(arr[i]+" ");
	        }
	        
	    
	}


}
