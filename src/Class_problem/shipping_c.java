package Class_problem;

import java.util.*;
class shipping_c {
	
	public static int shipWithinDays(int []weights,int D,int N) {
		int sum=0;
        for(int i=0;i<N;i++) {
        	sum+=weights[i];
        }
        
        int capacity=sum/D;
        int count=1;;
        
        
        int sum1=0;
        Capacity:
        for(int i=0;i<N;i++) {
       
        	sum1+=weights[i];
        	if(sum1>capacity) {
        		sum1=sum1-weights[i];
        		sum1=0;
        		count++;
        		i--;
        	}
        	if(count==D) {
        		if(i==N-1) {
        			return capacity;
        		}
        		else {
        			capacity++;
        			//System.out.println("*"+i);
        			i=-1;
        			
        			count=0;
        			sum1=0;
        			
        			continue Capacity;
        			
        		}
        	}
        	
        }
        
        return capacity;
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt(); 
            int D = scanner.nextInt(); 
            int[] weights = new int[N];

            for (int i = 0; i < N; i++) {
                weights[i] = scanner.nextInt(); 
            }

            int capacity = shipWithinDays(weights, D,N);
            System.out.println(capacity);
	  
        
	}

}
