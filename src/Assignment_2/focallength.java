package Assignment_2;
import java.util.*;
public class focallength {

	public static int focal_length(int R , char Mirror) {
		double r=R;
		double result;
        if (Mirror == '(') {
        	result=r/2;
           System.out.println(result);
           return (int)Math.floor(result);
       } else {
    	   result=-(r/2);
    	   System.out.println(result);
           return (int)Math.floor(result);
       } 


     }

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         int R = scanner.nextInt();
         char Mirror = scanner.next().charAt(0);

        System.out.println(focal_length(R,Mirror));

       }

}
