package zpractice;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class a1b3c6 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the compressed string: ");
	        String inputStr1 = scanner.nextLine();
	        StringBuilder inputStr=new StringBuilder(inputStr1);
	        int lastIndex=inputStr.length()-1;
	        char seclast=inputStr.charAt(lastIndex-1);
	        boolean isseclast=Character.isDigit(seclast);
	        if(!isseclast) {
		        inputStr.append("0");
	        }
	        
	         Pattern p1=Pattern.compile("\\d+");
	         Pattern p2=Pattern.compile("\\D");
	         
	         ArrayList<Character>alph=new ArrayList<>();
	         ArrayList<Integer>digit=new ArrayList<Integer>();
	         	         
	         for(int i=0;i<inputStr.length();i++) {
	             Matcher m1 = p2.matcher(inputStr.substring(i, i+1));
	             if (m1.find()) {
	            	 alph.add(m1.group().charAt(0));
		             Matcher m2 = p1.matcher(inputStr.substring(i+1, i+3));
		             if(m2.find()) {
		            	 digit.add(Integer.parseInt(m2.group()));
		             }

	             } 
	            
	         }

	       System.out.println(alph);
	       if(!isseclast) {
	       int n=digit.size();
	       int x=digit.get(n-1)/10;
	       digit.set(n-1,x);
	       }
	       System.out.println(digit);
	       
	       for(int i=0;i<alph.size();i++) {
	    	   for(int j=0;j<digit.get(i);j++) {
	    		   System.out.print(alph.get(i));
	    	   }
	       }

	        scanner.close();
	    }

}
