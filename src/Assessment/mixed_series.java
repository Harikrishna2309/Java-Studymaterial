package Assessment;
                                               //0,1,2,1,4,2,6,6,8,24,10,120
public class mixed_series { 
	static int even1,num=0;  
//1,1,2,6,24,120 //0,2,4,6,8,10
    static void even(int j){
    	//for(int j=n;j<e;j++) {
    	//int j=n;  //j=3
			//if(j%2==0) {
				//even1=j; //even1=0
			//	n++;     //n=3
			System.out.print(j+" ");
			//break;
			
			}
    		
    
    static void second() {
    	int fact=1;
    	if(num==0)
    		fact=1;
    	else {
    	for(int i=1;i<=num;i++) {
    		fact=fact*i;
    	}
    	}
    	num++;
    	System.out.print(fact+" ");
    	
    }
	public static void main(String[] args) {
		//System.out.print("0 ");
		//System.out.print("1 ");
		for(int i=0;i<18;i++) {
			if(i%2==0) {
				even(i);
			}else {
				second();
			}
		}
		
		
		

	}

}
